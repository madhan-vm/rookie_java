package basics.quiz;

public class DiagnolStart {
    public static void main(String[] args) {
        System.out.println(getLargestPrime(20));

    }

    public static int getLargestPrime(int number) {
        if (number < 0) {
            return -1;
        }

        for (int i = number / 2; i > 0; i--) {
            if (number % i == 0) {
                int in = i;
                for (int j = in/2; j >0; j--) {
                    if (in % j == 0) {
                        return in;
                    }

                }

            }
        }
        return -1;

    }

}
