package homeworks.l27;

public abstract class Shape implements ICalculator{ //методы расчета периметра и площади фигур вынесены в интерфейс
    protected String shapeName;
    protected String color;

    public Shape(String shapeName, String color) { // конструктор
        this.shapeName = shapeName;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("Shape: " + shapeName);
        System.out.println("Color: " + color);
        System.out.println("Perimeter: " + getPerimeter());
        System.out.println("Area: " + getArea());

    }
}





