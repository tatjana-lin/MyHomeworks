package myProjects.cons.cons1;

public class Car {
    String[] salon = {"Audi", "BMW", "Honda", "Kia", "Mazda"};
    String carToFind;
    public void findCar (String[] salon, String carToFind) {
        for (int j = 0; j < salon.length; j++){
            if (salon[j].equals(carToFind)) {
                System.out.println("Авто в наличии");
                return;
            }
        }
        System.out.println("Авто нет в наличии");
    }

    public static void main(String[] args) {
       String[] salon = {"Audi", "BMW", "Honda", "Kia", "Mazda"};
       String carToFind = "Ford";
       Car car = new Car();
       car.findCar(salon, carToFind );
    }
}
