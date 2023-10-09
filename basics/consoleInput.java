package basics;
public class consoleInput {
    public static void main(String[] args) {

        System.out.println("What is Your name");
        String name = System.console().readLine();
        System.out.println("So your name is " + name);
    }
}