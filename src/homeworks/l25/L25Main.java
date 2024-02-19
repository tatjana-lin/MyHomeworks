package homeworks.l25;

import homeworks.l25.animal.Cat;
import homeworks.l25.animal.Cow;
import homeworks.l25.animal.Dog;
import homeworks.l25.animal.Animal;
import homeworks.l25.people.Man;
import homeworks.l25.people.People;
import homeworks.l25.people.Woman;
import homeworks.l25.transport.Bike;
import homeworks.l25.transport.Bus;
import homeworks.l25.transport.Car;
import homeworks.l25.transport.Transport;

public class L25Main {
    public static void main(String[] args){
    // животные
        Animal cat = new Cat(5,"Musya",  "Cat", "red");
        Animal cow = new Cow(150, "Buryonka", " Cow", "braun");
        Animal dog = new Dog(10, "Sharick", "Dog", "dvornyaga");

    // люди
        People man = new Man("Vasya",39,"Businessman");
        People woman = new Woman("Masha", 33, "teacher", "Java");
        People anonymous = new Man(null,0, null);

    // транспорт
        Transport bike = new Bike("Aist",1999,"blue");
        Transport car = new Car("Volkswagen",2014,"silver");
        Transport bus = new Bus("Setra",2020,60);

        /*Animal animal1 = dog;
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
        System.out.println(transport2.mark + " : " + transport2.hashCode());*/

        //Приводим все объекты разных классов к классу Object, создаём массив и работаем с ним
        Object[] objects = {cat, cow, dog, man, woman, bike, car, bus};
        for (Object obj : objects){
            System.out.println(obj);
            System.out.println(obj.hashCode());
        }

    }
}
