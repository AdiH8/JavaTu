package Bank;

public class Bank {
    public static void main(String[] args) {

        BankAccount account = new BankAccount(5,100);
        SavingsAccount savingsAccount = new SavingsAccount(6,265,1.2);
        account.getAccountInfo();
       //savingsAccount.calculateInterest();

        account.makeTransaction(savingsAccount,20);
        account.getAccountInfo();

        account.withdraw(20);

    }
}