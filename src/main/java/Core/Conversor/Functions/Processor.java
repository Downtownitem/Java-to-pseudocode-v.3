package Core.Conversor.Functions;

import Core.Conversor.Models.TaggedText;
import Core.Conversor.Models.Tags;

import java.util.ArrayList;

public class Processor {

    String scannerVar;

    public Processor(String scannerVar) {
        this.scannerVar = scannerVar;
    }

    public String processAll(TaggedText[] taggedText) {
        ArrayList<String> processedText = new ArrayList<>();

        for (int i = 0; i < taggedText.length; i++) {
            Tags tag = taggedText[i].getTag();
            String processedLine = processLine(taggedText[i]);

            if (i == 0) {
                processedText.add(processedLine);

            } else {
                if (!processedText.get(processedText.size() - 1).equals("") && (tag == Tags.FUNCTION_START_LINE || tag == Tags.WHILE_LINE || tag == Tags.IF_LINE || tag == Tags.FOR_LINE || tag == Tags.SWITCH_LINE || tag == Tags.DO_WHILE_LINE || tag == Tags.SUBROUTINE_START_LINE || tag == Tags.MAIN_FUNCTION_START_LINE)) {
                    processedText.add("");
                    processedText.add(processedLine);

                } else if (tag == Tags.FUNCTION_END_LINE || tag == Tags.WHILE_END_LINE || tag == Tags.IF_END_LINE || tag == Tags.FOR_END_LINE || tag == Tags.SWITCH_END_LINE || tag == Tags.DO_WHILE_END_LINE || tag == Tags.SUBROUTINE_END_LINE || tag == Tags.CASE_END_LINE || tag == Tags.MAIN_FUNCTION_END_LINE) {
                    processedText.add(processedLine);
                    processedText.add("");

                } else {
                    processedText.add(processedLine);
                }
            }
        }

        String text = "";
        for (int i = 0; i < processedText.size(); i++) {
            if (i == 0) {
                text += processedText.get(i);
            } else {
                text += "\n" + processedText.get(i);
            }
        }

        return text;
    }

