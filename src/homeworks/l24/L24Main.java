package homeworks.l24;

import homeworks.l24.animal.Dog;
import homeworks.l24.animal.Animal;
import homeworks.l24.animal.Cat;
import homeworks.l24.animal.Cow;
import homeworks.l24.people.Man;
import homeworks.l24.people.People;
import homeworks.l24.people.Woman;
import homeworks.l24.transport.Bike;
import homeworks.l24.transport.Bus;
import homeworks.l24.transport.Car;
import homeworks.l24.transport.Transport;

public class L24Main {
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

        People anonymous = new Man(null,0, null);

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

        Animal animal1 = dog;
        Animal animal2 = cat;
        System.out.println("==================================================================");
        System.out.println("Результат сравнения объектов " + animal1.name + " и " + animal2.name);
        System.out.println(animal1.equals(animal2));
        System.out.println("Какие у этих объектов хэш-коды?");
        System.out.println(animal1.name + " : " + animal1.hashCode());
        System.out.println(animal2.name + " : " + animal2.hashCode());

        People person1 = man;
        People person2 = anonymous;
        System.out.println("==================================================================");
        System.out.println("Результат сравнения объектов " + person1.name + " и " + person2.name);
        System.out.println(person1.equals(person2));
        System.out.println("Какие у этих объектов хэш-коды?");
        System.out.println(person1.name + " : " + person1.hashCode());
        System.out.println(person2.name + " : " + person2.hashCode());

        Transport transport1 = bus;
        Transport transport2 = bike;
        System.out.println("==================================================================");
        System.out.println("Результат сравнения объектов " + transport1.mark + " и " + transport2.mark);
        System.out.println(person1.equals(person2));
        System.out.println("Какие у этих объектов хэш-коды?");
        System.out.println(transport1.mark + " : " + transport1.hashCode());
        System.out.println(transport2.mark + " : " + transport2.hashCode());

    }
}
