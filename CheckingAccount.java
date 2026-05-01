public class CheckingAccount extends BankAccount {
    private double limit;

    public CheckingAccount(String account, double balance, double limit) {
        super(account, balance);
        this.limit = limit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Limite: " + limit);
    }
}
