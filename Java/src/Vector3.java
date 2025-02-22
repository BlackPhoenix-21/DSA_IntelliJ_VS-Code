public record Vector3(float x, float y, float z) implements Comparable<Vector3> {
    public int compareTo(Vector3 otherVector3) {
        float lenght = getLenght();
        float otherlenght = otherVector3.getLenght();
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
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Vector3 add(Vector3 otherVector3) {
        return new Vector3(x + otherVector3.x, y + otherVector3.y, z + otherVector3.z);
    }

    public Vector3 cross(Vector3 otherVector3) {
        return new Vector3(y * otherVector3.z - z * otherVector3.y, z * otherVector3.x - x * otherVector3.z,
                x * otherVector3.y - y * otherVector3.x);
    }

    public Vector3 subtract(Vector3 otherVector3) {
        return new Vector3(otherVector3.x - x, otherVector3.y - y, otherVector3.z - z);
    }

    public float distance(Vector3 otherVector3) {
        return this.subtract(otherVector3).getLenght();
    }

    public Vector3 divide(Vector3 otherVector3) {
        return new Vector3(x / otherVector3.x, y / otherVector3.y, z / otherVector3.z);
    }

    public Vector3 divide(float scalar) {
        return new Vector3(x / scalar, y / scalar, z / scalar);
    }

    public float dot(Vector3 otherVector3) {
        return 0;
    }

    public boolean equals(Vector3 otherVector3) {
        if (this.x == otherVector3.x || this.y == otherVector3.y || this.z == otherVector3.z) {
            return true;
        } else {
            return false;
        }
    }

    public float lenghtSquard() {
        return (new Vector3(x * x, y * y, z * z)).getLenght();
    }

    public Vector3 max(Vector3 otherVector3) {
        float nx;
        float ny;
        float nz;
        if (this.x > otherVector3.x) {
            nx = this.x;
        } else {
            nx = otherVector3.x;
        }
        if (this.y > otherVector3.y) {
            ny = this.y;
        } else {
            ny = otherVector3.y;
        }
        if (this.z > otherVector3.z) {
            nz = this.z;
        } else {
            nz = otherVector3.z;
        }
        return new Vector3(nx, ny, nz);
    }

    public Vector3 min(Vector3 otherVector3) {
        float nx;
        float ny;
        float nz;
        if (this.x < otherVector3.x) {
            nx = this.x;
        } else {
            nx = otherVector3.x;
        }
        if (this.y < otherVector3.y) {
            ny = this.y;
        } else {
            ny = otherVector3.y;
        }
        if (this.z < otherVector3.z) {
            nz = this.z;
        } else {
            nz = otherVector3.z;
        }
        return new Vector3(nx, ny, nz);
    }

    public Vector3 multiply(Vector3 otherVector3) {
        return new Vector3(x * otherVector3.x, y * otherVector3.y, z * otherVector3.z);
    }

    public Vector3 multiply(int scalar) {
        return new Vector3(x * scalar, y * scalar, z * scalar);
    }

    public Vector3 negate() {
        return new Vector3(-x, -y, -z);
    }

    public Vector3 normalize() {
        return this.divide(this.getLenght());
    }
}
