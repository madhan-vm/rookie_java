package OOPs.Inheritance.constructors.challenges;

public class Customer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    // gwtters
    public String getName() {
        return name;
    }

    public double getCresitLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    // constructors

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public Customer() {
        this("Madhan ", 500.23, "madhan@exampl.com");
    }

    public Customer(String name, String emailAddress) {
        this(name, 234.67, emailAddress);
    }

}
