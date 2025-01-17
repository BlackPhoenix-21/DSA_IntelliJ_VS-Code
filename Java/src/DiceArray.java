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
                System.out.println("Meiste gewürfelte Zahl ist " + i + " mit " + max + " würfen");
            }
        }

        int[] sortiert = ArrySort(counter);

        for (int i = 0; i < counter.length; i++) {
            System.out.print(counter[i] + ", ");
        }

        System.out.println(" ");

        for (int i = 0; i < sortiert.length; i++) {
            System.out.print(sortiert[i] + ", ");
        }
    }

    private static int[] ArrySort(int[] zahlen) {

        int[] numbers = new int[zahlen.length];

        for (int i = 0; i < zahlen.length; i++) {
            numbers[i] = zahlen[i];
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int hold = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = hold;
                }
            }
        }

        return numbers;
    }
}