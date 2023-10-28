package basics.AllAboutstrings.StringBuilder;

public class strvsStringBuilder {
    public static void main(String[] args) {

        String helloworld = "Hello" + " World";
        helloworld.concat(" and GoodBye");

        StringBuilder helloWorldBuilder = new StringBuilder("Hello" + " World");
        helloWorldBuilder.append(" And GoodBye");

        printInformation(helloworld);

        printInformation(helloWorldBuilder);

        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(57));

        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(17));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + " World");
        builderPlus.append(" And GoodBye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);
        builderPlus.replace(16, 17, "G");
        System.out.println(builderPlus);
        builderPlus.reverse().setLength(7);
        System.out.println(builderPlus);


    }

    public static void printInformation(String str) {
        System.out.println("String = " + str);
        System.out.println("String length = " + str.length());
    }

    public static void printInformation(StringBuilder strBuilder) {
        System.out.println("StringBuilder = " + strBuilder);
        System.out.println("String length = " + strBuilder.length());
        System.out.println("Capacity = " + strBuilder.capacity());
    }

}
