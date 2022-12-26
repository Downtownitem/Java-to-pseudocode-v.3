package Utilities;

import java.util.Arrays;

/**
 * DataBases based in files imitation
 * DataBase Structure:
 * First line: column count
 * Second line: actual row count, start from 0
 * Next lines: column names, one name in each line ending with ;;;
 * Next lines: rows data, one row in each line ending with ;
 * <p>
 * Example:
 * 3      --> Column count
 * 2      --> Actual row count
 * Name   --> Column name
 * Age    --> Column name
 * Salary --> Column name
 * ;;;    --> Column names end
 * John   --> Row 1 data
 * 25     --> Row 1 data
 * 1000   --> Row 1 data
 * ;      --> Row end
 * Jane   --> Row 2 data
 * 30     --> Row 2 data
 * 2000   --> Row 2 data
 * ;      --> Row end
 * <p>
 * IMPORTANT:
 * The indexes of the columns and rows start from 1 so every method that returns an index will add 1 to it
 * This also applies to the methods that receive an index as a parameter, so you have to add 1 to it
 *
 * @author Daniel Martinez
 * @version 18
 */

public class DataBases {

    /**
     * Create a new DataBase file with the standard structure
     *
     * @param DataBaseName Name of the DataBase file
     * @param columns      A String array with the names of the columns
     */
    public static void create(String DataBaseName, String[] columns) {
        if (!Files.exists(DataBaseName)) {
            Files.createFile(DataBaseName);

            StringBuilder text = new StringBuilder(columns.length + "\n0");
            for (String column : columns) {
                text.append("\n").append(column);
            }
            text.append("\n;;;");

            Files.write(DataBaseName, text.toString());
        }
    }

    /**
     * Delete a DataBase file
     *
     * @param DataBaseName Name of the DataBase file
     */
    public static void delete(String DataBaseName) {
        Files.delete(DataBaseName);
    }

    /**
     * Update the DataBase file with a new configuration
     *
     * @param DataBaseName Name of the DataBase to update
     * @param columns      A String array with the names of the new columns
     */
    public static void update(String DataBaseName, String[] columns) {
        String actualData = readData(DataBaseName);

        StringBuilder text = new StringBuilder(columns.length + "\n0");
        for (String column : columns) {
            text.append("\n").append(column);
        }
        text.append("\n;;;\n").append(actualData);

        Files.write(DataBaseName, text.toString());
    }

    /**
     * Read the data of a DataBase file without the structure
     *
     * @param DataBaseName Name of the DataBase file
     * @return A String with the data of the DataBase file
     */
    private static String readData(String DataBaseName) {
        return Files.readSince(DataBaseName, ";;;");
    }

    /**
     * Add a new row to the DataBase table, the row will be added at the end of the table and the row count will be updated
     *
     * @param DataBaseName Name of the DataBase file
     * @param row          A String array with the data of the new row, the length of the array must be the same as the column count, the data will be added in the same order as the columns
     */
    public static void addRow(String DataBaseName, String[] row) {
        if (Integer.parseInt(Files.readLine(DataBaseName, 1)) == row.length) {

            StringBuilder data = new StringBuilder();
            boolean first = true;
            for (String s : row) {
                if (first) {
                    first = false;
                } else {
                    data.append("\n");
                }
                data.append(s);
            }
            data.append("\n;");

            Files.append(DataBaseName, data.toString());
            int rowPlus = Integer.parseInt(Files.readLine(DataBaseName, 2)) + 1;
            Files.writeLine(DataBaseName, 2, String.valueOf(rowPlus));

        } else {
            System.out.println("Column count doesn't match array length.");
        }
    }

    /**
     * Remove a row from the DataBase table, the row count will be updated
     *
     * @param DataBaseName Name of the DataBase file
     * @param row          The index of the row to remove
     */
    public static void removeRow(String DataBaseName, int row) {
        int totalRows = Integer.parseInt(Files.readLine(DataBaseName, 2));
        if (row > totalRows) {
            System.out.println("Row not removed");
        } else {
            row = row - 1;
            int totalColumns = Integer.parseInt(Files.readLine(DataBaseName, 1));
            int startRow = 2 + totalColumns + 2 + (row * (totalColumns + 1));
            int endRow = startRow + totalColumns;
            int[] rows = new int[endRow - startRow + 1];
            int index = 0;
            for (int i = startRow; i <= endRow; i++) {
                rows[index] = i;
                index++;
            }
            Files.deleteLines(DataBaseName, rows);

            int rowPlus = Integer.parseInt(Files.readLine(DataBaseName, 2)) - 1;
            Files.writeLine(DataBaseName, 2, String.valueOf(rowPlus));
        }
    }

