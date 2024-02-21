package homeworks.l27;

public class Rectangle extends Shape implements ICalculator {
    private double a, b; // длины сторон прямоугольника в см
    public Rectangle(String shapeName, String color, double a, double b) {
        super(shapeName, color);
        this.a = a;
        this.b = b;
    }
    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }
    @Override
    public double getArea() {
        return a * b;
    }
}
