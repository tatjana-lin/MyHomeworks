package homeworks.l26;

public class Rhombus extends Shape{
    private double a; // длина стороны ромба в см
    private double y; //угол в градусах
     public Rhombus(String shapeName, String color, double a, double y){
         super(shapeName, color);
         this.a = a;
         this.y = y;
     }
    @Override
    public double getPerimeter() {
        return a * 4.0;
    }
    @Override
    public double getArea() {
        double angle = Math.toRadians(y);
        return a * a * Math.sin(angle);
    }
}
