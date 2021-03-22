import java.util.Scanner;

/**
 * Napisz program, który pobiera imie od użytkownika, najpierw jednak wypisze na ekran słowa "Podaj swoje imie". Imię powinno zostać
 * wydrukowane na ekran. Jeśli podane imię zgadza się z "John Wick", to na ekran program powinien wypisać "Widzę, że znów pracujesz
 * John", w przeciwnym przyypadku program powinien wydrukować na ekran "Witaj, [xyz]", gdzie [xyz], powinno zostać zastąpione wartością podaną przez użytkownika.
 */

public class TwoTask {
    public static void main(String[] args) {
        String name = getStringName();
        String patternName = "John Wick";
        checkName(name, patternName);
    }

    private static void checkName(String name, String patternName) {
        if(name.equals(patternName)){
            System.out.println("Widzę że znowu pracujesz John");
        }else{
            System.out.println("Witaj " + name);
        }
    }

    private static String getStringName() {
        try ( Scanner scanner = new Scanner(System.in)) {
            System.out.println("Podaj swoje imię");
            return scanner.nextLine();
        }
    }
}
