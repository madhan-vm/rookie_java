package basics.challenges;

import java.util.Scanner;

import basics.quiz.equalSumChecker;

public class minMaxChalleng {
    public static void main(String[] args) {
        int i = 9;
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int minnumber = 0;

        do {
            System.out.println("enter a number");
            String number = scanner.nextLine();
            try {
                int enteredNumber = Integer.parseInt(number);
               if(isNumber(number)){


               }
            } catch (NumberFormatException nfe) {

                
            }

            counter++;

            if (!isNumber(number)) {
                i = 0;
            }

        } while (i != 0);

    }

    public static boolean isNumber(String num) {
        try {
            int number = Integer.parseInt(num);

            return true;

        } catch (NumberFormatException e) {

            System.out.println("Quit");
            return false;

        }

    }

    

}
