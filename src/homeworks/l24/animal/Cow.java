package homeworks.l24.animal;

public class Cow extends Animal {
    String color;

   public Cow (int weight, String name, String color) {
       super (weight, name);
       this.color = color;
    }

    public String toString(){
        return "Cow | " + weight + "kg | " + name + " | " + color + " | " ;
    }
    public void printWhoAmI() {
        System.out.println("I'm a domestic animal. I'm a cow.");
    }
}
