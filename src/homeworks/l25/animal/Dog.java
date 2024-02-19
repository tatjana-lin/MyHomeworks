package homeworks.l25.animal;

public class Dog extends Animal {
    protected String breed;

   public Dog(int weight, String name, String animalType, String breed) {
        super (weight, name, animalType);
        this.breed = breed;
    }
    public String toString(){
        return "Dog | " + weight + "kg | " + name + " | " + breed + " | ";
    }
    public void printWhoAmI(){
        System.out.println("I'm a pet. I'm a dog.");
    }
}