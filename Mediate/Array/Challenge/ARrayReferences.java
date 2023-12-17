package Mediate.Array.Challenge;

import java.util.Arrays;

public class ARrayReferences {
    public static void main(String[] args) {
        int[] myIntArray = new int[5];

        int[] anotherArra = myIntArray;

        System.out.println("myIntArray =>" + Arrays.toString(myIntArray));
        System.out.println("anotherArray =>" + Arrays.toString(anotherArra));

        anotherArra[0] = 1;
        System.out.println("myIntArray =>" + Arrays.toString(myIntArray));
        System.out.println("anotherArray =>" + Arrays.toString(anotherArra));

    }
}
