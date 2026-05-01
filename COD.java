public class COD extends BankAccount{
    private int duration; // durée en mois

    public COD(String account, double balance, int duration) {
        super(account, balance);
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Durée (mois): " + duration);
    }
}
