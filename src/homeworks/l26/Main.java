package homeworks.l26;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Semicircle("Semicircle", "pink", 12.0),
                new RightTriangle("RightTriangle", "blue", 4.0, 8.0),
                new Rhombus("Rhombus", "green", 9.0, 60),
                new Ellipse("Ellipse", "yellow", 7.0, 11.0),
                new Rectangle("Rectangle", "white", 5.0, 10.0)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]);
        }
    }
}

