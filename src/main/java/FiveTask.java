import java.util.Scanner;

/**
 * Napisz program, który pobierze od użytkownika, dodatnią liczbę całkowitą, a następnie wypisze wszystkie liczby nieparzyste, nie
 * większe od tej liczby.
 */

public class FiveTask {
    public static void main(String[] args) {
        int number = getNumberUser();
        for (int i = 0; i < number; i++) {
            int oddNumber = i + 1;
            int division = (oddNumber) % 2;
            checkDivision(oddNumber, division);
        }
    }

    private static int getNumberUser() {
        System.out.println("Podaj dodatnią liczbę całkowitą ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void checkDivision(int oddNumber, int division) {
        if (division == 1) {
            System.out.println(oddNumber);
        }
    }
}
