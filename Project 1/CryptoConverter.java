import java.util.Scanner;

public class CryptoConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Herzlich willkommen beim Kryptomenü"); 
        System.out.println("-------------------------------------");

        System.out.println("Geben Sie den Betrag in Bitcoins ein: ");
        double bitcoin = scanner.nextDouble();

        System.out.println("Geben Sie den Wechselkurs (Bitcoins zu Franken) ein:");
        double exchangeRate = scanner.nextDouble();

        double francs = bitcoin * exchangeRate;

        System.out.printf("%.2f Bitcoins entsprechen %.2f Franken%n", bitcoin, francs);

        scanner.close();
    }
}



