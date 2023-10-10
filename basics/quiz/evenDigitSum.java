package basics.quiz;

public class evenDigitSum {
    public static void main(String[] args) {
        
    }

    public static int getEvenDigitSum(int number){
        if(number<0){
            return -1;
        }
        int sum =0;
        while(number>0){
            int lastdigit = number%10;
            if(lastdigit%2==0){
                sum+=lastdigit;
            }
            number/=10;
        }
        return sum;
    }


    
}
