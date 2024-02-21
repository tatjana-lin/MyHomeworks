package homeworks.l27;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Semicircle("Semicircle", "pink", 12.0),
                new Ellipse("Ellipse", "yellow", 7.0, 11.0),
                new Rectangle("Rectangle", "white", 5.0, 10.0)
        };

        for (Shape shape : shapes) {
            shape.printInfo();
            System.out.println();
        }
    }
}



