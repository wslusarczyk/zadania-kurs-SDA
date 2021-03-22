import java.util.Random;

/**
 *Napisz program, który stworzy tablicę dla 10 elementów typu integer. Program powinien wypełnić tablicę losowymi liczbami z zakresu od
 * [-10..10], a następnie: wydrukuje zawartość tablicy na ekran wydrukuje najmniejszą (minimalną) wartość z tablicy wydrukuje największą
 * (maksymalną) wartość z tablicy
 */

public class SixTask {

    public static void main(String[] args) {

        int[] list = new int[10];
        Random r = new Random();
        for(int i = 0; i<10; i++){
            list[i] = -10 + r.nextInt(20 );
            System.out.println("Wartość " + i + " = "+ list[i]);
        }

        int max = list[0];

        max = searchMaxValue(list, max);
        System.out.println("Wartość max = " + max);

        int min = searchMinValue(list);
        System.out.println("Wartość min = " + min);
    }

    private static int searchMinValue(int[] list) {
        int min = list[0];
        for (int i = 0; i < 10; i++){
            if (min > list[i]){
                min = list[i];
            }
        }
        return min;
    }

    private static int searchMaxValue(int[] list, int max) {
        for(int i = 0; i<10; i++){
            if(max < list[i]){
                max = list[i];
            }
        }
        return max;
    }
}
