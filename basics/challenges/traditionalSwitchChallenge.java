package basics.challenges;

public class traditionalSwitchChallenge {
    public static void main(String[] args) {
        System.out.println(switchChallenge('a'));
    }

    public static String switchChallenge(char character) {
        switch (character) {
            case 'A':
                return "Anna";

            case 'B':
                return "Banana";

            case 'C':
                return "C is Canada";

            default:
                return "I Love you";
        }
    }
}