package OOPs.Polymorphism.Code;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;
    

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public String startEngine() {

        return this.getClass().getSimpleName() + " -> startEngine()";
    }

    public String accelerate() {
        return this.getClass().getSimpleName() + " -> accelerate()";
    }

    public String brake() {
        return this.getClass().getSimpleName() + " -> brake()";
    }

    public int getCylinders(){
        return cylinders;
    }

    public String getName(){
        return name;
    }
}
