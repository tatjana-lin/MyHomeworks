package homeworks;

import homeworks.l17.people.*;
import homeworks.l17.animal.*;
import homeworks.l17.transport.*;
import homeworks.l17.CarArrayList;

public class L17Main {

    public static void main(String[] args) {
        /*Man Papa = new Man("Papa", 45);
        Woman Mama = new Woman("Mama", 43);
        Cat Matroskin = new Cat("Matroskin", "striped");
        Dog Sharick = new Dog("Sharick", "dvornyaga");
        Cow Corowa = new Cow("Corowa", "black-white");
        Bike Aist = new Bike("Aist", "blue");
        Bus Number7 = new Bus("Number7", "Prostokvashino");
        Car Zhiguli = new Car("Zhiguli", 1980);

        System.out.println(Papa);
        System.out.println(Mama);
        System.out.println(Matroskin);
        System.out.println(Sharick);
        System.out.println(Corowa);
        System.out.println(Aist);
        System.out.println(Number7);
        System.out.println(Zhiguli);*/ // домашка № 18 Статический инициализатор

        CarArrayList garage = new CarArrayList();// домашка №19 ArrayList

        Car vw = new Car ("VW", 2014);
        Car audi = new Car ("Audi", 2015);
        Car fiat = new Car ("Fiat", 2020);
        Car seat = new Car ("Seat", 1999);
        Car renault = new Car ("Renault", 2010);

        garage.add(vw);
        garage.add(audi);
        garage.add(fiat);
        garage.add(seat);
        garage.add(renault);

        System.out.println(garage);

        garage.removeByIndex(1);
        System.out.println(garage);

        Car carByIndex = garage.getByIndex(3);
        System.out.println(carByIndex);

        garage.resize();
        System.out.println(garage);

    }
}


