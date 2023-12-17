package basics.DontMind;

public class CheckNumber {
    public static void main(String[] args) {

    }

    public static void checkNumber(int number) {
        String o = (number > 0) ? "positive" : "negative";
        if (number == 0) {
            o = "zero";
        }
        System.out.println(o);

    }
}
