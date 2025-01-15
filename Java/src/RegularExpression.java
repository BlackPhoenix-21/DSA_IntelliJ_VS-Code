import java.util.Scanner;

public class RegularExpression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Gib was ein");
        String eingabe = sc.nextLine();

        // if (eingabe.matches("(0|49 )[0-9]{4} [0-9]{4} [0-9]{3}")) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }
        if (eingabe.matches(".+@.{2,}\\.[a-zA-Z]{2,}")) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
        sc.close();
    }
}
