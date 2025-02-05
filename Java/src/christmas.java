import java.util.Scanner;

public class christmas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int großeBaum = 5;

        System.out.println("Wie groß soll der Bau sein?");
        großeBaum = sc.nextInt();
        System.out.println("");
        System.out.println("Der Baum wird " + großeBaum + " groß");

        String star = "*";
        String ausgabe = "";

        for (int i = 0; i <= großeBaum; i++) {
            ausgabe = "";
            for (int x = 0; x < großeBaum - i; x++) {
                ausgabe += " ";
            }
            if (i == 0) {
                ausgabe += star;
            } else if (i == großeBaum) {
                for (int x = 0; x < großeBaum; x++) {
                    ausgabe += " ";
                }
                ausgabe += star;
            } else {
                for (int x = 0; x <= i * 2; x++) {
                    ausgabe += star;
                }
            }

            System.out.println(ausgabe);
        }
        sc.close();
    }
}
