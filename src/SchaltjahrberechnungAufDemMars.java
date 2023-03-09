import java.util.Scanner;
public class SchaltjahrberechnungAufDemMars {
    public static void main(String [] args) {
        // Mars hat 6685907 Tage = 1 Marsjahr
        final int MARSJAHR = 6685907;
        // final years 10, 100, 1000 local variables
        final int JAHR10 = 10;
        final int JAHR100 = 100;
        final int Jahr1000 = 1000;
        // Schaltjahrveränderung nach Regel
        int marsJahrMinusSchalttag;
        int marsJahrPlusSchalttag;
        // Scanner um Jahr einzulesen
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ein Jahr ein: ");
        int jahr = scanner.nextInt();
        // Test Schaltjahr
        // durch 2 teilbar -1
        if (jahr >= 5000 && jahr <= 9000) {
            if (jahr % 2 == 0) {
                marsJahrMinusSchalttag = MARSJAHR -1;
                SchaltjahrberechnungAufDemMars.ausgeben(jahr, marsJahrMinusSchalttag);
            }
            // durch 10 teilbar +1
            else if (jahr % 10 == 0) {
                marsJahrPlusSchalttag = MARSJAHR +1;
                SchaltjahrberechnungAufDemMars.ausgeben(jahr, marsJahrPlusSchalttag);

            }
            // durch 100 teilbar -1
            else if (jahr % 100 == 0) {
                marsJahrMinusSchalttag = MARSJAHR -1;
                SchaltjahrberechnungAufDemMars.ausgeben(jahr, marsJahrMinusSchalttag);

            }
            // durch 1000 teilbar +1
            else if(jahr % 1000 == 0) {
                marsJahrPlusSchalttag = MARSJAHR +1;
                SchaltjahrberechnungAufDemMars.ausgeben(jahr, marsJahrPlusSchalttag);

            }
            else {
                System.out.println("Das Marsjahr " + jahr + " hat keinen Schalttag.");
            }
        }
        else {
            System.out.println("Keine korrekte Jahreszahl.");
        }
    }

    // Ausgabe
    public static void ausgeben(int jahr, int marsJahrNachVeraenderung) {
        System.out.println("Das Marsjahr " + jahr + " hat einen Schalttag.");
    }
}
