package Mediate.Array;

import java.util.Arrays;

public class twoDeeArray {
    public static void main(String[] args) {
        int[][] my2dArray={ {1,2,3} , {2,3,4,5}};
        int[][] initRule =new int [3][3];

        

        for(int [] outer : initRule){
            System.out.println(Arrays.toString(outer));
        }

        for(int i=0; i<initRule.length; i++){
            var innerArray = initRule[i];
            for (int j = 0; j < innerArray.length; j++) {
                System.out.println(initRule[i][j]+ " ");
            }
            System.out.println();
        }
    }


}