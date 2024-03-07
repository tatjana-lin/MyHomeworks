package myProjects.flatCollection;
import java.util.Scanner;
public class Manager { //класс для обработки пользовательского ввода
    Scanner scanner;


    Manager() {
        scanner = new Scanner(System.in);
    }
    public static boolean isInt(String str) {
        try {  // блок с которого все начнется тут
            // если завершится с ошибкой, то перейдет в catch блок
            Integer.valueOf(str);
            // если предыдущая строка успешно отработала, то возвращаем true
            return true;
        } catch (Exception e) {
            return false; // если попали в catch, то возращаем false
        }
    }

    public int getHouseYear() {
        while (true) {
            System.out.print("Введите год постройки дома: ");
            String line = scanner.nextLine();

            if (!isInt(line)) {
                System.out.println("Это не число");
                continue;
            }
            int year = Integer.parseInt(line);

            if (year < 2030 && year > 0) {
                return year;
            }

            System.out.println("Должно быть меньше 2030 и больше 0");
        }
    }


}
