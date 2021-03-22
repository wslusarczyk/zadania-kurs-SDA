import java.util.Scanner;

/**
 * Przenalizuj poniższy kod, zawierający metodę fizzBuzz. Działanie programu polega na pobraniu liczby całkowitej od użytkownika i
 * sprawdzeniu trzech warunków: jeśli liczba jest podzielna przez 3 to program powinien wydrukować słowo "fizz" jeśli liczba jest
 * podzielna przez 5 to program powinien wydrukować słowo "buzz" jeśli liczba jest podzielna przez 3 i 5 to program powinien wydrukować
 * słowo "fizzbuzz" Niestety poniższy program zawiera błędy, nie kompiluje się. Popraw błędy aby przywrócić prawidłowe działanie
 * programu, gdy użytkownik podaje liczbę wejściową.
 */

public class NineTask {


    public static void main(String[] args) {
        try (Scanner readNumber = new Scanner(System.in)) {
            System.out.println("Podaj liczbę: ");
            int number = readNumber.nextInt();
            String fizzBuzzResult = fizzBuzz(number);
            System.out.println(fizzBuzzResult);
        }
    }

    public static String fizzBuzz(int number) {
        if (number % 5 == 0) {
            if (number % 3 == 0) {
                return "fizzbuzz";
            } else {
                return " buzz";
            }
        } else if (number % 3 == 0) {
            return "fizz";
        }
        return String.valueOf(number);
    }
}

