package OOPs.Polymorphism.Code;

public class Main {
    public static void main(String[] args) {
        Car newCar = new Mitsubishi(12, "mitsubhisi");
        System.out.println(newCar.getName());
        System.out.println(newCar.accelerate());
    }
}
