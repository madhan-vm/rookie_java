package OOPs.Inheritance.Pojo;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            LPSstudent s = new LPSstudent("BMEBE0" + i,
                    switch (i) {
                        case 1 -> "Madhan";
                        case 2 -> "Leo";
                        case 3 -> "Harold";
                        case 4 -> "Antony";
                        case 5 -> "Thookudurai";
                        default -> "Rolex";
                    },
                    "13/09/2004",
                    "Java");
                    System.out.println(s);
        }
    }

}
