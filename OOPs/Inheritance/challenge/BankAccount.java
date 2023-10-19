package OOPs.Inheritance.challenge;

public class BankAccount {

    public static void main(String[] args) {
        BankAccounts account = new BankAccounts();
        account.checkBalance();

        BankAccounts MadhanAccount = new BankAccounts(123435, 01000,"Madhan", "madhan@example", 589740);
        MadhanAccount.getAccountBalance();
        MadhanAccount.depositBalance(1000);
        MadhanAccount.checkBalance();

        account.setCustomerName("Madhan");
        account.setAccountBalance(1000);
        account.setAccountNumber(1234567890);
        account.setEmail("madhan@example.com");
        account.setPhoneNumber(900900900);
        account.checkBalance();


        account.depositBalance(10);
        account.withDrawBalance(9);
        account.checkBalance();

        account.withDrawBalance(500);
        account.withDrawBalance(600);

        
    }

}
