
public record Vector2(float x, float y) implements Comparable<Vector2> {
    public int compareTo(Vector2 otherVector2) {
        float lenght = getLenght();
        float otherlenght = otherVector2.getLenght();
        if (lenght == otherlenght) {
            return 0;
        } else {
            if (lenght < otherlenght) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public float getLenght() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Vector2 add(Vector2 otherVector2) {
        return new Vector2(this.x + otherVector2.x, this.y + otherVector2.y);
    }
}