package Bank;

public class BankAccount implements Transaction {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        setAccountNumber(accountNumber);
        setBalance(balance);
    }

    public void setAccountNumber(int accountNumber) {
        if (accountNumber > 0) {
            this.accountNumber = accountNumber;
        } else {
            throw new IllegalArgumentException("Account number must be positive");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance;
    }

    public void getAccountInfo(){
        System.out.println("ID: "+accountNumber);
        System.out.println("Balance: "+ balance);
    }

    public void withdraw(double amount){
        if (amount>getBalance()){
            throw new IllegalArgumentException("Not enough balance!");
        }
        else{
            setBalance(getBalance()-amount);
        }
    }

    @Override
    public void makeTransaction(BankAccount account, double amount) {
        setBalance(getBalance()-amount);
        account.setBalance(account.getBalance()+amount);
        System.out.println("Bank.Transaction amount["+amount+"] from account: " + getAccountNumber() + " to "+ account.getAccountNumber() );
    }
}
