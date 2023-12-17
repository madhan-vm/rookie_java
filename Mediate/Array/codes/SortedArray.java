package Mediate.Array.codes;

import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] myArray = getIntegers(5);
        printArray(myArray);
        printArray(sortIntegers(myArray));
    }

    public static int[] getIntegers(int len) {

        int[] array = new int[len];
        for (int i = 0; i < len; i++) {

            array[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(array));
        return array;
    }

    public static void printArray(int[] array) {
        Arrays.toString(array);

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }

    public static int[] sortIntegers(int[] unsortedArray) {
        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            
            for (int i = 0; i < unsortedArray.length - 1; i++) {
                if (unsortedArray[i] < unsortedArray[i + 1]) {

                    temp = unsortedArray[i];
                    unsortedArray[i] = unsortedArray[i + 1];
                    unsortedArray[i+1] =temp;
                
                    flag = true;                }
            }
        }
        return unsortedArray;
    }

}
