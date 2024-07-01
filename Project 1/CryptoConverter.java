import java.util.Scanner;

public class CryptoConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currency = 0;

        System.out.println("* Herzlich willkommen beim Kryptomenü *"); 
        System.out.println("-------------------------------------");

        while (currency < 1 || currency > 3) {
            System.out.println("Bitte wählen Sie ihre gewünschte Kryptowährung aus: ");
            System.out.println("Bitcoin:\t1");
            System.out.println("Ethereum:\t2");
            System.out.println("Solana:\t\t3");

            if (scanner.hasNextInt()) {
                currency = scanner.nextInt();

                if (currency < 1 || currency > 3) {
                    System.out.println("Ungültige Auswahl. Bitte wählen Sie eine Zahl zwischen 1 und 3.");
                }
            } else {
                System.out.println("Ungültige Eingabe. Bitte geben Sie eine Zahl ein.");
                scanner.next(); 
            }
        }

        
        scanner.close();


        switch(currency) {
            case 1:
                System.out.println("Sie haben Bitcoin gewählt.");
                System.out.println("Bitcoin (BTC) ist eine dezentrale digitale Währung.");
                break;
            case 2:
                System.out.println("Sie haben Ethereum gewählt.");
                System.out.println("Ethereum (ETH) ist eine dezentrale Plattform, die Smart Contracts ermöglicht.");
                break;
            case 3:
                System.out.println("Sie haben Solana gewählt.");
                System.out.println("Solana (SOL) ist eine hochleistungsfähige Blockchain-Plattform.");
                break;
        }
    }
}
