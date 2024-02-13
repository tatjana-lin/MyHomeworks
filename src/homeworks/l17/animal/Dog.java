package homeworks.l17.animal;

import java.util.Scanner;

public class Dog {
    String name;
    String breed;
    private final static int chromosomNumber;

    static {
        System.out.println("Сколько хромосом у собак? Введите, пожалуйста, ответ: ");
        Scanner scanner = new Scanner(System.in);
        chromosomNumber = scanner.nextInt();
    }

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public String toString(){
        return "Dog | " + name + " | " + breed + " | " + chromosomNumber;

    }
}
