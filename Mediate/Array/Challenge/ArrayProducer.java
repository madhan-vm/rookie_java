package Mediate.Array.Challenge;

import java.util.Random;

public class ArrayProducer {
    private static int[] array;

    private static int[] getRandomArray(int len) {
        Random random = new Random();
        array = new int[len];

        for (int i = 0; i < len; i++) {
            array[i] = random.nextInt(50);
        }

        int[] retArray = array;
        return retArray;

    }

    public int[] getArray(int len) {
        return getRandomArray(len);
    }

}
