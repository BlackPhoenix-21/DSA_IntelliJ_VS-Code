
public class Vektor {

    public static void main(String[] args) {
        // Vector2 a = new Vector2(3, 0);
        // Vector2 b = new Vector2(0, 4);

        // System.out.println(a.compareTo(b));
        // System.out.println(b.compareTo(a));

        // Vector2 c = a.add(b);
        // System.out.println(c);

        // Vector3 d = new Vector3(3, 0, 0);
        // Vector3 e = new Vector3(0, 4, 0);

        // System.out.println(d.compareTo(e));
        // System.out.println(e.compareTo(d));

        // Matrix f = new Matrix(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16);

        Matrix g = Matrix.CreatTranslation(new Vector3(1, 2, 3));
        g.x();
        System.out.println(g.toString());
    }
}