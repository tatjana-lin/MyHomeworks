package homeworks.l22.people;

import homeworks.l22.animal.Cat;
import homeworks.l22.animal.Cow;
import homeworks.l22.animal.Dog;

public class L22Main {
    public static void main(String[] args){

        Man man = new Man("Vasya",39,"Businessman");
        System.out.println(man);
        man.printWhoAmI();

        Woman woman = new Woman("Masha", 33, "teacher", "Java");
        System.out.println(woman);
        woman.printWhoAmI();


    }
}
