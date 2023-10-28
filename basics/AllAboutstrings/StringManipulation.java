package basics.AllAboutstrings;

public class StringManipulation {
    public static void main(String[] args) {
        String birthDate = "13/09/2004";
        int yearIndex = birthDate.indexOf("2004");
        String birthYear = birthDate.substring(6);
        System.out.println("starting index ==" + yearIndex);
        System.out.println("Birth year == " + birthYear);

        String birthMonth = birthDate.substring(3, 5);
        System.out.println("Month of Birth == " + birthMonth);

        String newBirthDate = String.join("/","17" ,"06" ,"2004");
        System.out.println(newBirthDate);


        String ily = "I Love her\n";
        System.out.println(ily.repeat(20));
        System.out.println("-".repeat(8).indent(8));




    }
}
