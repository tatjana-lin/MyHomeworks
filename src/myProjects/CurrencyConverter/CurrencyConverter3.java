package myProjects.CurrencyConverter;

//Домашка №9, void метод
import java.util.Scanner;

public class CurrencyConverter3 {
    public static void printWelcome(String[] ourCurrencies) {
        String welcomeSentence = "Приветствуем в CurrencyConverter!\nВыберите исходную валюту или завершите программу:\n";
        System.out.println(welcomeSentence);

        for (int i = 0; i < 3; i++) {
            System.out.println(ourCurrencies[i]);
        }
        System.out.println("exit");
    }

    public static void main(String[] args) {

        String[] ourCurrencies = {"EURO", "USD", "TL"};
        double[] rates = {1.0, 0.92, 0.03};
        String currencyFrom, currencyIn;
        double x, y;

        printWelcome(ourCurrencies);

        do {

            System.out.print("\nВведите доступное значение:\n");
            Scanner scanner = new Scanner(System.in);
            currencyFrom = scanner.nextLine();

            switch (currencyFrom) {
                case "exit":
                    System.out.println("\nПрограмма завершена. До свидания!\n");
                    continue;
                case "EURO":
                    System.out.println("\nИсходная валюта Евро\n");
                    x = rates [0];  // курс euro относительно euro
                    break;
                case "USD":
                    System.out.println("\nИсходная валюта доллары США\n");
                    x = rates [1];  // курс usd относительно euro
                    break;
                case "TL":
                    System.out.println("\nИсходная валюта турецкие лиры\n");
                    x = rates [2];  // курс tl относительно euro
                    break;
                default:
                    System.out.println("\nВы ввели неверное значение.\n");
                    continue;
            }
            System.out.println(
                    "В какую валюту хотите перевести?\n"+
                            "Выберите валюту:\n");
            for (String currency : ourCurrencies) {
                System.out.println(currency);
            }

            System.out.print("\nВведите доступное значение:\n");
            currencyIn = scanner.nextLine();
            switch (currencyIn) {
                case "EURO":
                    System.out.println("\nВалюта перевода Евро\n");
                    y = rates [0];  // курс euro относительно euro
                    break;
                case "USD":
                    System.out.println("\nВалюта перевода доллары США\n");
                    y = rates [1];  // курс usd относительно euro
                    break;
                case "TL":
                    System.out.println("\nВалюта перевода турецкие лиры\n");
                    y = rates [2];  // курс tl относительно euro
                    break;
                default:
                    System.out.println("\nВы ввели неверное значение.\n");
                    continue;
            }
            System.out.println("Введите сумму перевода: ");
            double sum = scanner.nextDouble();
            double total = sum * x / y;

            System.out.print("\nВы получите: ");
            System.out.println(total);

        } while (!currencyFrom.equalsIgnoreCase("exit"));
    }
}

