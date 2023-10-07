package basics.quiz;

public class playingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
    }

    public static boolean isCatPlaying(boolean isSummer, int temperature) {

        if (isSummer) {
            if (temperature >= 25 && temperature <= 35) {
                return true;
            }
        } else if (!isSummer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;

            }

        }
        return false;
    }
}
