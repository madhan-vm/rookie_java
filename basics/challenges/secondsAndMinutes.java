package basics.challenges;

public class secondsAndMinutes {
    public static void main(String[] args) {
        System.out.println(getDurationString(4403));
        System.out.println(getDurationString(65, 145));

    }

    public static String getDurationString(int seconds) {

        if (seconds < 0) {
            return " invalid";
        }

        return getDurationString(seconds / 60, seconds % 60);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (seconds < 0 || minutes < 0) {
            return " invalid";
        }
        int addMins = 0;
        if (seconds > 60) {
            addMins = seconds / 60;
        }

        int remSeconds = seconds % 60;

        int remminutes = minutes % 60;
        int hour = minutes / 60;

        String timeString = hour + "h " + (remminutes+addMins) + "m " + remSeconds + "s";
        return timeString;

    }
}
