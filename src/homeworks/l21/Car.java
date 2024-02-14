package homeworks.l21;

public class Car {
    String markOfCar;
    int yearOfProduction;

    public Car(String markOfCar, int yearOfProduction) {
        this.markOfCar = markOfCar;
        this.yearOfProduction = yearOfProduction;
    }
    public String toString(){
        return "Car | " + markOfCar + " | " + yearOfProduction;
    }
}


