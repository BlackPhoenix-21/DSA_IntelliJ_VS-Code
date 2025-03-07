
import java.io.Console;

public class Main {

    public static void main(String[] args) {

        String eingabe = "Hello";
        // char zeichen = 'ä';

        Console console = System.console();
        eingabe = console.readLine("Gib was ein -> ");

        // System.out.println("Hello world!");
        // System.out.println(eingabe.length());

        // byte[] bytes = eingabe.getBytes();

        // System.out.println(bytes.length);

        int zahl = Integer.parseInt(eingabe);

        System.out.println(zahl + 10);
    }
}