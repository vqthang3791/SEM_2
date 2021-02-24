package Java1.Lab8.Example3;

public class Point3D extends Point2D {
    float z;

    public Point3D() {
        super();
        this.z = 0;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = 0;
    }

    public float getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public String toString() {
        return "(" + super.getX() + "," + super.getY() + "," + this.z + ")";
    }
}

