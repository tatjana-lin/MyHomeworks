package homeworks.l26;

public class RightTriangle extends Shape {
    private double a, b; // длины сторон прямоугольного треугольника в см, где а - основание, b - высота
    private double c = Math.sqrt(a * a + b * b); //с - гипотенуза


    public RightTriangle(String shapeName, String color, double a, double b) {
        super(shapeName, color);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double getPerimeter() {
        return a + b + c;
    }
    @Override
    public double getArea() {
        return (a * b) / 2.0;
    }
}
