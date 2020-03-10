package pl.zzpj2020.solid.lsp.shape;

public class Square implements Shape {
    private double side;

    public Square(float side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}
