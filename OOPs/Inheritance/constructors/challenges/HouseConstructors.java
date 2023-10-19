package OOPs.Inheritance.constructors.challenges;

public class HouseConstructors {

    
    public static void main(String[] args) {
        House blueHouse = new House("blue");
        System.out.println(blueHouse.getColor());

        House anotherHouse = blueHouse;
        System.out.println(anotherHouse.getColor());

        anotherHouse.setColor("red");
        System.out.println(blueHouse.getColor());

        blueHouse.setColor("not blue");
        System.out.println(anotherHouse.getColor());


        House greenHouse = new House("greeen");
        anotherHouse = greenHouse;

    
        System.out.println(anotherHouse.getColor());
        System.out.println(blueHouse.getColor());
    }
}
