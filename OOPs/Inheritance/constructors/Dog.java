package OOPs.Inheritance.constructors;

class Dogs {
    private static String name;

    public Dogs(String name) {
        this.name = name;
    }

    public void printName() {
        System.out.println("Name =" + name);
    }

}

public class Dog {

    public static void main(String[] args) {

        Dogs fluffy = new Dogs("fluffy");
        Dogs rex = new Dogs("Rex");

        fluffy.printName();
        rex.printName();
    }

}
