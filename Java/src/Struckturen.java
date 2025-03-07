
import java.util.Arrays;

public class Struckturen {

    public record Anschrift(String strasse, String hausnr, String plz, String ort) {
    }

    public record Person(int uid, String vornamen, String nachname, int alter, Anschrift[] anschrift)
            implements Comparable<Person> {

        public int compareTo(Person other) {
            if (this.uid == other.uid) {
                return 0;
            } else {
                if (this.uid < other.uid) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Person[] personen = new Person[3];
        Anschrift[] anschriftenPerson1 = new Anschrift[1];
        anschriftenPerson1[0] = new Anschrift("Hauptstr", "4b", "51234", "Köln");
        personen[0] = new Person(1, "Peter", "Müller", 44, anschriftenPerson1);
        // personen[1] = new Person(2, "Allegra", "Duso", 33, new Anschrift("Bergstr",
        // "17-19", "56231", "Düsseldorf"));
        // personen[2] = new Person(3, "Alla", "Berger", 22);
        // Arrays.sort(personen);
        System.out.println(Arrays.toString(personen));
    }
}
