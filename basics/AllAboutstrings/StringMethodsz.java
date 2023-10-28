package basics.AllAboutstrings;

public class StringMethodsz {
    public static void main(String[] args) {
        stringInformation("Madhan");

        String helloWorld = "VedaSree";
        System.out.printf("the index of a is %d\n", helloWorld.indexOf('a'));
        System.out.printf("the index of sree is %d\n", helloWorld.indexOf("ree"));

        System.out.printf("The first index of e is %d \n", helloWorld.indexOf('e'));
        System.out.printf("The last index of e is %d \n", helloWorld.lastIndexOf('e'));
         System.out.printf("The first index of e is %d \n", helloWorld.indexOf('e',2));
        System.out.printf("The last index of e is %d \n", helloWorld.lastIndexOf('e',6));

    }

    public static void stringInformation(String string) {
        int lengthOfStr = string.length();
        char firstLetter = string.charAt(0);
        char lastLetter = string.charAt(lengthOfStr - 1);

        System.out.println((string.isEmpty()) ? "Empty String" : "The String Infromation are:\n");

        System.out.printf("The Length of Str is %d%n", lengthOfStr);
        System.out.printf("The Frist letter is %c%n", firstLetter);
        System.out.printf("The Last Letter is %c%n", lastLetter);

    }

}