    /**
     * Get the data of a row from the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @param row          The index of the row to get
     * @return A String array with the data of the row
     */
    public static String[] getRow(String DataBaseName, int row) {
        int totalRows = Integer.parseInt(Files.readLine(DataBaseName, 2));
        if (row > totalRows) {
            System.out.println("Row not removed");
            return new String[0];
        } else {
            row = row - 1;
            int totalColumns = Integer.parseInt(Files.readLine(DataBaseName, 1));
            int startRow = 2 + totalColumns + 2 + (row * (totalColumns + 1));
            int endRow = startRow + totalColumns - 1;
            String[] rows = new String[totalColumns];
            int index = 0;
            for (int i = startRow; i <= endRow; i++) {
                rows[index] = Files.readLine(DataBaseName, i);
                index++;
            }
            return rows;
        }
    }

    /**
     * Get the data of a last row from the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @return A String array with the data of the row
     */
    public static String[] getLastRow(String DataBaseName) {
        return getRow(DataBaseName, getRowCount(DataBaseName));
    }

    /**
     * Get the whole database table
     *
     * @param DataBaseName Name of the DataBase file
     * @return A String array[][] with all the rows of the table
     */
    public static String[][] getDataBase(String DataBaseName) {
        int columns = Integer.parseInt(Files.readLine(DataBaseName, 1));
        int rows = Integer.parseInt(Files.readLine(DataBaseName, 2));
        String[][] dataBase = new String[rows][columns];
        for (int i = 0; i < rows; i++) {
            dataBase[i] = getRow(DataBaseName, i + 1);
        }
        return dataBase;
    }

    /**
     * Prints the whole database table including the column names
     *
     * @param DataBaseName Name of the DataBase file
     */
    public static void printDataBase(String DataBaseName) {
        System.out.println("Columns: " + Arrays.toString(getColumnNames(DataBaseName)));
        System.out.println(Arrays.toString(getDataBase(DataBaseName)));
    }

    /**
     * Get the names of the columns of the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @return A String array with the names of the columns
     */
    public static String[] getColumnNames(String DataBaseName) {
        int columns = Integer.parseInt(Files.readLine(DataBaseName, 1));
        int[] columnsArray = new int[columns];
        int index = 0;
        for (int i = 3; i < columnsArray.length + 3; i++) {
            columnsArray[index] = i;
            index++;
        }
        return Files.readLinesArray(DataBaseName, columnsArray);
    }

    /**
     * Get the count of columns of the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @return An int with the number of columns
     */
    public static int getColumnCount(String DataBaseName) {
        return Integer.parseInt(Files.readLine(DataBaseName, 1));
    }

    /**
     * Get the count of rows of the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @return An int with the number of rows
     */
    public static int getRowCount(String DataBaseName) {
        return Integer.parseInt(Files.readLine(DataBaseName, 2));
    }

    /**
     * Get the data of a column from the DataBase table
     *
     * @param DataBaseName Name of the DataBase file
     * @param columnName   The name of the column to get
     * @return A String array with the data of the column
     */
    public static String[] getColumn(String DataBaseName, String columnName) {
        String[] columnNames = getColumnNames(DataBaseName);
        if (Utilities.Arrays.contains(columnNames, columnName)) {
            int columns = getColumnCount(DataBaseName), rows = getRowCount(DataBaseName);
            int[] columnsArray = new int[rows];
            int columnIndex = Utilities.Arrays.indexOf(columnNames, columnName);
            int index = 4 + columns + columnIndex;
            for (int i = 0; i < rows; i++) {
                columnsArray[i] = index;
                index += columns + 1;
            }
            return Files.readLinesArray(DataBaseName, columnsArray);
        } else {
            System.out.println("Column not found");
            return new String[0];
        }

    }

