import java.util.Scanner;

/**
 * Napisz program, który pobiera pierwszy raz hasło od użytkownika. Program powinien zapytać użytkownika o wprowadzenie ponownie hasła. W przypadku
 * gdy wprowadzone hasło będzie poprawne, program powinien wydrukować na ekranie tekst "Poprawne hasło", w przeciwnym wypadku,
 * wprowadzone hasło powinno zostać wyświetlone na ekranie, a użytkownik powinien mieć możliwość ponownie wprowadzić hasło od początku.
 */

public class FourTask {
    public static void main(String[] args) {

        checkPassword();

        System.out.println("Hasło zostało wprowadzone poprawnie");
    }

    private static void checkPassword() {
        String userPasswordOne;
        String userPasswordTwo;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Podaj hasło ");
                userPasswordOne = scanner.nextLine();

                System.out.println("Powtórz hasło ");
                userPasswordTwo = scanner.nextLine();

                if (!userPasswordOne.equals(userPasswordTwo)) {
                    System.out.println("Podane hasła są różne");
                }
            } while (!userPasswordOne.equals(userPasswordTwo));
        }
    }
}
