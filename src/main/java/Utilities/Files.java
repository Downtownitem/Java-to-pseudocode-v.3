package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * Class containing all the shortened methods to control files
 *
 * @version 18.0.1
 * @since 2022-06-12
 */

public class Files {

    /**
     * Variable to store the actual folder path
     */
    private static String actualFolder = "";
    /**
     * Variable to store the actual file path
     */
    public static String FilesPath = "";

    /**
     * Method to read a file
     *
     * @param name String with the name of the file
     * @return String with the content of the file
     */
    public static String read(String name) {
        StringBuilder sb = new StringBuilder();
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = true;
            while (in.hasNextLine()) {
                if (con) {
                    con = false;
                } else {
                    sb.append("\n");
                }
                sb.append(in.nextLine());
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return String.valueOf(sb);
    }

    /**
     * Method to overwrite a file
     *
     * @param name String with the name of the file
     * @param text String with the text to write in the file
     */
    public static void write(String name, String text) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        try {
            FileWriter fw = new FileWriter(route); //Writer
            fw.write(text);
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    /**
     * Method to append a text to a file
     *
     * @param name String with the name of the file
     * @param text String with the text to append to the file
     */
    public static void append(String name, String text) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        String actualText = read(name) + "\n" + text;
        try {
            FileWriter fw = new FileWriter(route); //Writer
            fw.write(actualText);
            fw.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }

    /**
     * Method to create a file
     *
     * @param name String with the name of the file
     * @return boolean with the result of the creation
     */
    public static boolean createFile(String name) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route

        File file = new File(route);

        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            return false;
        }
        return true;
    }

    /**
     * Method to create a folder
     *
     * @param name String with the name of the folder
     */
    public static void createFolder(String name) {
        String route = FilesPath + name + "/"; //File route

        File file = new File(route);

        file.mkdirs();
    }

    /**
     * Method to set the actual folder
     *
     * @param name String with the name of the folder
     */
    public static boolean setFolder(String name) {
        String route = FilesPath + name + "/"; //File route
        File file = new File(route);

        if (name.equalsIgnoreCase("files") || name.equalsIgnoreCase("main")) {
            actualFolder = "";
        }

        if (file.exists()) {
            actualFolder = name + "/";
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method to delete a file
     *
     * @param name String with the name of the file
     */
    public static boolean delete(String name) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        try {
            File file = new File(route); //Object
            file.delete();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            return false;
        }
        return true;
    }

    /**
     * Method that returns if a file exists
     *
     * @param name String with the name of the file
     * @return boolean with the result of the existence
     */
    public static boolean exists(String name) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        File file = new File(route); //Object
        return file.exists();
    }

    /**
     * Method to read just a specific line of a file
     *
     * @param name String with the name of the file
     * @param line int with the line to read (starting in 1)
     * @return String with the content of the line
     */
    public static String readLine(String name, int line) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        String text = ""; //Readed data
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = true;
            while (in.hasNextLine() && con) {
                if (linecount == line) {
                    text = in.nextLine();
                    con = false;
                } else {
                    in.nextLine();
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return text;
    }

    /**
     * Method that read from the start until a specific line of a file
     *
     * @param name String with the name of the file
     * @param stop int with the line to stop (starting in 1)
     * @return String with the readed data
     */
    public static String readUntil(String name, String stop) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder(); //Readed data
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = true, first = true;
            while (in.hasNextLine() && con) {
                String actualLine = in.nextLine();
                if (actualLine.equals(stop)) {
                    con = false;
                } else {
                    if (first) {
                        first = false;
                    } else {
                        sb.append("\n");
                    }
                    sb.append(actualLine);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return String.valueOf(sb);
    }

    /**
     * Method that read from a specific line until the end of a file
     *
     * @param name String with the name of the file
     * @param start int with the line to start (starting in 1)
     * @return String with the readed data
     */
    public static String readSince(String name, String start) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder(); //Readed data
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = false, first = true;
            while (in.hasNextLine()) {
                String actualLine = in.nextLine();
                if (actualLine.equals(start)) {
                    con = true;
                    continue;
                }
                if (con) {
                    if (first) {
                        first = false;
                    } else {
                        sb.append("\n");
                    }
                    sb.append(actualLine);
                }
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return String.valueOf(sb);
    }

    /**
     * Method that overwrite a specific line of a file
     *
     * @param name String with the name of the file
     * @param line int with the line to overwrite (starting in 1)
     * @param text String with the text to overwrite
     */
    public static void writeLine(String name, int line, String text) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder();
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean first = true;
            while (in.hasNextLine()) {
                if (linecount == line) {
                    if (first) {
                        sb.append(text);
                        first = false;
                    } else {
                        sb.append("\n" + text);
                    }
                    in.nextLine();
                } else {
                    if (first) {
                        first = false;
                    } else {
                        sb.append("\n");
                    }
                    sb.append(in.nextLine());
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        write(name, String.valueOf(sb));
    }

    /**
     * Method that deletes a specific line of a file and moves the rest of the lines up
     *
     * @param name String with the name of the folder
     * @param line int with the line to overwrite (starting in 1)
     */
    public static void deleteLine(String name, int line) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder();
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean first = true;
            while (in.hasNextLine()) {
                if (linecount == line) {
                    in.nextLine();
                } else {
                    if (first) {
                        first = false;
                    } else {
                        sb.append("\n");
                    }
                    sb.append(in.nextLine());
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        write(name, String.valueOf(sb));
    }

    /**
     * Method that return the content of several lines of a file as a paragraph
     *
     * @param name String with the name of the file
     * @param lines int[] with the lines to read (starting in 1)
     * @return String with the readed data
     */
    public static String readLines(String name, int[] lines) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder(); //Readed data
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = true, first = true;
            while (in.hasNextLine()) {
                if (Arrays.contains(lines, linecount)) {
                    if (first) {
                        sb.append(in.nextLine());
                        first = false;
                    } else {
                        sb.append("\n" + in.nextLine());
                    }
                } else {
                    in.nextLine();
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return String.valueOf(sb);
    }

    /**
     * Method that return the content of several lines of a file as a array
     *
     * @param name String with the name of the file
     * @param lines int[] with the lines to read (starting in 1)
     * @return String[] with the data of each line in the specified order
     */
    public static String[] readLinesArray(String name, int[] lines) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        String[] linesArray = new String[lines.length];
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean con = true;
            int index = 0;
            while (in.hasNextLine()) {
                if (Arrays.contains(lines, linecount)) {
                    linesArray[index] = in.nextLine();
                    index++;
                } else {
                    in.nextLine();
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        return linesArray;
    }

    /**
     * Method that delete several lines of a file and moves the rest of the lines up
     *
     * @param name String with the name of the file
     * @param lines int[] with the lines to delete (starting in 1)
     */
    public static void deleteLines(String name, int[] lines) {
        String route = FilesPath + actualFolder + name + ".txt"; //File route
        StringBuilder sb = new StringBuilder();
        int linecount = 1;
        try {
            File file = new File(route); //Object
            Scanner in = new Scanner(file); //Reader
            boolean first = true;
            while (in.hasNextLine()) {
                if (Arrays.contains(lines, linecount)) {
                    in.nextLine();
                } else {
                    if (first) {
                        first = false;
                    } else {
                        sb.append("\n");
                    }
                    sb.append(in.nextLine());
                }
                linecount++;
            }
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        write(name, String.valueOf(sb));
    }

}
