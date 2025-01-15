import java.io.*;
import java.nio.charset.Charset;

public class BuchstabenWortWert {
    public static void main(String[] args) throws IOException {

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in, Charset.forName("IBM850")));

        System.out.print("Gib was ein ==> ");
        String eingabe = in.readLine();

        eingabe = eingabe.toLowerCase();
        int wortwert = 0;
        int quersumme = 0;
        int querquersumme = 0;
        long wwprodukt = 1;

        for (int i = 0; i < eingabe.length(); i++) {
            int a = eingabe.codePointAt(i);

            if (a >= 97 && a <= 122) {
                a -= 96;
            } else if (a >= 48 && a <= 57) {
                a -= 48;
            } else if (a == 228) {
                a = 27;
            } else if (a == 246) {
                a = 28;
            } else if (a == 252) {
                a = 29;
            } else if (a == 223) {
                a = 30;
            } else {
                a = 0;
            }
            if (a != 0) {
                wortwert += a;
                wwprodukt *= a;
            }
        }
        System.out.println(wortwert);
        System.out.println(wwprodukt);
        String b = Integer.toString(wortwert);

        for (int i = 0; i < b.length(); i++) {

            char a = b.charAt(i);
            String e = Character.toString(a);

            quersumme += Integer.parseInt(e);
        }
        System.out.println(quersumme);
        String c = Integer.toString(quersumme);

        if (Integer.toString(quersumme).length() != 1) {

            // System.out.println("Quersumme mehrstellig");

            for (int i = 0; i < c.length(); i++) {
                char a = c.charAt(i);
                String f = Character.toString(a);

                querquersumme += Integer.parseInt(f);
            }
        } else {
            querquersumme = quersumme;
            // System.out.println("Quersumme nicht mehrstellig");
        }
        System.out.println(querquersumme);

    }
}