package homeworks.l26;

public class Semicircle extends Shape {
   private double radius;

    public Semicircle(String shapeName, String color, double radius) {
        super(shapeName, color);
        this.radius = radius;
    }
    @Override
    public double getPerimeter() {
      return Math.PI * radius;
    }
    @Override
    public double getArea() {
        return (Math.PI * radius * radius) / 2.0;
    }
}
