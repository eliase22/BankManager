public class Main {
    public static void main(String[] args) {

        // Création des objets
        CheckingAccount checking = new CheckingAccount("CHK123", 1000, 500);
        SavingsAccount savings = new SavingsAccount("SVG456", 2000, 3.5);
        COD cod = new COD("COD789", 5000, 12);

        // Affichage
        System.out.println("=== Checking Account ===");
        checking.display();

        System.out.println("\n=== Savings Account ===");
        savings.display();

        System.out.println("\n=== COD Account ===");
        cod.display();

        // Test des setters
        checking.setBalance(1500);
        System.out.println("\nNouveau solde Checking: " + checking.getBalance());
    }
}
