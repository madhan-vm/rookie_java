package OOPs.Inheritance.codes;

public class CarpetCostCalculator {

}

class Floor {
    double width=0;
    double length=0;

    public Floor(double width, double length) {
        if (width < 0) {
            width = 0;
        }

        if (length < 0) {
            length = 0;
        }

        this.width = width;
        this.length = length;
    }

    public double getArea() {
        return width * length;
    }

}

class Carpet {
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            cost = 0;
        }

        this.cost = cost;

    }

    public double getCost() {
        return cost;
    }

}

class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {

        Floor newFloor = new Floor(0,0);
        Carpet carpet = new Carpet(0);

        return newFloor.getArea()*getTotalCost();
    }
}
