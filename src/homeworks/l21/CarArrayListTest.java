package homeworks.l21;

import org.junit.jupiter.api.*;

public class CarArrayListTest {//в JUnit класс теста д.быть public, в конце названия класса д.быть слово Test с большой буквы
    static int var1;
    private CarArrayList garage;
    private Car car1;
    private Car car2;
    private Car car3;
    @BeforeAll
    public static void setUpClass(){ //запускается перед всеми тестами в текущем классе, статический, не имеет доступа к this
    var1 = 2;
    System.out.println("setUpClass()");
    }
    @BeforeEach //запускается перед каждым тест кейсом, нестатический, имеет доступ к this
    public void setUp(){
        this.car1 = new Car ("VW", 2014);
        this.car2 = new Car ("Audi", 2015);
        this.car3 = new Car ("Fiat", 2020);

        this.garage = new CarArrayList();
        garage.add(this.car1);
        garage.add(this.car2);
        garage.add(this.car3);
    }
    @Test // аннотирование или аннотация, пишем над методом
    public void testCount() { //методы теста д.быть public void, начинаться со слова test

        CarArrayList garageEmpty = new CarArrayList();
        Assertions.assertEquals(0, garageEmpty.count);//класс Assertions с методами
        // проверка что после создания массива его размер 0
        Assertions.assertEquals(3, garage.count);//проверка что после добавления элементов в массив их кол-во верно
    }
    /*@Test
    public void testCountOld() {
        Car vw = new Car("VW", 2014);
        Car audi = new Car("Audi", 2015);
        Car fiat = new Car("Fiat", 2020);
        Car seat = new Car("Seat", 1999);
        Car renault = new Car("Renault", 2010);

        CarArrayList garage = new CarArrayList();
        Assertions.assertEquals(0, garage.count);//класс Assertions с методами
        // проверка что после создания массива его размер 0
        garage.add(vw);
        garage.add(audi);
        garage.add(fiat);
        garage.add(seat);
        garage.add(renault);
        Assertions.assertEquals(5, garage.count);//проверка что после добавления элементов в массив их кол-во верно
    }*/
    @Test
    public void testRemove() {

        Assertions.assertEquals(this.car2, garage.getByIndex(1));//проверяем какой авто по индексу
        garage.removeByIndex(1);
        Assertions.assertEquals(this.car3, garage.getByIndex(1));//проверяем после удаления какой авто по индексу
        Assertions.assertEquals(null, garage.getByIndex(2));//проверяем последний пустой элемент
    }
    /*@Test
    public void testAddResize() { //проверка на создание нового массива при переполнении старого

        Car vw = new Car("VW", 2014);
        Car audi = new Car("Audi", 2015);
        Car fiat = new Car("Fiat", 2020);
        Car seat = new Car("Seat", 1999);
        Car renault = new Car("Renault", 2010);
        Car peugeot = new Car("Peugeot", 2022);

        CarArrayList garage = new CarArrayList();
        garage.add(vw);
        garage.add(audi);
        garage.add(fiat);
        garage.add(seat);
        garage.add(renault);
        garage.add(peugeot);

        Assertions.assertEquals(10, garage.count);//проверка что после добавления элементов в массив их кол-во верно
    }*/
    @Test
    public void testGetByIndex() {

        Assertions.assertEquals(null, garage.getByIndex(-1));//проверяем на неверный индекс
    }
    @AfterEach // вызывается после каждого тест кейса, нестатический
    public void tearDown(){
        System.out.println("tearDown");
    }
    @AfterAll // вызывается после всех тестов класса, статический, разрывает соединение, очищает данные
    public static void tearDownClass(){
        System.out.println("tearDownClass()");
    }

}
