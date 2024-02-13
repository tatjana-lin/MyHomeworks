package homeworks.l17.transport;

public class Bike {
    String name;
    String color;

    public Bike (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString(){
        return "Bike | " + name + " | " + color;
    }
}
