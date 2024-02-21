package homeworks.l27;

import static java.lang.Math.sqrt;

public class Ellipse extends Shape implements ICalculator {
    private double r1;//меньший радиус в см
    private double r2;//больший радиус в см

    public Ellipse(String shapeName, String color, double r1, double r2) {
        super(shapeName, color);
        this.r1 = r1;
        this.r2 = r2;
    }
    @Override
    public double getPerimeter() {
        return 2.0 * PI * sqrt((r1 * r1 + r2 * r2) / 2.0);
    }
    @Override
    public double getArea() {
        return PI * r1 * r2;
    }
}
