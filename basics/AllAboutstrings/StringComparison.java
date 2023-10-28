package basics.AllAboutstrings;

public class StringComparison {
    public static void main(String[] args) {

        String helloWorld = "Hello world";
        String lowerHelloworld = helloWorld.toLowerCase();

        if(helloWorld.contains(lowerHelloworld)){
            System.out.println("1st Pass");
        }

         if(helloWorld.equals("he")){
            System.out.println("2st Pass");
        }

         if(helloWorld.equalsIgnoreCase(lowerHelloworld)){
            System.out.println("ignore st Pass");
        }

         if(helloWorld.startsWith("Hello")){
            System.out.println("1st Pass");
        }

         if(helloWorld.endsWith("world")){
            System.out.println("endt Pass");
        }

         if(helloWorld.contains("Hello world")){
            System.out.println("1st content ");
        }

        
    }
    
}
