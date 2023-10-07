package basics.quiz;

public class minutesToyearsCalculator {
    public static void main(String[] args) {
        

        printYearsAndDays(525600);
        printYearsAndDays(561600);
        printYearsAndDays(1051200);
    }

    public static void printYearsAndDays(long minutes){
        if(minutes<0){
            System.out.println("Invalid Value");
            return;
        }

        int hour =(int) minutes/60;
        int totalDays = hour/24;
        int remDays = totalDays%365;

        int year = totalDays/365;

        System.out.println(minutes+" min = "+year+" y and "+remDays+" d");


    }
}
