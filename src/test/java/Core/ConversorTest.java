package Core;

import Core.Conversor.Conversor;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConversorTest {

    String code1 =
            "import java.util.Scanner;\n" +
            "public class Main {\n" +
            "    public static void main(String[] args) {\n" +
            "        Scanner testVariable = new Scanner(System.in);\n" +
            "        int a = scanner.nextInt();\n" +
            "        int b = scanner.nextInt();\n" +
            "        System.out.println(a + b);\n" +
            "    }\n" +
            "}";

    String code2 = "package asi_si_o_no_bucles;\n" +
            "\n" +
            "import java.util.Scanner;\n" +
            "\n" +
            "public class Asi_Si_o_No_Bucles {\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        // VARIABLES Y FUNCIONES\n" +
            "        Scanner in = new Scanner(System.in);\n" +
            "        int it = 0, num, ceros = 0, pares = 0, impares = 0;\n" +
            "        boolean con = false;\n" +
            "        double prom = 0;\n" +
            "        String texto = \"\";\n" +
            "        String[] hola2 = new String[1];\n" +
            "        \n" +
            "        // PROCESO\n" +
            "        while (it < 10) {\n" +
            "            System.out.print(\"Ingrese el \" + (it + 1) + \"° valor: \");\n" +
            "            num = in.nextInt();\n" +
            "            if (num < 0) {\n" +
            "                con = true;\n" +
            "                it = 11;\n" +
            "            } else if (num == 0) {\n" +
            "                ceros++;\n" +
            "            } else if (num % 2 == 0) {\n" +
            "                pares++;\n" +
            "            } else {\n" +
            "                impares++;\n" +
            "            }\n" +
            "\n" +
            "            int n = 1;\n" +
            "            String[] hola= new String[n];\n" +
            "            String[] adios = new String[1];\n" +
            "            \n" +
            "            for (int i = 0; i < 10; i++) {\n" +
            "                System.out.println(\"Hola\");\n" +
            "            }\n" +
            "            \n" +
            "            prom = prom + num;\n" +
            "\n" +
            "            if (it == 9) {\n" +
            "                texto = texto + num;\n" +
            "            } else {\n" +
            "                texto = texto + num + \", \";\n" +
            "            }\n" +
            "            it++; // TEST IF THIS WORKS\n" +
            "        }\n" +
            "        /*\n" +
            "        TESTING IF COMMENT FILTER WORKS\n" +
            "        */\n" +
            "        // OUTPUTS\n" +
            "        if (con) { /* comment */\n" +
            "            System.out.println(\"Numero invalido, el numero \" + it + \" tiene que ser entero positivo\");\n" +
            "        } else {\n" +
            "            prom = prom / 10.0;\n" +
            "            System.out.println(\"\\n\" + \"Los numeros \" + texto + \" tienen:\");\n" +
            "            System.out.println(\"Promedio: \" + prom);\n" +
            "            System.out.println(\"Ceros: \" + ceros);\n" +
            "            System.out.println(\"Pares: \" + pares);\n" +
            "            System.out.println(\"impares: \" + impares);\n" +
            "            String[] test = new String[1];\n" +
            "            if (prom % 3 == 0) {\n" +
            "                System.out.println(\"y su promedio es divisible entre 3\");\n" +
            "            } else {\n" +
            "                System.out.println(\"y su promedio no es divisible entre 3\");\n" +
            "            }\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "}\n";

    String code3 =
            "package asi_si_o_no_bucles;\n" +
            "\n" +
            "import java.util.Scanner;\n" +
            "\n" +
            "public class Asi_Si_o_No_Bucles {\n" +
            "    \n" +
            "    void NombreSubrutina1 (String hola) {\n" +
            "        System.out.println(\"Hola que tal\");\n" +
            "    }\n" +
            "\n" +
            "    int add(int num1, int num2) {\n" +
            "        return num1 + num2;\n" +
            "    }\n" +
            "\n" +
            "    public static void main(String[] args) {\n" +
            "        // VARIABLES Y FUNCIONES\n" +
            "        Scanner in = new Scanner(System.in);\n" +
            "        int it = 0, num, ceros = 0, pares = 0, impares = 0;\n" +
            "        boolean con = false;\n" +
            "        double prom = 0;\n" +
            "        String texto = \"\";\n" +
            "        String[] hola2 = new String[1];\n" +
            "        \n" +
            "        // PROCESO\n" +
            "        while (it < 10) {\n" +
            "            System.out.print(\"Ingrese el \" + (it + 1) + \"° valor: \");\n" +
            "            num = in.nextInt();\n" +
            "            if (num < 0) {\n" +
            "                con = true;\n" +
            "                it = 11;\n" +
            "            } else if (num == 0) {\n" +
            "                ceros++;\n" +
            "            } else if (num % 2 == 0) {\n" +
            "                pares++;\n" +
            "            } else {\n" +
            "                impares++;\n" +
            "            }\n" +
            "\n" +
            "            int n = 1;\n" +
            "            String[] hola= new String[n];\n" +
            "            String[] adios = new String[1];\n" +
            "            System.out.println(\"Hola\");\n" +
            "            for (int i = 0; i < 10; i++) {\n" +
            "                System.out.println(\"Hola\");\n" +
            "            }\n" +
            "            \n" +
            "            prom = prom + num;\n" +
            "\n" +
            "            if (it == 9) {\n" +
            "                texto = texto + num;\n" +
            "            } else {\n" +
            "                texto = texto + num + \", \";\n" +
            "            }\n" +
            "            it++;\n" +
            "        }\n" +
            "        // OUTPUTS\n" +
            "        if (con) {\n" +
            "            System.out.println(\"Numero invalido, el numero \" + it + \" tiene que ser entero positivo\");\n" +
            "        } else {\n" +
            "            prom = prom / 10.0;\n" +
            "            System.out.println(\"\\n\" + \"Los numeros \" + texto + \" tienen:\");\n" +
            "            System.out.println(\"Promedio: \" + prom);\n" +
            "            System.out.println(\"Ceros: \" + ceros);\n" +
            "            System.out.println(\"Pares: \" + pares);\n" +
            "            System.out.println(\"impares: \" + impares);\n" +
            "            String[] test = new String[1];\n" +
            "            if (prom % 3 == 0) {\n" +
            "                System.out.println(\"y su promedio es divisible entre 3\");\n" +
            "            } else {\n" +
            "                System.out.println(\"y su promedio no es divisible entre 3\");\n" +
            "            }\n" +
            "\n" +
            "        }\n" +
            "\n" +
            "    }\n" +
            "\n" +
            "    int substract(int num1, int num2) {\n" +
            "        return num1 - num2;\n" +
            "    }\n" +
            "\n" +
            "    void printLine(String line) {\n" +
            "        System.out.println(line);\n" +
            "    }\n" +
            "\n" +
            "}\n";

    @Test
    public void searchScannerVar() {
        Conversor conversor = new Conversor(code1);
        conversor.searchScannerVar();
        assertEquals("testVariable", conversor.getScannerVar());
    }

    @Test
    public void searchScannerVar2() {
        Conversor conversor = new Conversor(code2);
        conversor.searchScannerVar();
        assertEquals("in", conversor.getScannerVar());
    }

    @Test
    public void convertTheCode() {
        Conversor c = new Conversor(code3);
        c.convert();
    }

}