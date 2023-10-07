package basics.quiz;

public class leapYearcalculator {
    public static void main(String[] args) {
System.out.println(isLeapYear(1800));
    }

    public static boolean isLeapYear(int year) {
        if(year%4==0 && (year %100!=0 || year%400==0)){
            return true;
        }
        return false;


    }
}

// 2000 , 1800 => 4 , 100