package Mediate.Array.Challenge;

import java.util.Arrays;
import java.util.Random;

public class ArrayChallenge {

    public static void main(String[] args) {
        int[] myArray = getRandomArray(10);
        int[] copyArray1 = Arrays.copyOf(myArray, myArray.length);
        int[] copyArray2 = Arrays.copyOf(myArray, myArray.length);

        Arrays.sort(copyArray1);
        System.out.println(Arrays.toString(myArray));

        for (int i = 0; i < copyArray1.length; i++) {
            myArray[i] = copyArray1[myArray.length - 1-i];
        }

        System.out.println("Sorted");
       

            System.out.println(Arrays.toString(myArray));
        
    }

    public static int[] getRandomArray(int len) {
        Random random = new Random();

        int filledArray[] = new int[len];

        for (int i = 0; i < len; i++) {
            filledArray[i] = random.nextInt(50);
        }

        return filledArray;
    }
}
