package Utilities;

/**
 * Class containing all the shortened methods to control arrays, imitating and extending the list of methods of java.util.Arrays
 *
 * @version 18.0.1
 * @since 2022-06-12
 */

public class Arrays {

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(int[] array, int value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(String[] array, String value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(double[] array, double value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(long[] array, long value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(short[] array, short value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(char[] array, char value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(byte[] array, byte value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(boolean[] array, boolean value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(Object[] array, Object value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(Object[] array, Object value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(int[] array, int value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(String[] array, String value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(double[] array, double value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(long[] array, long value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(short[] array, short value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(char[] array, char value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(byte[] array, byte value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Performs a linear search on the given array for the specified value between the specified indexes.
     *
     * @param array the array to search through
     * @param value the value to search for
     * @param low   the index to start searching from
     * @param high  the index to stop searching at
     * @return the index of the value in the array, or -1 if the value is not present in the array
     */
    public static int linearSearch(boolean[] array, boolean value, int low, int high) {
        for (int i = low; i <= high; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static int[] add(int[] array, int value) {
        int[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static double[] add(double[] array, double value) {
        double[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static float[] add(float[] array, float value) {
        float[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static long[] add(long[] array, long value) {
        long[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static short[] add(short[] array, short value) {
        short[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static char[] add(char[] array, char value) {
        char[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static byte[] add(byte[] array, byte value) {
        byte[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static boolean[] add(boolean[] array, boolean value) {
        boolean[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static String[] add(String[] array, String value) {
        String[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add the given value at the end to the given array.
     *
     * @param array the array to add the value to
     * @param value the value to add to the array
     * @return the new array with the value added
     */
    public static Object[] add(Object[] array, Object value) {
        Object[] newArray = java.util.Arrays.copyOf(array, len(array) + 1);
        newArray[len(array)] = value;
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static int[] addAll(int[] array, int[] values) {
        int[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static double[] addAll(double[] array, double[] values) {
        double[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static float[] addAll(float[] array, float[] values) {
        float[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static long[] addAll(long[] array, long[] values) {
        long[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static short[] addAll(short[] array, short[] values) {
        short[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static char[] addAll(char[] array, char[] values) {
        char[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static byte[] addAll(byte[] array, byte[] values) {
        byte[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static boolean[] addAll(boolean[] array, boolean[] values) {
        boolean[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static String[] addAll(String[] array, String[] values) {
        String[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Add all the given values at the end to the given array.
     *
     * @param array  the array to add the value to
     * @param values the values to add to the array
     * @return the new array with all the values added
     */
    public static Object[] addAll(Object[] array, Object[] values) {
        Object[] newArray = java.util.Arrays.copyOf(array, len(array) + len(values));
        for (int i = 0; i < len(values); i++) {
            newArray[len(array) + i] = values[i];
        }
        return newArray;
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static int[] remove(int[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            int[] newArray = new int[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static double[] remove(double[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            double[] newArray = new double[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static float[] remove(float[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            float[] newArray = new float[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static long[] remove(long[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            long[] newArray = new long[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static short[] remove(short[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            short[] newArray = new short[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static char[] remove(char[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            char[] newArray = new char[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static byte[] remove(byte[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            byte[] newArray = new byte[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static boolean[] remove(boolean[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            boolean[] newArray = new boolean[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static String[] remove(String[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            String[] newArray = new String[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Remove the given index from the array.
     *
     * @param array the array to remove the value from
     * @param index the index to remove
     * @return the new array with the value removed
     */
    public static Object[] remove(Object[] array, int index) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            Object[] newArray = new Object[len(array) - 1];
            int indexOf = 0;
            for (int i = 0; i < len(array); i++) {
                if (i != index) {
                    newArray[indexOf] = array[i];
                    indexOf++;
                }
            }
            return newArray;
        }
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(double[] array, double value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(float[] array, float value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(long[] array, long value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(short[] array, short value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(char[] array, char value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(byte[] array, byte value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(boolean[] array, boolean value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(String[] array, String value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOf(Object[] array, Object value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns the index of the first occurrence of the specified element ignoring case
     *
     * @param array the array to search
     * @param value the value to search for
     * @return the index of the first occurrence of the specified element
     */
    public static int indexOfIgnoreCase(String[] array, String value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equalsIgnoreCase(value)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(int[] array, int value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(double[] array, double value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(float[] array, float value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(long[] array, long value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(short[] array, short value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(char[] array, char value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(byte[] array, byte value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(boolean[] array, boolean value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(String[] array, String value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns an array with the indexes of all the occurrences of the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOf(Object[] array, Object value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns an array with the indexes of all the occurrences of the specified element ignoring the case
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOfIgnoreCase(Object[] array, Object value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (String.valueOf(array[i]).equalsIgnoreCase(String.valueOf(value))) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns an array with the indexes of all the occurrences of the specified element ignoring the case
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOfIgnoreCase(String[] array, String value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i].equalsIgnoreCase(value)) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns an array with the indexes of all the occurrences of the specified element ignoring the case
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOfIgnoreCase(Object[] array, String value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (String.valueOf(array[i]).equalsIgnoreCase(value)) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns an array with the indexes of all the occurrences of the specified element ignoring the case
     *
     * @param array the array to search
     * @param value the value to search for
     * @return an array with the indexes of all the occurrences of the specified element
     */
    public static int[] allIndexOfIgnoreCase(String[] array, Object value) {
        int[] indexes = new int[0];
        for (int i = 0; i < len(array); i++) {
            if (array[i].equalsIgnoreCase(String.valueOf(value))) {
                indexes = add(indexes, i);
            }
        }
        return indexes;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(int[] array, int value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(double[] array, double value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(float[] array, float value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(long[] array, long value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(short[] array, short value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(char[] array, char value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(byte[] array, byte value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(boolean[] array, boolean value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Function that returns if the specified array contains the specified element
     *
     * @param array the array to search
     * @param value the value to search for
     * @return if the specified array contains the specified element
     */
    public static boolean contains(Object[] array, Object value) {
        for (int i = 0; i < len(array); i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static int[] set(int[] array, int index, int value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            int[] newArray = new int[len(array) + 1];
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static double[] set(double[] array, int index, double value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            double[] newArray = new double[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static float[] set(float[] array, int index, float value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            float[] newArray = new float[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static long[] set(long[] array, int index, long value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            long[] newArray = new long[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static short[] set(short[] array, int index, short value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            short[] newArray = new short[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static char[] set(char[] array, int index, char value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            char[] newArray = new char[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static byte[] set(byte[] array, int index, byte value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            byte[] newArray = new byte[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static boolean[] set(boolean[] array, int index, boolean value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            boolean[] newArray = new boolean[len(array) + 1];
            for (int i = 0; i < index - 1; i++) {
                newArray[i] = array[i];
            }
            newArray[index] = value;
            for (int i = index + 1; i < len(newArray); i++) {
                newArray[i] = array[i - 1];
            }
            return newArray;
        }
    }

    /**
     * Inserts the specified element at the specified position in the specified array
     *
     * @param array the array to insert the element
     * @param index the index at which the specified element is to be inserted
     * @param value the element to be inserted
     * @return the array with the element inserted
     */
    public static <T> T[] set(T[] array, int index, T value) {
        if (index < 0 || index >= len(array)) {
            return array;
        } else {
            T[] newArray = (T[]) new Object[array.length + 1];
            System.arraycopy(array, 0, newArray, 0, index);
            newArray[index] = value;
            if (newArray.length - (index + 1) >= 0)
                System.arraycopy(array, index + 1 - 1, newArray, index + 1, len(newArray) - (index + 1));
            return newArray;
        }
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static int[] reverse(int[] array) {
        int[] newArray = new int[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static double[] reverse(double[] array) {
        double[] newArray = new double[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static float[] reverse(float[] array) {
        float[] newArray = new float[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static long[] reverse(long[] array) {
        long[] newArray = new long[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static short[] reverse(short[] array) {
        short[] newArray = new short[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static char[] reverse(char[] array) {
        char[] newArray = new char[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static byte[] reverse(byte[] array) {
        byte[] newArray = new byte[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static boolean[] reverse(boolean[] array) {
        boolean[] newArray = new boolean[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static String[] reverse(String[] array) {
        String[] newArray = new String[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Returns the reverse of the specified array
     *
     * @param array the array to reverse
     * @return the reverse of the specified array
     */
    public static Object[] reverse(Object[] array) {
        Object[] newArray = new Object[len(array)];
        for (int i = 0; i < len(array); i++) {
            newArray[i] = array[len(array) - i - 1];
        }
        return newArray;
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(int[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(double[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(float[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(long[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(short[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(char[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(byte[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(boolean[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(String[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...]
     *
     * @param array the array to print
     */
    public static void print(Object[] array) {
        System.out.println(java.util.Arrays.toString(array));
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(int[][] array) {
        for (int[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(double[][] array) {
        for (double[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(float[][] array) {
        for (float[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(long[][] array) {
        for (long[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(short[][] array) {
        for (short[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(char[][] array) {
        for (char[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(byte[][] array) {
        for (byte[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(boolean[][] array) {
        for (boolean[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(String[][] array) {
        for (String[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Prints the specified array with the format of [element1, element2, element3, ...] \n [element1, element2, element3, ...] \n ...
     *
     * @param array the array to print
     */
    public static void print(Object[][] array) {
        for (Object[] s : array) {
            System.out.println(java.util.Arrays.toString(s));
        }
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(int[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(double[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(float[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(long[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(short[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(char[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(byte[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(boolean[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(String[] array) {
        return array.length;
    }

    /**
     * Returns the length of the specified array.
     *
     * @param array the array to get the length of
     * @return the length of the specified array
     */
    public static int len(Object[] array) {
        return array.length;
    }

}
