package OOPs.Polymorphism.Challenge;

public class Cars {
    private String description;

    public Cars(String description) {
        this.description = description;
    }

    public void startEngine() {

        System.out.println("Car --> Start Engine");
    }

    public void drive() {
        System.out.println("Car -> driving is  " + getClass().getSimpleName());
        runEngine();
    }

    protected void runEngine() {
        System.out.println("Car --> runEngine");
    }

}

class GasPoweredCar extends Cars {
    private double avgKmPerLitre;
    private int cylinder;

    public GasPoweredCar(String description) {
        super(description);
    }

    public GasPoweredCar(String description, double avgKmPerLitre, int cylinder) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinder = cylinder;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the avg : %.2f", avgKmPerLitre);
    }

    @Override
    public void startEngine() {
        System.out.printf("Gas -> All %d cylinders are fired Up", cylinder);
    }

}

class ElectricCar extends Cars {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricCar(String description) {
        super(description);
    }

    public ElectricCar(String description, double avgKmPerCharge, int batterySize) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
    }

    @Override
    protected void runEngine() {
        System.out.printf("EV -> usage under average : %.2f", avgKmPerCharge);
    }

    @Override
    public void startEngine() {
        System.out.printf("EV -> %d Battery in On", batterySize);
    }

}


class HybridCar extends Cars {
    private double avgKmPerCharge;
    private int batterySize;

    private int cylinders;
    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerCharge, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerCharge = avgKmPerCharge;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    protected void runEngine() {
        System.out.printf("Hybrid -> usage below average %.2f", avgKmPerCharge);
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d Cylinders fired\n", batterySize);
        System.out.printf("hybrid -> swithch %d battery on \n" , batterySize);
    }

}
