package homeworks.l22.animal;

public class L22Main {
    public static void main(String[] args){

        Cat cat = new Cat(5,"Musya", "red");
        System.out.println(cat);
        cat.printWhoAmI();

        Cow cow = new Cow(150, "Buryonka", "braun");
        System.out.println(cow);
        cow.printWhoAmI();

        Dog dog = new Dog(10, "Sharick", "dvornyaga");
        System.out.println(dog);
        dog.printWhoAmI();
    }
}
