package homeworks.l17.animal;

import java.util.Scanner;

public class Cat {
    String name;
    String color;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у котов? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

   public Cat (String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String toString(){
        return "Cat | " + name + " | " + color + " | " + chromosomNumber;

    }
}
