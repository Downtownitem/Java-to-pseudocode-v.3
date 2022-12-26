package Core.Conversor.Functions;

import Utilities.Arrays;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.stream.Stream;

public class Filter {

    public static String[] filterText(String text) {
        String[] textArray = text.split("\n");
        AtomicBoolean isCommented = new AtomicBoolean(false);
        ArrayList<Integer> ifElseLines = new ArrayList<>();

        Stream<String> filter = Stream.of(textArray)
                .map(line -> {
                    if (line.contains("//")) {
                        line = line.substring(0, line.indexOf("//"));
                    }

                    if (line.contains("/*") && line.contains("*/")) {
                        line = line.substring(0, line.indexOf("/*")) + line.substring(line.indexOf("*/") + 2);
                    } else if (line.contains("/*")) {
                        line = line.substring(0, line.indexOf("/*"));
                        isCommented.set(true);
                    } else if (line.contains("*/")) {
                        line = line.substring(line.indexOf("*/") + 2);
                        isCommented.set(false);
                    }

                    if (isCommented.get()) {
                        return "";
                    }

                    line = line.trim();
                    return line;
                })
                .filter(line -> !line.equals("") &&
                        !line.contains("Scanner") &&
                        !line.contains("import") &&
                        !line.contains("package") &&
                        !line.contains("class"));

        String[] lines = filter.toArray(String[]::new);
        boolean repeat = false;
        int num = 0;
        int actualIf = 0;
        do {
            repeat = false;

            for (int i = actualIf; i < lines.length; i++) {
                if (lines[i].contains("if") && !lines[i].contains("else")) {
                    actualIf = i;
                }

                if (lines[i].contains("if") && lines[i].contains("else")) {
                    String aux = "if" + lines[i].split("if")[1];
                    lines[i] = "} else {";
                    lines = Arrays.set(lines, i + 1, aux);

                    repeat = true;
                    num++;
                    break;
                } else if (lines[i].contains("}") && !lines[i].contains("else") && num > 0) {
                    for (int j = 0; j < num; j++) {
                        lines = Arrays.set(lines, i + 1, "}");
                    }
                    num = 0;
                    repeat = true;
                    break;
                }
            }

        } while (repeat);

        return Arrays.remove(lines, lines.length - 1);
    }

}
