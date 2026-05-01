public class BankAccount {
    protected String account;
    protected double balance;

    // Constructeur
    public BankAccount(String account, double balance) {
        this.account = account;
        this.balance = balance;
    }

    // Getter et Setter
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Affichage
    public void display() {
        System.out.println("Compte: " + account);
        System.out.println("Solde: " + balance);
    }
}
