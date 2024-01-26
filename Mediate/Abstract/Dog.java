package Mediate.Abstract;

public class Dog extends Animal {

    public Dog(String type, String size, double weight) {
        super(type, size, weight);

    }

    @Override
    public void move(String speed) {

        throw new UnsupportedOperationException("Unimplemented method 'move'");
    }

    @Override
    public void makeNoise() {

        if(type == "Wolf"){
            System.out.println("Howli 11");
            return;
        }
        System.out.println("bark");
    }

    private static void doAnimalStuff(Animal animal){
        animal.makeNoise();
        animal.move("slow");
    }

}
