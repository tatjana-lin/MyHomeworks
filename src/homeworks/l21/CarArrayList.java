package homeworks.l21;
import java.util.Arrays;

public class CarArrayList {
    static int INITIAL_SIZE = 5; //начальный размер массива
    Car[] cars;//массив для хранения элементов
    int count = 0;//количество элементов списка
    String element; // добавляемый элемент
    int index; // индекс удаляемого/получаемого элемента


    public CarArrayList(){
        this.cars = new Car[INITIAL_SIZE];  //конструктор массива
    }
    public void add(Car element){   //метод добавления элемента в список+увеличение размера массива
        if (this.count >= this.cars.length){
            resize();
        }
        cars[count] = element;
        count = count + 1;
    }
    public void removeByIndex(int index) {   //метод удаления элемента списка по индексу
        if (index >= this.cars.length || index < 0) {
            System.out.println("Недопустимое значение индекса"); // добавлено условие на случай ввода неверного индекса
        } else
            for (int i = index; i < count - 1; i++) {
                cars[i] = cars[i + 1];
                cars[count - 1] = null;
                count = count - 1;
            }
    }
    public Car getByIndex(int index){   //метод получения элемента из списка по индексу
        if (index >= this.cars.length || index < 0) { // добавлено условие на случай ввода неверного индекса
            Car Object0 = null;
            System.out.println("Недопустимое значение индекса");
            return Object0;
        }
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

