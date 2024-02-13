package homeworks.l17;
import homeworks.l17.transport.Car;
import java.util.Arrays;

public class CarArrayList {
    static int INITIAL_SIZE = 10; //начальный размер массива
    Car[] cars;//массив для хранения элементов
    int count = 0;//количество элементов списка
    String element; // добавляемый элемент
    int index; // индекс удаляемого/получаемого элемента


    public CarArrayList(){
        this.cars = new Car[INITIAL_SIZE];  //конструктор массива
    }
    public void add(Car element){   //метод добавления элемента в список
    cars[count] = element;
    count = count + 1;
    }
    public void removeByIndex(int index){   //метод удаления элемента списка по индексу
        for (int i = index; i < count-1; i++){
        cars[i] = cars[i+1];

     }
        cars[count-1] = null;
    }
    public Car getByIndex(int index){   //метод получения элемента из списка по индексу
        return cars[index];
    }
    public void resize(){   //метод изменения размера списка
        Car[] newGarage = new Car[this.cars.length*2];
        for (int i = 0; i < this.count; i = i + 1){
            newGarage[i] = this.cars[i];
        }
        this.cars = newGarage;
    }

    public String toString() {
        return Arrays.toString(this.cars);
    }
}
