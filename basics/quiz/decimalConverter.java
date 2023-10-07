package basics.quiz;

public class decimalConverter {
    public static void main(String[] args) {
        boolean a =areEqualByThreeDecimalPlaces(12.37610, 12.3760);
        System.out.println(a);
    }
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        long num1_rounded = (long) Math.round(num1 *1000);
        long num2_rounded = (long) Math.round(num2 *1000);
        return num1_rounded == num2_rounded;
    }


    
}
