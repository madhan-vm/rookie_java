package basics.AllAboutstrings;

public class Textblock {
    public static void main(String[] args) {

        String normalBullet = "This is a Bulleted List:\n" +
                "\t\u2022 First Point\n" +
                "\t\t\u2022 Sub point";
        System.out.println(normalBullet);

        String javaTextBlock = """
                This is from Java 's text block feature
                    \u2022 First Point
                        \u2022 sub point
                """;

        System.out.println(javaTextBlock);

        int number = 18;
        System.out.printf("The number is %6d\n", number);
        System.out.printf("The number is %.2f\n",(float) number);


        String formattedString = String.format("The Number is "+number);
        System.out.println(formattedString);

        System.out.format("Shimt again the Number is %d" , number);

        String anotherFormattedString = "the Number eighteen in nnumber is %d".formatted(number);
        System.out.println(anotherFormattedString);

    }

}
