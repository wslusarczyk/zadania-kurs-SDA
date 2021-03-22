import java.util.Scanner;

/**
 * Napisz program, który wydrukuje tabliczke mnożenia dla zakresu podanego przez użytkownika.
 */

public class SevenTask {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Dla podanego zakresu zostanie wydrukowana tabliczka mnożenia ");
            System.out.println("Podaj pierwszą liczbę zakresu ");
            int numberOne = scanner.nextInt();
            System.out.println("Podaj drugą liczbę zakresu ");
            int numberTwo = scanner.nextInt();

            for (int j = 0; j <= numberTwo; j++) {
                int multiplication = numberOne * j;
                System.out.println(numberOne + " * " + j + " = " + multiplication);
            }
        }
    }
}
