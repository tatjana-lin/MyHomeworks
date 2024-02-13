package homeworks.l17.people;

import java.util.Scanner;

public class Woman {
    String name;
    int age;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у женщин? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

   public Woman(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return "Woman | " + name + " | " + age + " | " + chromosomNumber;
    }
}
