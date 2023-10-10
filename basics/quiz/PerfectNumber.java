package basics.quiz;

public class PerfectNumber {
    public static void main(String[] args) {

    }

    public static boolean isPerfectNumber(int number) {

        int factorSum = 0;
        int halfNum = number / 2;

        if (number < 1) {
            return false;
        }

        while (halfNum > 0) {
            if (number % halfNum == 0) {
                factorSum += halfNum;
            }
            halfNum--;
        }

        if (factorSum == number) {
            return true;
        }
        return false;

    }
}