    public String processLine(TaggedText line) {
        String text = line.getText();
        Tags tag = line.getTag();
        int spaceLevel = line.getIndentationLevel();
        String property = line.getProperty();

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
                return processFunctionEndLine(text, spaceLevel, property);
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
                return processSubroutineEndLine(text, spaceLevel, property);
            }
            case SUBROUTINE_CALL_LINE -> {
                return processSubroutineCallLine(text, spaceLevel);
            }
        }

        return null;
    }

    public static String getFunctionName(String text) {
        String[] words = text.split("\\(")[0].trim().split(" ");
        return words[words.length - 1];
    }

    private static String getIndentation(int spaceLevel) {
        return "\t".repeat(spaceLevel);
    }

    private String processIfLine(String text, int spaceLevel) {
        String finalText = text
                .replace("if", "Si")
                .replace("{", "Entonces")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processElseLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "Sino";
    }

    private String processIfEndLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "FinSi";
    }

    private String processWhileLine(String text, int spaceLevel) {
        String finalText = text
                .replace("while", "Mientras que")
                .replace("{", "Hacer")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processWhileEndLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "FinMientrasQue";
    }

    private String processForLine(String text, int spaceLevel) {
        String finalText = text
                .replace("for", "Para")
                .replace("{", "Hacer")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processForEndLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "FinPara";
    }

    private String processSwitchLine(String text, int spaceLevel) {
        String finalText = text
                .replace("switch", "Dependiendo de")
                .replace("{", "Hacer")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processSwitchEndLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "FinDependiendoDe";
    }

    private String processCaseLine(String text, int spaceLevel) {
        String finalText = text
                .replace("case", "Caso")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processDefaultLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "CasoDefecto:";
    }

    private String processDoWhileLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "Hacer";
    }

    private String processDoWhileEndLine(String text, int spaceLevel) {
        String finalText = text
                .replace("}", "")
                .trim()
                .replace("while", "Hasta (no")
                .replace("||", "|")
                .replace("|", "o")
                .replace("&&", "&")
                .replace("&", "y")
                .replace("==", "=")
                .replace("!=", "<>");

        return getIndentation(spaceLevel) + finalText + ")";
    }

    private String processVariableDeclaration(String text, int spaceLevel) {
        String finalText = text
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico")
                .replace(";", "")
                .replace("=", "<-");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processVariableAssignation(String text, int spaceLevel) {
        String finalText = text
                .replace("=", "<-")
                .replace(";", "");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processVariableDeclarationAssignation(String text, int spaceLevel) {
        String finalText = text
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico")
                .replace(";", "")
                .replace("=", "<-");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processStatementLine(String text, int spaceLevel) {
        String finalText = text
                .replace("=", "<-")
                .replace(";", "");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processOutputLine(String text, int spaceLevel) {
        String finalText = text
                .replace("System.out.println (", "Escribir ")
                .replace("System.out.println(", "Escribir ")
                .replace("System.out.print (", "Escribir ")
                .replace("System.out.print(", "Escribir ")
                .replace(");", "");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processInputLine(String text, int spaceLevel) {
        String finalText = text
                .split("=")[0]
                .trim();

        if (finalText.contains(" ") && CheckUtils.haveAnyVarType(finalText)) {
            String[] parts = finalText.split(" ");
            String varType = parts[0]
                    .replace("int", "Entero")
                    .replace("double", "Decimal")
                    .replace("float", "Decimal")
                    .replace("char", "Caracter")
                    .replace("String", "Cadena")
                    .replace("boolean", "Logico");

            String varName = parts[1];

            return getIndentation(spaceLevel) + varType + " " + varName + "\n" + getIndentation(spaceLevel) + "Leer " + varName;
        } else {
            return getIndentation(spaceLevel) + "Leer " + finalText;
        }
    }

    private String processMainFunctionStartLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "Inicio";
    }

    private String processMainFunctionEndLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + "Fin";
    }

    private String processFunctionStartLine(String text, int spaceLevel) {
        String finalText = text
                .replace("public", "")
                .replace("static", "")
                .replace("void", "")
                .replace(")", "")
                .replace("{", "")
                .trim();

        String[] parts = finalText.split("\\(");

        String varType = parts[0]
                .split(" ")[0]
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico");

        String functionName = getFunctionName(text);

        String functionParameters = parts[1]
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico");

        return getIndentation(spaceLevel) + varType + " " + functionName + "(" + functionParameters + ")";
    }

    private String processFunctionEndLine(String text, int spaceLevel, String property) {
        return getIndentation(spaceLevel) + "Fin " + property;
    }

    private String processReturnLine(String text, int spaceLevel) {
        String finalText = text
                .replace("return", "Retornar")
                .replace(";", "");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processFunctionCallLine(String text, int spaceLevel) {
        String finalText = text
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico")
                .replace("=", "<-")
                .replace(";", "");

        return getIndentation(spaceLevel) + finalText;
    }

    private String processSubroutineStartLine(String text, int spaceLevel) {
        String finalText = text
                .replace("public", "")
                .replace("static", "")
                .replace("void", "")
                .replace(")", "")
                .replace("{", "")
                .trim();

        String[] parts = finalText.split("\\(");

        String functionParameters = parts[1]
                .replace("int", "Entero")
                .replace("double", "Decimal")
                .replace("float", "Decimal")
                .replace("char", "Caracter")
                .replace("String", "Cadena")
                .replace("boolean", "Logico");

        return getIndentation(spaceLevel) + "Subrutina " + parts[0] + "(" + functionParameters + ")";
    }

    private String processSubroutineEndLine(String text, int spaceLevel, String property) {
        return getIndentation(spaceLevel) + "Fin " + property;
    }

    private String processSubroutineCallLine(String text, int spaceLevel) {
        return getIndentation(spaceLevel) + text.replace(";", "");
    }

}
