package basics.quiz;

public class lp {
    public static boolean isLeapYear(int year){

        if(year<0 || year >9999){
            return false;
        }
        if(year%4==0 || (year%100!=0 && year%400==0)){
            return true;
        }
        return false;
    }
    
}
