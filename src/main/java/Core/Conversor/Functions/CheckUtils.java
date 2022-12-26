package Core.Conversor.Functions;

public class CheckUtils {

    public static String[] varTypes = {"int", "double", "float", "String", "char", "boolean", "long", "short", "byte"};

    public static boolean haveAnyVarType(String line) {
        for (String varType : varTypes) {
            if (line.contains(varType)) {
                return true;
            }
        }
        return false;
    }

}
