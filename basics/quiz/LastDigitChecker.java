package basics.quiz;

public class LastDigitChecker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if ((num1 < 10 || num1 > 1000) || (num2 < 10 || num2 > 1000) || (num3 < 10 || num3 > 1000)) {
            return false;
        }
        int ld1, ld2, ld3;

        ld1 = num1 % 10;
        ld2 = num2 % 10;
        ld3 = num3 % 10;

        if (((ld1 == ld2) || (ld2 == ld3) || (ld3 == ld1))) {
            return true;
        }
        return false;

    }

    public static boolean isValid(int num) {
        if (num < 10 || num > 1000) {
            return false;
        }
        return true;
    }
}