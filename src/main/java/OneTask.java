import java.util.Scanner;

/**
 * Napisz program, który pobiera hasło od użytkownika, najpierw jednak wypisze na ekran słowa "Poproszę hasło". Pobrane hasło powinno
 * zostać wypisane na ekran. Jeśli hasło zgadza się z hasłem wzorcowym "secret", to na ekran powinien zostać wypisany tekst "Witaj w
 * tajnym miejscu", w przeciwnym przypadku zakończ działanie programu.
 */

public class OneTask {

    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {

            System.out.println("Proszę podaj hasło ");
            String passowrd = scanner.next();

            System.out.println("Podane hasło to: " + passowrd);
            String patternPassword = "secret";

            if (passowrd.equals(patternPassword)) {
                System.out.println("Witaj w tajnym miesjcu");
            } else {
                System.out.println("Podane hasło jest niepoprawne");
            }
        }
    }
}
