package OOPs.Inheritance.challenge.Uff;

public class Main {

    public static void main(String[] args) {
        Employee tim = new Employee("Tim", "11/11/1995", "01/01/2020");
        System.out.println(tim);
        System.out.println(tim.getAge());
        System.out.println(tim.collectPay());

        SalariedEmployee Madhan = new SalariedEmployee("Madhan", "13/09/2004",
                "12/10/1994", 35000);
        System.out.println(Madhan);

        System.out.println("Salary ==" + Madhan.collectPay());
        Madhan.retire();
        System.out.println("Salary ==" + Madhan.collectPay());

        HourlyEmployee Balaji = new HourlyEmployee("Balaji", "14/90/2000", "12/3/02020", 15);
        System.out.println(Balaji);

        System.out.println("Balaji Paycheck " + Balaji.collectPay());
        System.out.println("Balaji DoublePay " + Balaji.getDoublePay());

    }

}
