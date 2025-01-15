import java.util.HashMap;
import java.util.Scanner;

public class Zeichen {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Gib etwas ein => ");
        String eingabe = sc.nextLine();
        System.out.print("Sag mir um wie viel du es verschieben willst, aber nur positive Zahlen => ");
        int rotation = sc.nextInt();

        if (rotation < 0) {
            System.out.println("Die Zahl war negativ oder 0!");
            System.exit(0);
        }

        for (int i = 0; i < eingabe.length(); i++) {

            int a = eingabe.codePointAt(i);

            if ((a >= 65 && a <= 90) || (a >= 97 && a <= 122)) {
                a += rotation;
                if (a >= 90 && a <= 91 + rotation) {
                    a -= 26;
                } else if (a >= 122 && a <= 123 + rotation) {
                    a -= 26;
                }
                System.out.print((char) a);
            } else {
                System.out.print((char) a);
            }
        }
        String f = toMorseCode('A');
        System.out.println(f);
        sc.close();
    }

    private static String toMorseCode(char zeichen) {

        HashMap<String, String> codeMap = new HashMap<String, String>();

        codeMap.put("A", ".-");
        codeMap.put("B", "-...");

        zeichen = Character.toUpperCase(zeichen);
        String morsecode = codeMap.get(Character.toString(zeichen));

        if (morsecode != null) {
            return morsecode;
        } else {
            return " ";
        }
    }
}
