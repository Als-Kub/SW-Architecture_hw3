package LSP;

public class Square extends QuadRangle {

    int length;

    public Square(int length) {
        this.length = length;
    }

    @Override
    int area() {
        return length * length;
    }
}
