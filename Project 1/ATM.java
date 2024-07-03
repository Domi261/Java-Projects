import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {

        final int CORRECT_PIN = 5429;
        int information = 1;
        int last_transactions = 2;
        int withdraw = 3;
        int deposit = 4;
        int cancel = 5;
        Scanner scanner = new Scanner(System.in);

        System.out.println("######################################");
        System.out.println("# Herzlich Willkommen bei Tomi Bank  #");
        System.out.println("######################################");

        boolean authenticated = false;
        
        while (!authenticated) {
            System.out.println("Bitte geben Sie Ihren PIN-Code ein:");

            try {
                int inputInt = scanner.nextInt();

                if (inputInt == CORRECT_PIN) {
                    System.out.println("PIN korrekt. Willkommen bei Ihrem Konto.");
                    authenticated = true;
                   
                } else {
                    System.out.println("Falscher PIN. Bitte versuchen Sie es erneut.");
                }
            } catch (Exception e) {
                System.out.println("Ungültige Eingabe! Bitte geben Sie eine gültige Zahl ein.");
                scanner.next(); 
            }
        }

        System.out.println("Bitte aus einer der folgenden Funtkionen auswählen:");
        System.out.println("1:\t Kontoinformationen");
        System.out.println("2:\t Letzte Transaktionen");
        System.out.println("3:\t Geld abheben");
        System.out.println("4:\t Geld einzahlen");
        System.out.println("5:\t Abbruch");    
        
        scanner.close();

    }
}
