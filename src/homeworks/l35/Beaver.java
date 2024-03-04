package homeworks.l35;

//Создайте значит класс Bobr и определите у бобра поля name, age и relativesCount. +
//Реализуйте интерфейс Comparable<Bobr> и переопределите метод compareTo чтобы сравнивались поля age +
//Создайте класс NameComparator и RelativesCountComparator (реализуйте интерфейс java.util.Comparator) +
//Поместите бобров в список (выберите сами какой список, он должен реализовывать интерфейс List) +
//Отсортируйте список используя Collections.sort
//Отсортируйте список используя Collections.sort и созданые компораторы
//Отсортируйте список используя Collections.sort используя лямбда выражения вместо компараторов
//после всей этой сортировки сформируйте Map (например Hashmap) c данными вида имя бобра (ключ) и
//количество родственников (значение) и выведите этот map

public class Beaver implements Comparable<Beaver>{
    String name;
    int age;
    int relativesCount;

    public Beaver (String name, int age, int relativesCount){
        this.name = name;
        this.age = age;
        this.relativesCount = relativesCount;
    }
    @Override
    public int compareTo(Beaver o) { //переопределяем метод compareTo, чтобы сравнивались поля age
        if (this.age < o.age) {
            return -1;
        } else if (this.age > o.age){
            return 1;
        } else
            return 0;
    }

    @Override
    public String toString() {
        return "Beaver{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", relativesCount=" + relativesCount +
                '}';
    }
}
