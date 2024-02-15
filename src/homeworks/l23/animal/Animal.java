package homeworks.l23.animal;

    public class Animal {
    protected int weight;
    protected String name;

    public Animal(int weight,String name){
        this.weight = weight;
        this.name = name;
    }
    public void printWhoAmI(){
        System.out.println("I'm an animal");
    }
}
