package homeworks.l21;

public class Main {
    public static void main(String[] args) {
        CarArrayList garage = new CarArrayList();// домашка №19 ArrayList

        Car vw = new Car("VW", 2014);
        Car audi = new Car("Audi", 2015);
        Car fiat = new Car("Fiat", 2020);
        Car seat = new Car("Seat", 1999);
        Car renault = new Car("Renault", 2010);
        Car peugeot = new Car("Peugeot", 2022);

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

        garage.add(peugeot);
        garage.add(audi);
        System.out.println(garage);

        //запускаем программу и визуально проверяем:
        //машины те, которые мы указали
        //машины в том же порядке, как мы указали
        //свойства машин те же, что мы указали

    }
}
