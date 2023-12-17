package Mediate.List;

import java.util.ArrayList;
import java.util.List;

public class MoreLists {
    public static void main(String[] args) {
        String[] item = { "Ratata", "Badsass", "Scared", "Ordinary" };
        List<String> list = List.of(item);
        System.out.println(list);
        System.out.println(list.getClass().getSimpleName());
        

        ArrayList<String> groceries = new ArrayList<>(list);
        System.out.println(groceries);
        groceries.add("Maplillai");
        System.out.println(groceries);

        ArrayList<String> newList = new ArrayList<>(
            List.of("okay" , "Bye" , "Gn")
        );
        System.out.println(newList);
        groceries.addAll(newList);
        System.out.println(groceries.get(3));


        System.out.println("-".repeat(30));
        System.out.println(groceries.getClass().getSimpleName());
        var gay = groceries.toArray(new String[groceries.size()]);
        System.out.println(gay);
        
    }
}
