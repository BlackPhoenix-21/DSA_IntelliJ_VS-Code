
public class BitOP {
    public static void main(String[] args) {

        // boolean x = 10 < 100 || 20 > 100;
        // boolean y = !(10 < 100 && 20 > 100);

        byte z = 10 | 24; // Oder-Verknüpfung

        z = 8 ^ 4; // XOR-Verknüpfung

        z = 10 & 24; // Und-Verknüpfung

        z = ~4; // bit Invertieren

        z = 9 << 1; // Links Verschiebung der Bits

        z = 9 >> 1; // Rechts Verschiebung der Bits

        System.out.println(z);

        String s = "17 + 4";

        String[] p = s.split(" +");

        System.out.println(p[0]);

    }
}
