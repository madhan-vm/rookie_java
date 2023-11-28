package Mediate.Array;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // int firstArray[] = getRandomArray(10);
        // Arrays.sort(firstArray);

        // System.out.println(Arrays.toString(firstArray));

        // int[] secondArray = new int[10];
        // System.out.println(Arrays.toString(secondArray));
        // Arrays.fill(secondArray , 7);
        // System.out.println(Arrays.toString(secondArray));

        // int [] thirdArray = new int[10];

        // thirdArray =  Arrays.copyOf(secondArray, secondArray.length) ;
        // System.out.println(Arrays.toString(thirdArray));


        // String[]  sArray = { "Madhan" , "Balaji" , "Veda" , "Sree" , "Raja" ,};
        // Arrays.sort(sArray);
        // System.out.println(Arrays.toString(sArray));


        // if(Arrays.binarySearch(sArray, "Veda")>=0){
        //     System.out.println("She is Here");
        // }


        int[] s1 = getRandomArray(5);
        System.out.println(Arrays.toString(s1));
        int[] s2 = Arrays.copyOf(s1, s1.length);
        System.out.println(Arrays.toString(s2));
        
        int[] s3 = Arrays.copyOf(s1, s1.length);
        Arrays.sort(s3);
        System.out.println(Arrays.toString(s3));


        if(Arrays.equals(s1, s2)){
            System.out.println("S1 and S2 are Equal");
        }

        if(Arrays.equals(s2,s3)){
            System.out.println("s1 and s3 are not equal");
        }

    }








    public static int[] getRandomArray(int len) {
        Random random = new Random();
        int[] newInt = new int[len];

        for (int i = 0; i < len; i++) {
            newInt[i] = random.nextInt(100);
        }
        return newInt;
    }
}