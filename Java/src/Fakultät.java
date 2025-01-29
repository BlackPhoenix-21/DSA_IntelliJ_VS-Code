import java.util.Scanner;

public class Fakultät {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib mir n ===> ");
        int n = sc.nextInt();
        sc.close();

        System.out.printf("Die Fakultät von %s ist %d\n", n, Faculty(n));
    }

    // private static int Faculty(int n) {
    // int er = 1;

    // for (int i = 1; i <= n; i++) {
    // er *= i;
    // }
    // return er;
    // }

    private static int Faculty(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Faculty(n - 1);
        }
    }
}