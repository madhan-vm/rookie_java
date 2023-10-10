package basics.quiz;

public class sharedDigit {
    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int number1 , int number2){
        if((number1<10 || number1>99) ||(number2<10 || number2>99)){
            return false;
        }
        
        while(number1>0){

            int ld1 = number1%10;
            int ld11 = number1/10;
            while(number2>0){
                int ld2 = number2%10;
                int ld22 = number2/10;
                if(ld1 == ld2 || ld11 == ld22){
                    return true;
                }
                return false;
            }
            
        }
        return false;
    }
}