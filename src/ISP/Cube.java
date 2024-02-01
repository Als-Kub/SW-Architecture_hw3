package ISP;

public class Cube implements Shape3D {
    int length;

    public Cube(int length) {
        this.length = length;
    }

    @Override
    public double perimeter() {
        return length * 12;
    }

    @Override
    public double value() {
        return length * length * length;
    }
}