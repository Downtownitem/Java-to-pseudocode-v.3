package Core.Conversor.Functions;

public class Checks extends CheckUtils {

    String line;
    String scannerVar;
    String[] functionNames;
    String[] subroutineNames;

    public Checks(String line, String scannerVar, String[] functionNames, String[] subroutineNames) {
        this.line = line;
        this.scannerVar = scannerVar;
        this.functionNames = functionNames;
        this.subroutineNames = subroutineNames;
    }

    public boolean checkIfEnd() {
        return line.contains("}");
    }

    public boolean checkIfIf() {
        return line.contains("if") && !line.contains("else");
    }

    public boolean checkIfElse() {
        return line.contains("else") && !line.contains("if");
    }

    public boolean checkIfIfElse() {
        return line.contains("if") && line.contains("else");
    }

    public boolean checkIfWhile() {
        return line.contains("while") && !line.contains("}");
    }

    public boolean checkIfFor() {
        return line.contains("for");
    }

    public boolean checkIfSwitch() {
        return line.contains("switch");
    }

    public boolean checkIfCase() {
        return line.contains("case");
    }

    public boolean checkIfDefault() {
        return line.contains("default");
    }

    public boolean checkIfDoWhile() {
        return line.contains("do") && line.contains("{");
    }

    public boolean checkIfVariableDeclaration() {
        return haveAnyVarType(line) && !line.contains("=") && !line.contains("(") && !line.contains(")") && !line.contains("{");
    }

    public boolean checkIfVariableAssignment() {
        return !haveAnyVarType(line) && line.contains("=");
    }

    public boolean checkIfVariableDeclarationAndAssignment() {
        return haveAnyVarType(line) && line.contains("=");
    }

    public boolean checkIfInput() {
        return line.contains(scannerVar + ".next");
    }

    public boolean checkIfOutput() {
        return line.contains("System.out.println") || line.contains("System.out.print");
    }

    public boolean checkIfMainFunction() {
        return line.contains("public") && line.contains("static") && line.contains("void") && line.contains("main") && line.contains("String") && line.contains("args") && line.contains("[]");
    }

    public boolean checkIfFunction() {
        if (line.contains("(") && line.contains(")") && line.contains("{")) {
            String[] parts = line.split("\\(")[0].split(" ");
            for (int i = 0; i < parts.length - 1; i++) {
                if (haveAnyVarType(parts[i])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public boolean checkIfReturn() {
        return line.contains("return");
    }

    public boolean checkIfFunctionCall() {
        boolean con = false;
        for (String functionName : functionNames) {
            if (line.contains(functionName + "(")) {
                con = true;
                break;
            }
        }
        return con;
    }

    public boolean checkIfSubroutine() {
        return line.contains("void") && line.contains("(") && line.contains(")") && line.contains("{") && !checkIfMainFunction();
    }

    public boolean checkIfSubroutineCall() {
        boolean con = false;
        for (String subroutineName : subroutineNames) {
            if (line.contains(subroutineName + "(")) {
                con = true;
                break;
            }
        }
        return con;
    }

    public boolean checkIfBreak() {
        return line.contains("break");
    }

}
