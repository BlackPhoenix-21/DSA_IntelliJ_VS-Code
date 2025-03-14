public class Matrix {

    private float m11, m12, m13, m14, m21, m22, m23, m24, m31, m32, m33, m34, m41, m42, m43, m44 = 0;

    public Matrix(float m11, float m12, float m13, float m14, float m21, float m22, float m23, float m24, float m31,
            float m32, float m33, float m34, float m41, float m42, float m43, float m44) {
        this.m11 = m11;
        this.m12 = m12;
        this.m13 = m13;
        this.m14 = m14;
        this.m21 = m21;
        this.m22 = m22;
        this.m23 = m23;
        this.m24 = m24;
        this.m31 = m31;
        this.m32 = m32;
        this.m33 = m33;
        this.m34 = m34;
        this.m41 = m41;
        this.m42 = m42;
        this.m43 = m43;
        this.m44 = m44;
    }

    public static Matrix identity() {
        return new Matrix(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1);
    }

    public static Matrix CreatTranslation(float x, float y, float z) {
        return new Matrix(1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, x, y, z, 1);
    }

    public static Matrix CreatTranslation(Vector3 v) {
        return CreatTranslation(v.getX(), v.getY(), v.getZ());
    }

    public void x() {
        System.out.println(m11);
    }

    public String toString() {
        return m11 + " " + m12 + " " + m13 + " " + m14 + "\n" + m21 + " " + m22 + " " + m23 + " " + m24 + "\n" + m31
                + " " + m32 + " " + m33 + " " + m34 + "\n" + m41 + " " + m42 + " " + m43 + " " + m44;
    }

    public Matrix multiply(Matrix other) {
        return new Matrix(
                m11 * other.m11 + m12 * other.m21 + m13 * other.m31 + m14 * other.m41,
                m11 * other.m12 + m12 * other.m22 + m13 * other.m32 + m14 * other.m42,
                m11 * other.m13 + m12 * other.m23 + m13 * other.m33 + m14 * other.m43,
                m11 * other.m14 + m12 * other.m24 + m13 * other.m34 + m14 * other.m44,
                m21 * other.m11 + m22 * other.m21 + m23 * other.m31 + m24 * other.m41,
                m21 * other.m12 + m22 * other.m22 + m23 * other.m32 + m24 * other.m42,
                m21 * other.m13 + m22 * other.m23 + m23 * other.m33 + m24 * other.m43,
                m21 * other.m14 + m22 * other.m24 + m23 * other.m34 + m24 * other.m44,
                m31 * other.m11 + m32 * other.m21 + m33 * other.m31 + m34 * other.m41,
                m31 * other.m12 + m32 * other.m22 + m33 * other.m32 + m34 * other.m42,
                m31 * other.m13 + m32 * other.m23 + m33 * other.m33 + m34 * other.m43,
                m31 * other.m14 + m32 * other.m24 + m33 * other.m34 + m34 * other.m44,
                m41 * other.m11 + m42 * other.m21 + m43 * other.m31 + m44 * other.m41,
                m41 * other.m12 + m42 * other.m22 + m43 * other.m32 + m44 * other.m42,
                m41 * other.m13 + m42 * other.m23 + m43 * other.m33 + m44 * other.m43,
                m41 * other.m14 + m42 * other.m24 + m43 * other.m34 + m44 * other.m44);
    }
}