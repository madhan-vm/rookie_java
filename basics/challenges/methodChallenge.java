package basics.challenges;

public class methodChallenge {
    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Madhan", position);

        position = calculateHighScorePosition(999);
        displayHighScorePosition("Madhan", position);

        position = calculateHighScorePosition(499);
        displayHighScorePosition("Madhan", position);

        position = calculateHighScorePosition(25);
        displayHighScorePosition("Madhan", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {

        System.out.println(playerName +
                " Managed to get into position "
                + position +
                " on the hign score list");

    }

    public static int calculateHighScorePosition(int score) {
        if (score >= 1000) {
            return 1;
        } else if (score >= 500) {
            return 2;
        } else if (score >= 100) {
            return 3;
        }
        return 4;
    }

}
