import java.io.Console;

public class Zeichen_L {
    public static void main(String[] args) {

        int rotation = 3;
        Console console = System.console();
        String eingabe = console.readLine("Gib was ein => ");

        for (int i = 0; i < eingabe.length(); i++) {

            // System.out.print((char) (zeichen[i] + rotation));

            // zeichen[i] = (char) (zeichen[i] + rotation);

            // System.out.println(zeichen[i]);

            int zeichen = eingabe.codePointAt(i);
            zeichen = zeichen + rotation;
            System.out.print(zeichen);

        }

        // eingabe = zeichen.toString();

        System.out.println(eingabe);

    }
}
