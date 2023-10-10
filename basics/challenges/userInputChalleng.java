package basics.challenges;

import java.util.Scanner;

public class userInputChalleng {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        String num = "";

        do {
            System.out.println("Enter the number #" + i);
            num = scanner.nextLine();

            if (isNumberValid(num)) {
                i++;
            }
        } while (i < 6);

    }

    public static boolean isNumberValid(String num) {
        try {
            double number = Double.parseDouble(num);
            return true;
        } catch (NumberFormatException e) {

            System.out.println("Invalid Characters");
            return false;
        }

    }

}