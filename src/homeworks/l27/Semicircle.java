package homeworks.l27;

public class Semicircle extends Shape implements ICalculator{
   private double radius;

    public Semicircle(String shapeName, String color, double radius) {
        super(shapeName, color);
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
      return PI * radius;
    }
    @Override
    public double getArea() {
        return (PI * radius * radius) / 2.0;
    }
}
