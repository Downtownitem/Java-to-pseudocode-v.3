package Core.Conversor.Functions;

import Core.Conversor.Models.TaggedText;
import Core.Conversor.Models.Tags;

public class Processor {

    String scannerVar;

    public Processor(String scannerVar) {
        this.scannerVar = scannerVar;
    }

    public String processAll(TaggedText[] taggedText) {

    }

    public String processLine(TaggedText line) {
        String text = line.getText();
        Tags tag = line.getTag();
        int spaceLevel = line.getIndentationLevel();

        switch (tag) {
            case IF_LINE -> {
                return processIfLine(text, spaceLevel);
            }
            case ELSE_LINE -> {
                return processElseLine(text, spaceLevel);
            }
            case IF_END_LINE -> {
                return processIfEndLine(text, spaceLevel);
            }
            case WHILE_LINE -> {
                return processWhileLine(text, spaceLevel);
            }
            case WHILE_END_LINE -> {
                return processWhileEndLine(text, spaceLevel);
            }
            case FOR_LINE -> {
                return processForLine(text, spaceLevel);
            }
            case FOR_END_LINE -> {
                return processForEndLine(text, spaceLevel);
            }
            case SWITCH_LINE -> {
                return processSwitchLine(text, spaceLevel);
            }
            case SWITCH_END_LINE -> {
                return processSwitchEndLine(text, spaceLevel);
            }
            case CASE_LINE -> {
                return processCaseLine(text, spaceLevel);
            }
            case DEFAULT_LINE -> {
                return processDefaultLine(text, spaceLevel);
            }
            case DO_WHILE_LINE -> {
                return processDoWhileLine(text, spaceLevel);
            }
            case DO_WHILE_END_LINE -> {
                return processDoWhileEndLine(text, spaceLevel);
            }
            case VARIABLE_DECLARATION -> {
                return processVariableDeclaration(text, spaceLevel);
            }
            case VARIABLE_ASSIGNATION -> {
                return processVariableAssignation(text, spaceLevel);
            }
            case VARIABLE_DECLARATION_ASSIGNATION -> {
                return processVariableDeclarationAssignation(text, spaceLevel);
            }
            case STATEMENT_LINE -> {
                return processStatementLine(text, spaceLevel);
            }
            case OUTPUT_LINE -> {
                return processOutputLine(text, spaceLevel);
            }
            case INPUT_LINE -> {
                return processInputLine(text, spaceLevel);
            }
            case MAIN_FUNCTION_START_LINE -> {
                return processMainFunctionStartLine(text, spaceLevel);
            }
            case MAIN_FUNCTION_END_LINE -> {
                return processMainFunctionEndLine(text, spaceLevel);
            }
            case FUNCTION_START_LINE -> {
                return processFunctionStartLine(text, spaceLevel);
            }
            case FUNCTION_END_LINE -> {
                return processFunctionEndLine(text, spaceLevel);
            }
            case RETURN_LINE -> {
                return processReturnLine(text, spaceLevel);
            }
            case FUNCTION_CALL_LINE -> {
                return processFunctionCallLine(text, spaceLevel);
            }
            case SUBROUTINE_START_LINE -> {
                return processSubroutineStartLine(text, spaceLevel);
            }
            case SUBROUTINE_END_LINE -> {
                return processSubroutineEndLine(text, spaceLevel);
            }
            case SUBROUTINE_CALL_LINE -> {
                return processSubroutineCallLine(text, spaceLevel);
            }
        }

        return null;
    }

    public String getFunctionName(String text) {
        String[] words = text.split("\\(")[0].trim().split(" ");
        return words[words.length - 1];
    }

    private String processSubroutineCallLine(String text, int spaceLevel) {
        return null;
    }

    private String processSubroutineEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processSubroutineStartLine(String text, int spaceLevel) {
        return null;
    }

    private String processFunctionCallLine(String text, int spaceLevel) {
        return null;
    }

    private String processReturnLine(String text, int spaceLevel) {
        return null;
    }

    private String processFunctionEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processFunctionStartLine(String text, int spaceLevel) {
        return null;
    }

    private String processMainFunctionEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processMainFunctionStartLine(String text, int spaceLevel) {
        return null;
    }

    private String processInputLine(String text, int spaceLevel) {
        return null;
    }

    private String processOutputLine(String text, int spaceLevel) {
        return null;
    }

    private String processStatementLine(String text, int spaceLevel) {
        return null;
    }

    private String processVariableDeclarationAssignation(String text, int spaceLevel) {
        return null;
    }

    private String processVariableAssignation(String text, int spaceLevel) {
        return null;
    }

    private String processVariableDeclaration(String text, int spaceLevel) {
        return null;
    }

    private String processDoWhileEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processDoWhileLine(String text, int spaceLevel) {
        return null;
    }

    private String processDefaultLine(String text, int spaceLevel) {
        return null;
    }

    private String processCaseLine(String text, int spaceLevel) {
        return null;
    }

    private String processSwitchEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processSwitchLine(String text, int spaceLevel) {
        return null;
    }

    private String processForEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processForLine(String text, int spaceLevel) {
        return null;
    }

    private String processWhileEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processWhileLine(String text, int spaceLevel) {
        return null;
    }

    private String processIfElseEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processIfElseLine(String text, int spaceLevel) {
        return null;
    }

    private String processIfEndLine(String text, int spaceLevel) {
        return null;
    }

    private String processElseLine(String text, int spaceLevel) {
        return null;
    }

    private String processIfLine(String text, int spaceLevel) {
        return null;
    }

}
