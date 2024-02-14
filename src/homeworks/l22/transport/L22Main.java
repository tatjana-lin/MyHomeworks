package homeworks.l22.transport;

import homeworks.l22.people.Man;
import homeworks.l22.people.Woman;

public class L22Main {
    public static void main(String[] args){

        Bike bike = new Bike("Aist",1999,"blue");
        System.out.println(bike);
        bike.printWhoAmI();

        Car car = new Car("Volkswagen",2014,"silver");
        System.out.println(car);
        car.printWhoAmI();

        Bus bus = new Bus("Setra",2020,60);
        System.out.println(bus);
        bus.printWhoAmI();

    }
}

