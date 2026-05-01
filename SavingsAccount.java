public class SavingsAccount extends BankAccount{
    private double interestRate;

    public SavingsAccount(String account, double balance, double interestRate) {
        super(account, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Taux d'intérêt: " + interestRate);
    }
}
