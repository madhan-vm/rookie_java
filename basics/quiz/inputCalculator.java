package basics.quiz;

import java.util.Scanner;

public class inputCalculator {
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);
        int i = 1;
        int counter = 0;
        int sum = 0;
        long average = 0;
        long avg=0;

        while (i != 0) {
            String input = scanner.nextLine();
            try {
                int inputnum = Integer.parseInt(input);

                sum += inputnum;
                counter++;

            } catch (NumberFormatException nfe) {
                System.out.println();
                i = 0;
                if (sum == 0) {
                    average = 0;
                } else {
                    average = sum / counter;
                    avg = Math.round(average);
                }

                System.out.println("SUM =" + sum + " AVG = " + (long) (avg));

            }
        }

    }
}
