package basics.DontMind;

public class brakingDog {
    public static void main(String[] args) {
        
    }

    public static boolean shouldWakeUp(boolean isBarking , int hourOfTheDay){

        if(hourOfTheDay>0 && hourOfTheDay<23 ){

            if((hourOfTheDay<=8 || hourOfTheDay>=22) && isBarking){
                return true;
            }
            return isBarking;
        }
        if(isBarking){
            return false;
        }


        return isBarking;
    }
    
}
