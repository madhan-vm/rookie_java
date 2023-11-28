package experiMENTAL;

import java.util.InputMismatchException;
import java.util.Scanner;

public class evenPrintEnter {
    public static void main(String[] args) {
        int[] number = new int[10];
        int terminator = 0;
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter upto 15 numbers , TO Quit Press Q: \n");

        while (terminator < 10) {
            try {
                number[terminator] = getInput.nextInt();
                terminator++;
            } catch (InputMismatchException e) {

                System.out.println(".".repeat(10) + "Exit" + ".".repeat(10));
                terminator = 15;
            }

        }

       for (int iterable_element : number) {
         if(iterable_element%2==0){
            System.out.println(iterable_element);
         }
       }

    }
}
