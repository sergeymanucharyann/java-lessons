package arrayHomework;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Array arr = new Array();

        int[] numbers = new int[]{1, 5, 6, -8, -56, -78, 2, 3, 78, 125, -7};//for exercise 1

        short[] array = new short[]{1, 2, 3, 4, 5, 7, 8, 96};//for exercise 2

        long[] longArray = new long[]{2895223, 3654, 4789, 556, 7, 28, 96};//for exercise 3

        float[] floatArray = new float[]{2895223, 3654, 4789, 556, 7, 28, 96};//for exercise 4

        int[] r = new int[]{20, 30, 780, 1250, -70};//for exercise 5
        int[] m = new int[5];

        int[] forRepeat = new int[]{1, 5, 6, 1, 8, 9, 1, 5, 8, 9};//for exercise 7

        arr.printArray(numbers);
        System.out.println();
        arr.printReversArray(array);
        System.out.println();
        System.out.println(arr.biggestNumber(longArray));
        System.out.println(arr.smallestNumber(floatArray));
        System.out.println(Arrays.toString(arr.move(r, m)));
        arr.createArrays();
        System.out.println(arr.repeatNumber(forRepeat, 5));


    }
}
