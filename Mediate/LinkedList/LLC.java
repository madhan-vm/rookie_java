package Mediate.LinkedList;

import java.util.LinkedList;

record Place(String name, int distance) {
}

public class LLC {
    public static void main(String[] args) {
        LinkedList<Place> placesToVisit = new LinkedList<>();
    }

    public static void addPlace(LinkedList<Place> list , Place place){
        if(list.contains(place)){
            System.out.println("Found Duplicate ->"+place);
            return;
        }

        list.add(place);
    }

}
