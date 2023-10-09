
package basics;

import java.util.Scanner;

public class scannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         

        String name = scanner.nextLine();

        if(name=="Madhan"){
            System.out.println("Woo");

        }
        else{
            
        }
        System.out.println("So you are "+name);


        
    }

}