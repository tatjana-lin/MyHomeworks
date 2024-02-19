package homeworks.l25.animal;

public class Cat extends Animal { //Cat IS-A Animal
    protected String color;

   public Cat(int weight, String name, String animalType, String color) {
       super(weight, name, animalType);
       this.color = color;
    }
    public String toString(){
       return "Cat | " + weight + "kg | " + name + " | " + color + " | ";
    }
    public void printWhoAmI(){
       System.out.println("I'm a pet. I'm a cat.");
    }
}
