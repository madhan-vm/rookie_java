package basics.quiz;

public class numberPalinddrome {
    public static void main(String[] args) {

        isPalindrome(100);
        System.out.println(isPalindrome(222));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            reversedNumber = reversedNumber * 10 + tempNumber % 10;
            tempNumber = tempNumber / 10;
        }
        if (reversedNumber == number) {
            return true;
        }
        return false;

    }

}
