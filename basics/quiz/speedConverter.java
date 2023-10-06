package basics.quiz;

public class speedConverter {
    public static void main(String[] args) {
        printConversion(76);
    }

    public static long toMilesPerHour(double kilometresperHour) {
        if (kilometresperHour < 0) {
            return -1;
        }
        return (long) (kilometresperHour * 1 / 1.609);

    }

    public static void printConversion(double kilometresperHour) {
        long Value = toMilesPerHour(kilometresperHour);

        if (Value == -1) {
            System.out.println("Invalid Value");
        }

        System.out.println(kilometresperHour + "km/h = " + Value + "mi/h");
    }

}
