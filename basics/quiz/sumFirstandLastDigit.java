package basics.quiz;

public class sumFirstandLastDigit {
    public static void main(String[] args) {
System.out.println(sumFirstandLastDigit(10012));    }

    public static int sumFirstandLastDigit(int number){
        if(number<0){
            return -1;
        }
        if(number==0){
            return 0;
        }
        

        int lastDigit = number%10;

        while(number>9){
            number = number/10;
        }


        return lastDigit+number;
    }
}
