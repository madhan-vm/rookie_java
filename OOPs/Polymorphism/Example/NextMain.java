package OOPs.Polymorphism.Example;

public class NextMain {

   public static void main(String[] args) {
    Movies movie = Movies.getMovie("A", "Jaws");
    movie.watchMovie();


    Adventure jaws  = (Adventure) Movies.getMovie("a" , "Jaws");
    jaws.watchMovie();

    Object comedyMovie = Movies.getMovie("C" ,"HangPver");
    Comedy comedy = (Comedy) comedyMovie;
    if(comedyMovie instanceof Comedy){
        comedy.watchComedy();
    }

   }
}