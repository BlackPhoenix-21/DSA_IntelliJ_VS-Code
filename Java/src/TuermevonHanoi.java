import java.util.Scanner;
import java.util.Stack;
import java.util.Date;

public class TuermevonHanoi {

    public static int counter = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anzahlScheiben = 4;

        System.out.println("Gib die Anzahl der Scheiben an.");
        anzahlScheiben = sc.nextInt();

        Date anfang = new Date();

        Stack<Integer> stabA = new Stack<Integer>();
        Stack<Integer> stabB = new Stack<Integer>();
        Stack<Integer> stabC = new Stack<Integer>();

        for (int i = 0; i <= anzahlScheiben; i++) {
            stabA.push(i);
        }
        System.out.println("Lösung für die Türme von Hanoi mit " + anzahlScheiben + " Scheiben");

        hanoi(anzahlScheiben, stabA, stabC, stabB, 'A', 'C', 'B');

        Date ende = new Date();

        long zeit = ende.getTime() - anfang.getTime();

        System.out.println("Die Zeit die das Programm für den Ablauf gebraucht hat in Millisekunden: " + zeit);
        System.out.println("Das Programm hat " + counter + " Züge gebraucht");
        sc.close();
    }

    public static void hanoi(int n, Stack<Integer> von, Stack<Integer> nach, Stack<Integer> hilf, char vonName,
            char nachNamen, char hilfName) {
        counter++;
        if (n == 1) {
            bewegeScheibe(von, nach, vonName, nachNamen);
        } else {
            hanoi(n - 1, von, hilf, nach, vonName, hilfName, nachNamen);
            bewegeScheibe(von, nach, vonName, nachNamen);
            hanoi(n - 1, hilf, nach, von, hilfName, nachNamen, vonName);
        }
    }

    public static void bewegeScheibe(Stack<Integer> von, Stack<Integer> nach, char vonName, char nachNamen) {
        int scheibe = von.pop();
        nach.push(scheibe);
        System.out.println("Bewege Scheibe " + scheibe + " von " + vonName + " nach " + nachNamen);
    }
}