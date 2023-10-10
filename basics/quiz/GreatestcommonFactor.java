package basics.quiz;

public class GreatestcommonFactor {
    public static void main(String[] args) {

    }

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }

        int smallest = first;
        int largest = second;
        if (smallest > second) {
            smallest = second;
            largest = first;

        }

        for (int i = smallest; i > 0; i--) {

            if (largest % i == 0 && smallest % 1 == 0) {
                return i;
            }

        }
        return -1;

    }

}
