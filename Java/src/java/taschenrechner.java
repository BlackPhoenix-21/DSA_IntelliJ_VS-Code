import java.util.Scanner;
import java.util.Stack;

public class taschenrechner {

    public static Stack<Integer> zahlen = new Stack<Integer>();

    public static void main(String[] args) {
        String aus;
        int ergebnis;

        aus = Eingabe("Bitte im folgenden Format eingeben:" +
                " Zahl1 Zahl2 Zahl3 RechenOp1 RechenOp2 oder Zahl1 Zahl2 RechenOp1 Zahl3 RechenOp2");

        String verarbeitung[] = aus.split(" ");

        for (int i = 0; i < verarbeitung.length; i++) {
            if (verarbeitung[i].matches("[0-9]+")) {
                zahlen.push(Integer.parseInt(verarbeitung[i]));
            } else if (verarbeitung[i].matches("[-+*/]")) {
                Rechner(verarbeitung[i]);
            } else {
                System.out.println("Ungültiger Eingabewert: " + verarbeitung[i]);
            }
        }
        ergebnis = zahlen.pop();
        System.out.println(ergebnis);

    }

    public static String Eingabe(String var) {
        Scanner sc = new Scanner(System.in);
        System.out.println(var);
        String eingabe = sc.nextLine();
        if (!eingabe.matches("[0-9]+ [0-9]+ (([0-9]+ [-+*/] [-+*/])|([-+*/] [0-9]+ [-+*/]))")) {
            eingabe = Eingabe("Bitte erneut eingeben");
        }
        sc.close();
        return eingabe;
    }

    public static void Rechner(String rechenOPs) {

        int zahl1 = zahlen.pop();
        int zahl2 = zahlen.pop();
        int ergebnis = 0;
        switch (rechenOPs) {
            case "+":
                ergebnis = zahl2 + zahl1;
                break;
            case "-":
                ergebnis = zahl2 - zahl1;
                break;
            case "*":
                ergebnis = zahl2 * zahl1;
                break;
            case "/":
                ergebnis = zahl2 / zahl1;
                break;

            default:
                break;
        }
        zahlen.push(ergebnis);

    }
}
