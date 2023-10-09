package basics.challenges;

public class digitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(1));

    }

    public static int sumDigits(int number) {
        if (number < 0) {
            return -1;
        }
        int sum = 0;
        while (number > 0) {
            int oneDigit = number % 10;
            sum = sum + oneDigit;
            number = number / 10;

        }
        return sum;
    }
}
