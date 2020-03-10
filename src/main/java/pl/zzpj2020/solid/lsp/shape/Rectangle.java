package pl.zzpj2020.solid.lsp.shape;

public class Rectangle implements Shape {
    private double height;

    private double width;

    public Rectangle(float height, float width) {
        this.height = height;
        this.width = width;
    }


    @Override
    public double area() {
        return height * width;
    }
}
