package Mediate.Array.Challenge;

import java.util.Arrays;

public class LinearSort {
    public static void main(String[] args) {
        ArrayProducer newArray = new ArrayProducer();
        int[] myArray = newArray.getArray(10);

        System.out.println(Arrays.toString(myArray));
        // Arrays.sort(myArray);

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;

            for (int i = 0; i < myArray.length - 1; i++) {
                if (myArray[i] < myArray[i + 1]) {

                    temp = myArray[i];
                    myArray[i] = myArray[i + 1];
                    myArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        System.out.println(Arrays.toString(myArray));

    }
}
