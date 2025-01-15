import java.util.Random;

public class Dice {
    public static void main(String[] args) {

        int zahl1 = 0;
        int zahl2 = 0;
        int zahl3 = 0;
        int zahl4 = 0;
        int zahl5 = 0;
        int zahl6 = 0;

        int groß = 0;
        int großzahl = 0;

        for (int i = 1; i <= 1000; i++) {
            Random rd = new Random();
            int zahl = rd.nextInt(6) + 1;
            System.out.println(zahl);

            switch (zahl) {
                case 1:
                    zahl1++;
                    break;
                case 2:
                    zahl2++;
                    break;
                case 3:
                    zahl3++;
                    break;
                case 4:
                    zahl4++;
                    break;
                case 5:
                    zahl5++;
                    break;
                case 6:
                    zahl6++;
                    break;
                default:
                    System.out.println("Out of Bound");
                    break;
            }
        }
        Ausgabe(zahl1, 1);
        Ausgabe(zahl2, 2);
        Ausgabe(zahl3, 3);
        Ausgabe(zahl4, 4);
        Ausgabe(zahl5, 5);
        Ausgabe(zahl6, 6);

        if (groß < zahl1) {
            groß = zahl1;
            großzahl = 1;
        }
        if (groß < zahl2) {
            groß = zahl2;
            großzahl = 2;
        }
        if (groß < zahl3) {
            groß = zahl3;
            großzahl = 3;
        }
        if (groß < zahl4) {
            groß = zahl4;
            großzahl = 4;
        }
        if (groß < zahl5) {
            groß = zahl5;
            großzahl = 5;
        }
        if (groß < zahl6) {
            groß = zahl6;
            großzahl = 6;
        }

        System.out.println("Die Zahl " + großzahl + " wurde am meisten gewürfelt mit einer Anzahl von " + groß);

    }

    public static void Ausgabe(int zahl, int ziffer) {
        System.out.println("Es wurde die Zahl " + ziffer + ", " + zahl + " gewürfelt");
    }
}
