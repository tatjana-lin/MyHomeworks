package myProjects;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        System.out.println("Введите год Вашего рождения:\n");
        Scanner scanner = new Scanner(System.in);
        int yearOfBirth = scanner.nextInt();
        int currentYear = 2024;
        int age = currentYear - yearOfBirth;
        if (age < 0 | age > 150) {
            System.out.println("\nВы ввели неверный год рождения");
            System.exit(-1);
        }  else if (age >= 0 && age <= 14) {
           System.out.println("\nВы ребёнок");
        }  else if (age > 14 && age <= 18) {
            System.out.println("\nВы подросток");
        } /* else if (age > 18 && age <= 60) {
        System.out.println("\nВы взрослый");
      } else {
        System.out.println("\nВы пожилой");
      } // вариант только с if else if */

     /* String result = (age >= 0 && age <= 14) ? ("\nВы ребёнок") : (age >       14 && age <= 18) ? ("\nВы подросток") : (age > 18 && age <= 60) ?           ("\nВы взрослый") : ("\nВы пожилой");
    { // вариант с тернарным оператором плохой - много вложений */

        else { String result;
            result = (age > 18 && age <= 60) ? ("\nВы взрослый") : ("\nВы пожилой");
            System.out.println(result); /* вариант с тернарным оператором хороший */}
    }
}
