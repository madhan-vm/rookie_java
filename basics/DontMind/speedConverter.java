package basics.DontMind;

public class speedConverter {
    public static void main(String[] args) {

    }

    public static long toMilesPerHour(double kilometersPerHour) {

        if (kilometersPerHour >= 0) {
            double calc = (kilometersPerHour) / 1.609;
            return Math.round(calc);
        }
        return -1;
    }

    public static void printConversion(double kilometersPerHour) {
        long num = toMilesPerHour(kilometersPerHour);

        if (kilometersPerHour >= 0) {
            System.out.println(kilometersPerHour + "km/h=" + num + "mi/h");
        }
        System.out.println("invalid value");
    }

}