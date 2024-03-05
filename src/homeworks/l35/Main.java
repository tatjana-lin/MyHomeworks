package homeworks.l35;

import java.util.*;

//Отсортируйте список используя Collections.sort +
//Отсортируйте список используя Collections.sort и созданые компораторы +
//Отсортируйте список используя Collections.sort используя лямбда выражения вместо компараторов +
//после всей этой сортировки сформируйте Map (например Hashmap) c данными вида имя бобра (ключ) и
//количество родственников (значение) и выведите этот map

public class Main {
    public static void main(String[] args) {
        List<Beaver> beavers = new LinkedList<>();

        Beaver beaver1 = new Beaver("Bob", 10, 200);
        Beaver beaver2 = new Beaver("Ben", 8, 100);
        Beaver beaver3 = new Beaver("Berta", 5, 50);
        Beaver beaver4 = new Beaver("Bella", 3, 10);

        beavers.add(beaver1);
        beavers.add(beaver2);
        beavers.add(beaver3);
        beavers.add(beaver4);

        Collections.sort(beavers);//сортировка по возрасту (естественный параметр сравнения)
        System.out.println("Бобры отсортированы по возрасту: " + beavers);

        Collections.sort(beavers, new NameComparator()); //сортировка по имени с использованием созданного NameComparator
        System.out.println("Бобры отсортированы по имени с помощью компаратора: " + beavers);

        Collections.sort(beavers, new RelativesCountComparator());//сортировка по числу родственников с использованием созданного компаратора
        System.out.println("Бобры отсортированы по количеству родственников с помощью компаратора: " + beavers);

        Collections.sort(beavers, ((o1, o2) -> o1.name.compareTo(o2.name)));//сортировка по имени с использованием лямбда-выражения
        System.out.println("Бобры отсортированы по имени с помощью лямбда-выражения1: " + beavers);

        beavers.sort((o1, o2) -> o1.name.compareTo(o2.name));//сортировка по имени с использованием лямбда-выражения
        System.out.println("Бобры отсортированы по имени с помощью лямбда-выражения2: " + beavers);

        Map<String, Integer> beaverMap = new HashMap<>();// создали HashMap
        for (Beaver beaver : beavers) { // поместили туда пары ключ-значение
            beaverMap.put(beaver.name, beaver.relativesCount);
        }

        System.out.println(beaverMap); //вывели этот map

        //ДЗ № 36: Поместите часть бобров из 35 домашки в мешок (в hashset) (надо переопределить equals и hashCode у них)
        //Проитерируйтесь по (старому) списку бобров и проверьте для каждого есть ли он в мешке

        Set<Beaver> beaverSet = new HashSet<>(); //создаем мешок

        beaverSet.add(beaver1); // сажаем туда бобров
        beaverSet.add(beaver2);

        System.out.println("==========================================================");
        System.out.println("Домашка № 36" + "\nБобры в мешке: " + beaverSet);

        for (Beaver beaver : beavers) { // проверяем наличие бобров из списка List в мешке
            System.out.println("Бобр " + beaver.name + " есть в мешке: " + beaverSet.contains(beaver));
        }
    }
}
