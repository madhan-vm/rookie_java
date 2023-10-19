package OOPs.Inheritance.challenge;

public class BankAccounts {
    private int accountNumber;
    private double accountBalance = 0.0;
    private String customerName = "";
    private String email;
    private int phoneNumber;

    public BankAccounts() {
        System.out.println("Empty");
    }

    public BankAccounts(int accountNumber, double accountBalance, String customerName, String email, int phoneNumber) {
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    // setters
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void setCustomerName(String customerName) {

        if (customerName == "") {
            this.customerName = "Anonymous name";
            return;
        }
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositBalance(int depositedAmount) {
        accountBalance += depositedAmount;
        System.out.println("The amount of $" + depositedAmount + " is Deposited");
        System.out.println("Current Balance stands at $" + (depositedAmount));
    }

    public void withDrawBalance(int withDrawAmount) {
        if (withDrawAmount > accountBalance) {
            System.out.println(
                    "You Cannot Withdraw" + withDrawAmount + " since $" + accountBalance + " is the Account Balance");
            return;
        }
        if (accountBalance < 0) {
            System.out.println(" There is not enough to withdraw");
            return;
        }
        accountBalance -= withDrawAmount;
        System.out.println("The amount of $" + withDrawAmount + " is withdrawn");
        System.out.println("Current Balance stands at $" + (accountBalance));

    }

    public void checkBalance() {

        System.out.println("Name :" + customerName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Email : " + email);
        System.out.println("Balance in Account $" + accountBalance);
        System.out.println("PhoneNumber : " + phoneNumber);

    }
}
