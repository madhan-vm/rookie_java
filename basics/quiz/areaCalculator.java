package basics.quiz;

public class areaCalculator {
    final static double pi = Math.PI;

    public static void main(String[] args) {
        System.out.println( Area(23));
         System.out.println( Area(10,10));

    }

    public static double Area(int radius) {
        if (radius < 0) {
            return -1;
        }
        return (float)pi * radius * radius;

    }

    public static double Area(int length, int breadth) {
        if (breadth < 0 || length < 0) {
            return -1;
        }
        return (float)length * breadth;

    }

}
