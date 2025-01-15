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
    }
}
