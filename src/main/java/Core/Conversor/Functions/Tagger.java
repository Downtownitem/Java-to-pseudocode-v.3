package Core.Conversor.Functions;

import Core.Conversor.Models.TaggedText;
import Core.Conversor.Models.Tags;

import java.util.Stack;
import java.util.stream.Stream;

public class Tagger {

    private int actualIndentationLevel;
    private Stack<Tags> endLineStack;
    private Stack<String> functionStack;
    private String scannerVar;
    private String[] functionNames;
    private String[] subroutineNames;

    public String[] getFunctionNames() {
        return functionNames;
    }

    public String[] getSubroutineNames() {
        return subroutineNames;
    }

    public Tagger(String scannerVar) {
        actualIndentationLevel = 0;
        endLineStack = new Stack<>();
        functionStack = new Stack<>();
        this.scannerVar = scannerVar;
    }

    public TaggedText[] tagText(String[] filteredText) {
        TaggedText[] taggedText = new TaggedText[filteredText.length];
        getFunctionNames(filteredText);
        getSubroutineNames(filteredText);

        for (int i = 0; i < filteredText.length; i++) {
            taggedText[i] = identify(filteredText[i]);
        }

        return taggedText;
    }

    private void getFunctionNames(String[] filteredText) {
        functionNames = Stream.of(filteredText)
                .filter(line -> new Checker(line, null, null, null).checkIfFunction())
                .map(Processor::getFunctionName)
                .toArray(String[]::new);
    }

    private void getSubroutineNames(String[] filteredText) {
        subroutineNames = Stream.of(filteredText)
                .filter(line -> new Checker(line, null, null, null).checkIfSubroutine())
                .map(Processor::getFunctionName)
                .toArray(String[]::new);
    }

    private TaggedText identify(String line) {
        Tags tag;
        Checker c = new Checker(line, scannerVar, functionNames, subroutineNames);
        TaggedText taggedText;

        if (c.checkIfMainFunction()) {
            endLineStack.push(Tags.MAIN_FUNCTION_END_LINE);
            taggedText = new TaggedText(line, Tags.MAIN_FUNCTION_START_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfIf()) {
            endLineStack.push(Tags.IF_END_LINE);
            taggedText = new TaggedText(line, Tags.IF_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfElse()) {
            taggedText = new TaggedText(line, Tags.ELSE_LINE, actualIndentationLevel - 1);

        } else if (c.checkIfWhile()) {
            endLineStack.push(Tags.WHILE_END_LINE);
            taggedText = new TaggedText(line, Tags.WHILE_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfFor()) {
            endLineStack.push(Tags.FOR_END_LINE);
            taggedText = new TaggedText(line, Tags.FOR_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfSwitch()) {
            endLineStack.push(Tags.SWITCH_END_LINE);
            taggedText = new TaggedText(line, Tags.SWITCH_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfCase()) {
            taggedText = new TaggedText(line, Tags.CASE_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfDefault()) {
            taggedText = new TaggedText(line, Tags.DEFAULT_LINE, actualIndentationLevel);

        } else if (c.checkIfBreak()) {
            if (endLineStack.peek() == Tags.CASE_END_LINE) {
                taggedText = new TaggedText(line, Tags.CASE_END_LINE, actualIndentationLevel);
                actualIndentationLevel--;
                endLineStack.pop();
            } else {
                taggedText = new TaggedText(line, Tags.BREAK_LINE, actualIndentationLevel);
            }

        } else if (c.checkIfDoWhile()) {
            endLineStack.push(Tags.DO_WHILE_END_LINE);
            taggedText = new TaggedText(line, Tags.DO_WHILE_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfFunction()) {
            endLineStack.push(Tags.FUNCTION_END_LINE);
            functionStack.push(Processor.getFunctionName(line));
            taggedText = new TaggedText(line, Tags.FUNCTION_START_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfSubroutine()) {
            endLineStack.push(Tags.SUBROUTINE_END_LINE);
            functionStack.push(Processor.getFunctionName(line));
            taggedText = new TaggedText(line, Tags.SUBROUTINE_START_LINE, actualIndentationLevel);
            actualIndentationLevel++;

        } else if (c.checkIfFunctionCall()) {
            taggedText = new TaggedText(line, Tags.FUNCTION_CALL_LINE, actualIndentationLevel);

        } else if (c.checkIfSubroutineCall()) {
            taggedText = new TaggedText(line, Tags.SUBROUTINE_CALL_LINE, actualIndentationLevel);

        } else if (c.checkIfOutput()) {
            taggedText = new TaggedText(line, Tags.OUTPUT_LINE, actualIndentationLevel);

        } else if (c.checkIfInput()) {
            taggedText = new TaggedText(line, Tags.INPUT_LINE, actualIndentationLevel);

        } else if (c.checkIfVariableDeclarationAndAssignment()) {
            taggedText = new TaggedText(line, Tags.VARIABLE_DECLARATION_ASSIGNATION, actualIndentationLevel);

        } else if (c.checkIfVariableDeclaration()) {
            taggedText = new TaggedText(line, Tags.VARIABLE_DECLARATION, actualIndentationLevel);

        } else if (c.checkIfVariableAssignment()) {
            taggedText = new TaggedText(line, Tags.VARIABLE_ASSIGNATION, actualIndentationLevel);

        } else if (c.checkIfReturn()) {
            taggedText = new TaggedText(line, Tags.RETURN_LINE, actualIndentationLevel);

        } else if (c.checkIfEnd()) {
            tag = endLineStack.pop();
            actualIndentationLevel--;

            if (tag == Tags.FUNCTION_END_LINE) {
                taggedText = new TaggedText(line, Tags.FUNCTION_END_LINE, actualIndentationLevel, functionStack.pop());
            } else if (tag == Tags.SUBROUTINE_END_LINE) {
                taggedText = new TaggedText(line, Tags.SUBROUTINE_END_LINE, actualIndentationLevel, functionStack.pop());
            } else {
                taggedText = new TaggedText(line, tag, actualIndentationLevel);
            }
        } else {
            taggedText = new TaggedText(line, Tags.STATEMENT_LINE, actualIndentationLevel);
        }

        return taggedText;
    }

}
