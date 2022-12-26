package Utilities;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/**
 * Class to manage the logs of the program
 *
 * @version 18.0.1
 * @since 2022-06-12
 */

public class Logs {

    /**
     * Variable to store the route of the log files
     */
    public static String LogsFolderRoute = "";

    /**
     * Function that returns the current date as a String in the format DD_MM_YYYY
     *
     * @return String with the current date
     */
    public static String getNumberedDate() {
        // Get the current date and time and format it to a string to be used as the file name

        Date date = new Date();
        String day = String.valueOf(date).split(" ")[2]; // Str.
        String month = String.valueOf(date).split(" ")[1];
        String year = String.valueOf(date).split(" ")[5];

        // Traduce the month to a number
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (int i = 0; i < months.length; i++) {
            if (months[i].equals(month)) {
                month = String.valueOf(i + 1);
                break;
            }
        }

        // Add 0 if the month is less than 10
        if (month.length() == 1) {
            month = "0" + month;
        }

        // Returns the file name
        return day + "_" + month + "_" + year;
    }

    /**
     * Function that create the log's folder
     * Takes the route from the Properties class
     *
     * @see Programs.Properties
     */
    public static void createFolder() {
        // Create a folder to store the logs file in

        File folder = new File(LogsFolderRoute);
        folder.mkdir();
    }

    /**
     * Function that creates a new log file with the current date as the name
     */
    private static Object[] createFile() {
        /*
         Create a file to store the logs in,
         and returns if the file was created successfully or not and the file route
         */

        String route = LogsFolderRoute + getNumberedDate() + ".txt";
        File file = new File(route);
        if (file.exists()) {
            return new Object[]{true, route};
        } else {
            try {
                file.createNewFile();

                // When file is created successfully, write on it the actual date
                try {
                    String[] date = String.valueOf(new Date()).split(" ");
                    String write = date[0] + " " + date[1] + " " + date[2] + " " + date[4] + " " + date[5];
                    FileWriter fw = new FileWriter(route); //Writer
                    fw.write(write);
                    fw.close();
                    return new Object[]{true, route};
                } catch (IOException e) {
                    return new Object[]{false, route};
                }
            } catch (IOException ex) {
                return new Object[]{false, route};
            }
        }
    }

    /**
     * Function that writes a message in the log file with the current date and time
     *
     * @param msg String with the message to write
     */
    public static void log(String msg) {
        // Log a message to the logs file

        Object[] creation = createFile();

        // If the file was created successfully, continue
        if ((boolean) creation[0]) {

            // Read the file with the route provided
            String text = "";
            try {
                File logfile = new File((String) creation[1]);
                Scanner in = new Scanner(logfile);
                boolean con = true;
                while (in.hasNextLine()) {
                    if (con) {
                        text = in.nextLine();
                        con = false;
                    } else {
                        text = text + "\n" + in.nextLine();
                    }
                }
            } catch (FileNotFoundException p) {
                System.out.println("An error occurred.");
            }

            // Add the log to the readed text
            text = text + "\n[" + String.valueOf(new Date()).split(" ")[3] + "] " + msg;

            // Write the file with the new log
            try {
                File file = new File((String) creation[1]);
                FileWriter writer = new FileWriter(file);
                writer.write(text);
                writer.close();
            } catch (IOException ex) {
                System.out.println("An error occurred.");
            }

        } else {
            System.out.println("An error occurred.");
        }
    }

}
