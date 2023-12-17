package Mediate.Array.Challenge;

import java.util.Arrays;
import java.util.Scanner;

public class minElement {
    public static void main(String[] args) {

        int[] inIntegers = readIntegers();
        int a =findMin(inIntegers);System.out.println(a);

        System.out.println(Arrays.toString(inIntegers));
        System.out.println(Arrays.toString(reverseArray(inIntegers)));

    }

    private static int[] readIntegers() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter intergers seperated by commas:\n");
        String input = scanner.nextLine();

        String[] arrayStr = input.split(",");
        int[] values = new int[arrayStr.length];
        for (int i = 0; i < arrayStr.length; i++) {
            values[i] = Integer.parseInt(arrayStr[i].trim());
        }

        return values;

    }

    public static int findMin(int[] array) {

        int[]  inArray = Arrays.copyOf(array, array.length);
        Arrays.sort(inArray);
        return inArray[0];

    }

    public static int[] reverseArray(int[] array){

        int[] reverseArray = new int[array.length];
        Arrays.copyOf(array, array.length);

        for(int i =array.length-1; i>=0; i--){
            reverseArray[array.length-(i+1)] = array[i];
        }

        return reverseArray;

    }
}
