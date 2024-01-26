package Mediate.Abstract.Challenge;

public abstract class ProductsForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductsForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public final double getSalePrice(int quantitiy) {
        return quantitiy * price;
    }

    public void printPricedItems(int quantity) {
        System.out.printf("%2d qty at $%8.2f each , %-15s %-35s %n", 
        quantity, price, type, description);
    }

    public abstract void showDetails();
}
