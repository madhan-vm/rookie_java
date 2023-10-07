package basics.quiz;

public class equalSumChecker {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 2));
    }

    public static boolean hasEqualSum(int num1 , int num2 , int num3){
        if(num1+num2==num3){
            return true;
        }
        return false;
    }
}
