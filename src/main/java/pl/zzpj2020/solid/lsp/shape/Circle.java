package pl.zzpj2020.solid.lsp.shape;

public class Circle implements Shape {
    private double radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * Math.PI * radius;
    }
}
