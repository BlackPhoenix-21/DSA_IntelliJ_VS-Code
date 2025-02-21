
public class FibonacciFolge {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            long aus = Rechner(i);
            System.out.println(i + " : " + aus);
        }
        FibonacciSequence(50);
        long aus = 0;
        try {
            aus = FibonacciNumber(-1);
        } catch (IllegalArgumentException e) {
            aus = FibonacciNumber(10);
        }
        System.out.println(aus);
    }

    public static long Rechner(long n) {
        if (n < 2) {
            return n;
        } else {
            return Rechner(n - 1) + Rechner(n - 2);
        }
    }

    private static long FibonacciNumber(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Das Argument dasrf nicht negativ sein!");
        }
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return FibonacciNumber(n - 2) + FibonacciNumber(n - 1);
    }

    private static void FibonacciSequence(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Das Argument dasrf nicht negativ sein!");
        }
        if (n == 0) {
            System.out.print("0");
            return;
        }
        long prex = 1;
        long prevprevx = 1;
        System.out.print("0, 1");

        for (int i = 2; i <= n; i++) {
            long newx = prevprevx + prex;
            System.out.print(", " + newx);
            prevprevx = prex;
            prex = newx;
        }
    }
}
