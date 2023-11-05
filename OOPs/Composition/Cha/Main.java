package OOPs.Composition.Cha;

public class Main {
    public static void main(String[] args) {
        // SmartKitchen myKitchen = new SmartKitchen();
        // // myKitchen.getBrewMaster().setHasWorkToDo(true);
        // // myKitchen.getDishWasher().setHasWorkToDo(true);
        // // myKitchen.getIceBox().setHasWorkToDo(true);

        // // myKitchen.getDishWasher().doDishes();
        // // myKitchen.getBrewMaster().brewCoffee();
        // // // myKitchen.getIceBox().orderFood();

        // myKitchen.setKitchenState(true, true, true);
        // myKitchen.doKitchenWork();

        // Electronics myCalculator = new Electronics();
        // myCalculator.getCalculator().addition(1, 5);
        // Electronics clock = new Electronics();
        // clock.getClock().getTimeandDate();

        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("YOUR NAME HERE", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();

        bedRoom.getLamp().turnOn();

    }
}
