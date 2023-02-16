package arrayHomework;

import java.util.Arrays;

public class Array {
    /**
     * Ex.1
     * This is a method that prints the positive elements of an int[] array.
     *
     * @param num int[]
     */
    public void printArray(int[] num) {
        System.out.println(" ");
        for (int j : num) {
            if (j > 0) {
                System.out.print(j + " ");
            }
        }
    }

    /**
     * Ex. 2
     * This is a method that prints the elements of the short[] array
     * in reverse in order.
     *
     * @param shor short[]
     */
    public void printReversArray(short[] shor) {
        for (int i = shor.length - 1; i >= 0; i--) {
            System.out.print(shor[i] + " ");
        }
    }

    /**
     * Ex. 3
     * This is a method that finds and prints the largest element of the long[] array.
     *
     * @param i long[]
     * @return maximum
     */
    public long biggestNumber(long[] i) {
        long maximum = i[0];
        for (long l : i) {
            if (l > maximum) {
                maximum = l;
            }
        }
        return maximum;
    }

    /**
     * Ex.4
     * This is a method that finds and prints the smallest element of the float[] array.
     *
     * @param f float[]
     * @return min
     */
    public long smallestNumber(float[] f) {
        float min = f[0];
        for (float v : f) {
            if (v < min) {
                min = v;
            }
        }
        return (long) min;
    }

    /**
     * Ex.5
     * This is a method that takes the elements of an array and moves them into the another array
     *
     * @param r int[]
     * @param m int[]
     * @return m , r
     */
    public int[] move(int[] r, int[] m) {
        if (r.length != m.length) {
            System.out.println("Lengths are not equal");
        }
        return m = r;
    }

    /**
     * Ex.6
     * This is a method that creates two arrays of the same size and adds the array
     * and writes the corresponding elements in the third array.
     */

    public void createArrays() {
        int[] first = new int[]{7, -5, 9, 6, 4};
        int[] second = new int[]{1, 5, 8, 9, 6};
        int[] third = new int[5];

        for (int i = 0; i < third.length; i++) {
            third[i] = first[i] + second[i];
        }
        System.out.println(Arrays.toString(third));
    }

    /**
     * Ex.7
     * This is a method that counts how many times the number k occurs in an array
     * In the elements.
     *
     * @param array int[]
     * @param k     int
     * @return int
     */

    public int repeatNumber(int[] array, int k) {
        int count = 0;

        for (int j : array) {
            if (j == k) {
                count++;
            }
        }
        return count;
    }

}
