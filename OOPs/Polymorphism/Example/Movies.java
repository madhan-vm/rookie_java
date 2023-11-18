package OOPs.Polymorphism.Example;

public class Movies {

    private String title;

    public Movies(String title) {
        this.title = title;
    }

    public void watchMovie() {
        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " movie");
    }

    public static Movies getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'S' -> new SciFi(title);
            case 'C' -> new Comedy(title);
            default -> new Movies(title);
        };
    }

}

class Adventure extends Movies {

    public Adventure(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad happens");
    }

    public void watchAdventure(){
        System.out.println("Watching an Adventure");
    }
}

class Comedy extends Movies {

    public Comedy(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Something funny",
                "Something funnier happens",
                "Happy ending");
    }

     public void watchComedy(){
        System.out.println("Watching an Comedy");
    }
}

class SciFi extends Movies {

    public SciFi(String title) {
        super(title);
    }

    public void watchMovie() {
        super.watchMovie();
        System.out.printf("..%s%n".repeat(3),
                "Bad Aliems do bas stuff",
                "Space guys Blows up",
                "Badass uh Maa");
    }

     public void WatchSciFi(){
        System.out.println("Watching an Sci FI");
    }
}
