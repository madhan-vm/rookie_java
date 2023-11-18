package OOPs.Polymorphism.Example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Movies theMovie = Movies.getMovie("Sci", "Endgame");
        // theMovie.watchMovie();

        Scanner getInput = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a type \n" +
                    "A for Adventure \n" +
                    "C for Comedy \n" +
                    "S for SciFi \n" +
                    "or Q to Quit");
            String type = getInput.nextLine();

            if ("Qq".contains(type)) {
                System.out.println("-".repeat(5)+"Exited"+"-".repeat(5));
                break;
            }
            System.out.println("Enter the Movie name: ");
            String title = getInput.nextLine();
            Movies newMovie = Movies.getMovie(type, title);
            newMovie.watchMovie();


        }
    }
}
