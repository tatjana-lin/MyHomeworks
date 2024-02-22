package homeworks.l26;

public abstract class Shape {
    protected String shapeName;
    protected String color;

    public Shape(String shapeName, String color) { // конструктор
        this.shapeName = shapeName;
        this.color = color;
    }

    public abstract double getPerimeter(); //абстрактный метод для получения периметра фигуры

    public abstract double getArea(); //абстрактный метод для получения площади фигуры

    @Override
    public String toString() { // метод для вывода информации о фигуре
        return "Shape | " + shapeName + " | " + "color " + color + " | " +
                "perimeter " + getPerimeter() + " cm | " + "area " + getArea() + " cm2 | ";
    }
}





