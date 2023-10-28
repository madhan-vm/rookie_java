package basics;

public class FlourPack {
    public static void main(String[] args) {

    }

    public boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        boolean hasValidBags = 5 * bigCount + smallCount >= goal;

        if (hasValidBags) {
            if(goal<5){
                return smallCount>=goal;
            }
            int lv = bigCount;
            if (lv>0) {

                
            }

        }
        return false;
    }
}
