package OOPs.Polymorphism.Challenge;

public class Main{
    public static void main(String[] args) {
        Cars car = new Cars("Ferrari blue beast");
        runRace(car);

        Cars ferrari = new GasPoweredCar("ferrari" ,12 , 12);
        runRace(ferrari);

        Cars tesla = new ElectricCar("Tesla S3" ,12.0d ,5);
        runRace(tesla);
    }


    public static void runRace(Cars car){
        car.startEngine();
        car.drive();
    }
}
