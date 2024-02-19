package homeworks.l25.animal;

public class Cow extends Animal {
    String color;

   public Cow (int weight, String name, String animalType, String color) {
       super (weight, name, animalType);
       this.color = color;
    }

    public String toString(){
        return "Cow | " + weight + "kg | " + name + " | " + color + " | " ;
    }
    public void printWhoAmI() {
        System.out.println("I'm a domestic animal. I'm a cow.");
    }
}
