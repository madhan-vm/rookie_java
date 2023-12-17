package Mediate.List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ArrayListChallenge {
    static Scanner scanner = new Scanner(System.in);
    static ArrayList<String> groceryItems = new ArrayList<>();
    static String[] addRemovelist = new String[10];

    public static void main(String[] args) {

        boolean flag = true;
        availableActions();

        while (flag) {
            switch (Integer.parseInt(scanner.nextLine())) {
                case 1 -> addItems(groceryItems);

                default -> flag = false;

            }
            groceryItems.sort(Comparator.naturalOrder());
            printGroceryList(groceryItems);
        }

    }


    private static void addItems(ArrayList<String> groceries){
        System.out.println("Add Items :");
        String[] items = scanner.nextLine().split(",");
        // grocerie.addAll(List.of(items));

        for(String i: items){
            String trimmed = i.trim();
            if(groceries.indexOf(trimmed) <0){
                groceries.add(trimmed);
            }
        }
    }
    private static void removeItems(ArrayList<String> groceries){
        System.out.println("Remove Items :");
        String[] items = scanner.nextLine().split(",");
        // grocerie.addAll(List.of(items));

        for(String i: items){
            String trimmed = i.trim();
            
                groceries.remove(trimmed);
            
        }
    }

    public static void availableActions() {
        System.out.println("""
                Available actions:

                0 - to shutdown

                1 - to add item(s) to list (comma ddelimited list)

                2 - to remove any items(comma delimited list)

                Enter a number for which action you want  to do%n
                """);

    }

    public static int getActionInput() {

        int input = scanner.nextInt();
        return input;

    }

    public static void printGroceryList(ArrayList<String> list) {
        System.out.println(list);
    }

    public static boolean isDuplicate(String text, ArrayList<String> list) {

        return list.contains(text);
    }
}
