import java.util.Scanner;

/**
 * Napisz program, który wydrukuje na ekran następujący tekst "To jest komunikat w pętli X",
 * tyle razy ile bedzie chiał użytkownik. Gdzie X to numer wyświetlonego komunikatu.
 */

public class ThreeTask {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Ile razy ma się wyświetlić dany komunkat");

            int amount = scanner.nextInt();
            for (int i = 0; i < amount; i++) {
                System.out.println("To jest komunikat w pętli " + (i + 1));
            }
        }
    }
}
