package Bank;

public class SavingsAccount extends BankAccount{
    private double interestRate;
    public SavingsAccount(int accountNumber, double balance, double interest) {
        super(accountNumber, balance);
        setInterest(interest);
    }
    public double getInterest() {
        return interestRate;
    }

    public void setInterest(double interest) {
        this.interestRate = interest;
    }

    public void calculateInterest(){
        System.out.println("Balance before interest: "+ getBalance());
        System.out.println("interest rate: "+ interestRate);
        double interest = getBalance()*(interestRate/100);
        setBalance(getBalance()+interest);
        System.out.println("Interest: "+ interest);
        System.out.println("Balance after interest: "+ getBalance());

    }
}
