import java.util.Arrays;
import java.util.Random;

public class DiceArray {
    public static void main(String[] args) {

        Random rd = new Random();

        int[] counter = { 0, 0, 0, 0, 0, 0 };

        for (int i = 1; i <= 1000; i++) {

            int zahl = rd.nextInt(6) + 1;

            counter[zahl - 1]++;
        }

        int max = 0;

        for (int i = 0; i < counter.length; i++) {

            if (counter[i] > max) {
                max = counter[i];
            }

            System.out.println("Die Zahl " + (i + 1) + " wurde " + counter[i] + " gewürfelt");
        }

        for (int i = 0; i < counter.length; i++) {

            if (counter[i] == max) {
                System.out.println("Meiste gewürfelte Zahl ist " + (i + 1) + " mit " + max + " würfen");
            }
        }

        int[] sortiert = ArraySort(counter);
        int[] sortiert2 = ArraySort2(counter);

        System.out.println(Arrays.toString(counter));
        System.out.println(Arrays.toString(sortiert));
        System.out.println(Arrays.toString(sortiert2));
    }

    private static int[] ArraySort(int[] zahlen) {

        int[] numbers = zahlen.clone();

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                // System.out.println("Vergleiche " + numbers[i] + " mit " + numbers[j]);
                if (numbers[i] > numbers[j]) {
                    int hold = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = hold;
                    // System.out.println("Tausche " + numbers[i] + " mit " + numbers[j]);
                }
            }
        }
        return numbers;
    }

    private static int[] ArraySort2(int[] zahlen) {
        int[] numbers = zahlen.clone();
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < numbers.length - 1; i++) {
                System.out.println("Vergleiche " + numbers[i] + " mit " + numbers[i + 1]);
                if (numbers[i] > numbers[i + 1]) {
                    swapped = true;
                    int hold = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = hold;
                    System.out.println("Tausche " + numbers[i] + " mit " + numbers[i + 1]);
                }

            }
        }
        return numbers;
    }
}