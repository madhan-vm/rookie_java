package Mediate.Abstract.Challenge;

public class ArtObejct extends ProductsForSale {

    public ArtObejct(String type, double price, String description) {
        super(type, price, description);

    }

    @Override
    public void showDetails() {

        System.out.println("This "+type+ " is a Beautiful reproduction");
        System.out.printf("--- The Price is %6.2f %n",price);
        System.out.println(description);
    }

}