    /**
     * Get a row from the DataBase table where the column name is equal to the value given
     *
     * @param DataBaseName Name of the DataBase file
     * @param columnName   The name of the column to search
     * @param value        The value to search
     * @return A String array with the data of the row/s found
     */
    public static String[][] searchRowsWith(String DataBaseName, String columnName, String value) {
        String[] columnNames = getColumnNames(DataBaseName);
        if (Utilities.Arrays.contains(columnNames, columnName)) {
            String[] columns = getColumn(DataBaseName, columnName);
            int[] index = Utilities.Arrays.allIndexOfIgnoreCase(columns, value);

            if (index.length == 0) {
                System.out.println("No rows found");
                return new String[0][0];
            } else {
                String[][] dataBase = new String[index.length][columnNames.length];
                for (int i = 0; i < index.length; i++) {
                    dataBase[i] = getRow(DataBaseName, index[i] + 1);
                }
                return dataBase;
            }
        } else {
            System.out.println("Column not found");
            return new String[0][0];
        }
    }

    /**
     * Get just the first row from the DataBase table where the column name is equal to the value given
     *
     * @param DataBaseName Name of the DataBase file
     * @param columnName   The name of the column to search
     * @param value        The value to search
     * @return A String array with the data of the row found
     */
    public static String[] searchFirstRowWith(String DataBaseName, String columnName, String value) {
        String[] columnNames = getColumnNames(DataBaseName);
        if (Utilities.Arrays.contains(columnNames, columnName)) {
            int index = getRowIndex(DataBaseName, columnName, value);

            if (index == 0) {
                System.out.println("No rows found");
                return new String[0];
            } else {
                return getRow(DataBaseName, index);
            }
        } else {
            System.out.println("Column not found");
            return new String[0];
        }
    }

    /**
     * Modify a row from the DataBase
     *
     * @param DataBaseName Name of the DataBase file
     * @param row          The index of row to modify
     * @param newData      A String array with the new data to put in the row (must have the same length as the columns)
     */
    public static void modifyRow(String DataBaseName, int row, String[] newData) {
        int rowcount = DataBases.getRowCount(DataBaseName);
        if (row > rowcount) {
            System.out.println("Row not modified");
        } else {
            int columnCount = DataBases.getColumnCount(DataBaseName);
            if (newData.length == columnCount) {
                int startLine = 2 + columnCount + 2 + (row - 1) * (columnCount + 1);
                int endLine = startLine + columnCount - 1;
                int index = 0;

                for (int i = startLine; i <= endLine; i++) {
                    Files.writeLine(DataBaseName, i, newData[index]);
                    index++;
                }
            } else {
                System.out.println("Column count doesn't match array length.");
            }
        }
    }

    /**
     * Modify a row from the DataBase
     *
     * @param DataBaseName Name of the DataBase file
     * @param row          The index of row to modify
     * @param columnName   The name of the column to modify
     * @param newData      The new data to put in the row
     */
    public static void modifyRow(String DataBaseName, int row, String columnName, String newData) {
        int rowcount = DataBases.getRowCount("users");
        if (row > rowcount) {
            System.out.println("Row not modified");
        } else {
            int columnCount = DataBases.getColumnCount("users");
            String[] columnNames = DataBases.getColumnNames("users");
            if (Utilities.Arrays.contains(columnNames, columnName)) {
                int columnIndex = Utilities.Arrays.indexOf(columnNames, columnName);
                int line = 2 + columnCount + 2 + (row - 1) * (columnCount + 1) + columnIndex;
                Files.writeLine(DataBaseName, line, newData);
            } else {
                System.out.println("Column not found");
            }
        }
    }

    /**
     * Get the index of a row from the DataBase table where the column name is equal to the value given
     *
     * @param DataBaseName Name of the DataBase file
     * @param columnName   The name of the column to search
     * @param value        The value to search
     * @return An int with the index of the row found
     */
    public static int getRowIndex(String DataBaseName, String columnName, String value) {
        String[] columnNames = getColumnNames(DataBaseName);
        if (Utilities.Arrays.contains(columnNames, columnName)) {
            String[] columns = getColumn(DataBaseName, columnName);
            int index = Utilities.Arrays.indexOf(columns, value) + 1;
            return index;
        } else {
            System.out.println("Column not found");
            return -1;
        }
    }

    /**
     * Get the index of a column from the DataBase table with the name given
     *
     * @param DataBase   Name of the DataBase file
     * @param columnName The name of the column to search
     * @return An int with the index of the column found
     */
    public static int getColumnIndex(String DataBase, String columnName) {
        String[] columnNames = getColumnNames(DataBase);
        if (Utilities.Arrays.contains(columnNames, columnName)) {
            return Utilities.Arrays.indexOf(columnNames, columnName) + 1;
        } else {
            System.out.println("Column not found");
            return -1;
        }
    }

}
