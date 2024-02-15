package homeworks.l23;

import homeworks.l23.animal.Animal;
import homeworks.l23.animal.Cat;
import homeworks.l23.animal.Cow;
import homeworks.l23.animal.Dog;
import homeworks.l23.people.People;
import homeworks.l23.people.Man;
import homeworks.l23.people.Woman;
import homeworks.l23.transport.Transport;
import homeworks.l23.transport.Bike;
import homeworks.l23.transport.Bus;
import homeworks.l23.transport.Car;

public class L23Main {
    public static void main(String[] args){
    // животные
        Animal cat = new Cat(5,"Musya", "red"); // переменной cat можно указать класс-родитель
        System.out.println(cat);
        cat.printWhoAmI();

        Animal cow = new Cow(150, "Buryonka", "braun");
        System.out.println(cow);
        cow.printWhoAmI();

        Animal dog = new Dog(10, "Sharick", "dvornyaga");
        System.out.println(dog);
        dog.printWhoAmI();

        // люди
        People man = new Man("Vasya",39,"Businessman");
        System.out.println(man);
        man.printWhoAmI();

        People woman = new Woman("Masha", 33, "teacher", "Java");
        System.out.println(woman);
        woman.printWhoAmI();
    // транспорт
        Transport bike = new Bike("Aist",1999,"blue");
        System.out.println(bike);
        bike.printWhoAmI();

        Transport car = new Car("Volkswagen",2014,"silver");
        System.out.println(car);
        car.printWhoAmI();

        Transport bus = new Bus("Setra",2020,60);
        System.out.println(bus);
        bus.printWhoAmI();

    }
}
