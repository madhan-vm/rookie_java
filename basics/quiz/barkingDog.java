package basics.quiz;

public class barkingDog {
    public static void main(String[] args) {
System.out.println(        shouldWakeUp (true, -1)
);
    }

    public static boolean shouldWakeUp(boolean isBarking ,int hourOfTheDay ){
        if(hourOfTheDay<0 || hourOfTheDay>23){
            return false;
        }

        if(isBarking && (hourOfTheDay<8 ||hourOfTheDay>22)){
            return true;
        }

        return false;
    }
}
