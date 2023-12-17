package Mediate.Array.codes;

import java.util.Scanner;

public class MinimumElemnt {
    public static void main(String[] args) {

    }

    public static int readInteger() {
        Scanner getInt = new Scanner(System.in);
        int length = getInt.nextInt();
        return length;
    }

    public static int[] readElements(int length) {
        Scanner getInt = new Scanner(System.in);
        int array[] = new int[length];

        for (int i = 0; i < length; i++) {
            array[i] = getInt.nextInt();
        }

        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;

        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}
