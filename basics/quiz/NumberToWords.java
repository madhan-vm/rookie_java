package basics.quiz;

public class NumberToWords {
    public static void main(String[] args) {
        System.out.println(reverse(100));
        getDigitCount(100);
        numberToWords(100);

    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }

        int reversedNumber = reverse(number);
        
        
        

        while (reversedNumber > 0) {
            int digit = reversedNumber % 10;

            switch (digit) {
                case 0 -> System.out.println("Zero");

                case 1 -> System.out.println("One");
                case 2 -> System.out.println("Two");
                case 3 -> System.out.println("Three");
                case 4 -> System.out.println("Four");
                case 5 -> System.out.println("Five");
                case 6 -> System.out.println("Six");
                case 7 -> System.out.println("Seven");
                case 8 -> System.out.println("Eight");
                case 9 -> System.out.println("Zero");
            }
            
            reversedNumber /= 10;
        }

        reversedNumber = reverse(number);

        if(getDigitCount(reversedNumber)!=getDigitCount(number)){
            int factor = getDigitCount(number) - getDigitCount(reversedNumber);
            while(factor!=0){
                System.out.println("Zero");
                factor--;
            }
        }
        

    }

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        }
        String length = String.valueOf(number);
        return length.length();
    }

    public static int reverse(int number) {
        int reversedNumber = 0;
        if (number < 0) {

            while (number < 0) {

                reversedNumber = reversedNumber * 10 + (number % 10);
                number /= 10;
            }

            return reversedNumber * -1;

        }

        while (number > 0) {

            reversedNumber = reversedNumber * 10 + (number % 10);
            number /= 10;
        }

        return reversedNumber;

    }

}
