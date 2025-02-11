import java.util.Scanner;

public class FibonacciFolge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long eingabe = sc.nextInt();
        sc.close();
        for (int i = 1; i < eingabe; i++) {
            long aus = Rechner(i);
            System.out.println(i + " : " + aus);
        }

    }

    public static long Rechner(long n) {
        if (n < 2) {
            return n;
        } else {
            return Rechner(n - 1) + Rechner(n - 2);
        }
    }
}
