package Mediate.Abstract.Challenge;

import java.util.ArrayList;

record OrderItem(int qty, ProductsForSale product) {
}

public class Store {

    private static ArrayList<ProductsForSale> storeProds = new ArrayList<>();

    public static void main(String[] args) {
        storeProds.add(new ArtObejct("oil painting", 16500, "Marakuma nenjam from 1997"));
        storeProds.add(new ArtObejct("Sculpture", 2588, "Something thta sucks"));
        listProducts();
    }

    public static void listProducts() {
        for (var i : storeProds) {
            System.out.println("-".repeat(30));
            i.showDetails();
        }
    }

    public static void addItemToOrder(ArrayList<OrderItem> order, int orderIndex, int qty) {
        order.add(new OrderItem(qty, storeProds.get(orderIndex)));
    }
    public static void printOrder(ArrayList<OrderItem> order){
        double st =0;
        for(var item : order){
            item.product().printPricedItems(item.qty());
            st+= item.product().getSalePrice(item.qty());
        }
        System.out.printf("ST -> $%6.2f %n");
    }
}
