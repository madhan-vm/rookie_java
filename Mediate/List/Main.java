package Mediate.List;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count) {
    public GroceryItem(String name) {
        this(name, "Diary", 1);
    }
    

    
}

public class Main {
    public static void main(String[] args) {
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("miljk");
        groceryArray[1] = new GroceryItem("Aple", "produce", 6);
        groceryArray[2] = new GroceryItem("Msater");

        System.out.println(Arrays.toString(groceryArray));

        ArrayList objectList = new ArrayList();
        objectList.add(new GroceryItem("madhan"));
        objectList.add("okay");

        ArrayList<GroceryItem> groceryList = new ArrayList<>();

        groceryList.add(new GroceryItem("1.Master"));
        groceryList.add(new GroceryItem("Item", "diary", 6));
        groceryList.add(new GroceryItem("Okkali"));
        System.out.println(groceryList);


        groceryList.remove(1);
        System.out.println(groceryList);

    
    
    }
}
