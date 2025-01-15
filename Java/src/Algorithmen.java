import java.util.Scanner;

public class Algorithmen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib mir eine Zahl: ");
        int zahl = sc.nextInt();

        int er = 0;

        er = zahl * (zahl + 1) / 2;

        // for (int i = 1; i <= zahl; i++) {
        // er += i;
        // }
        System.out.println("Das ergebnis ist " + er);
        sc.close();
    }
}