import java.io.*;
import java.nio.charset.Charset;

public class BBW {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("IBM850")));

        System.out.print("Gib was ein ==> ");
        String eingabe = in.readLine();

        eingabe = eingabe.toLowerCase();
        int buchstabensumme = 0;

        for (int i = 0; i < eingabe.length(); i++) {
            String zeichen = eingabe.substring(i, i + 1);

            // zeichen ein lateinischer Buchstaben?
            if (zeichen.matches("[a-z]")) {
                buchstabensumme += zeichen.codePointAt(0) - 'a' + 1;
            }
            if (zeichen.matches("[0-9]")) {
                buchstabensumme += Integer.parseInt(zeichen);
            }

            if (zeichen.equals("ä")) {
                buchstabensumme += 27;
            }
            if (zeichen.equals("ö")) {
                buchstabensumme += 28;
            }
            if (zeichen.equals("ü")) {
                buchstabensumme += 29;
            }
            if (zeichen.equals("ß")) {
                buchstabensumme += 30;
            }

        }
        System.out.println(buchstabensumme);

        int ergebnis = quersumme(buchstabensumme);
        System.out.println(ergebnis);

        int ergebnis_iteriert = ergebnis;

        while (ergebnis_iteriert >= 10) {
            ergebnis_iteriert = quersumme(ergebnis);
        }

        System.out.println(ergebnis_iteriert);

    }

    private static int quersumme(int zahl) {
        int quersumme = 0;
        String buchstabenWortWert = Integer.toString(zahl);

        for (int i = 0; i < buchstabenWortWert.length(); i++) {
            String ziffer = buchstabenWortWert.substring(i, i + 1);
            quersumme += Integer.parseInt(ziffer);
        }

        return quersumme;
    }
}
