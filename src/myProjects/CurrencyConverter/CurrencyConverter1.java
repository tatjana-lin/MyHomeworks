package myProjects.CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter1 {
    public static void main(String[] args) {

        String currencyFrom;
        String currencyIn;
        double x;
        double y;

        System.out.println(
                "Приветствуем в CurrencyConverter!\n");

        do {

            System.out.println(
                    "Выберите исходную валюту или завершите программу:\n" +
                            "- EURO\n" +
                            "- USD\n" +
                            "- TL\n" +
                            "- exit\n"
            );

            System.out.print("Введите доступное значение:\n");
            Scanner scanner = new Scanner(System.in);
            currencyFrom = scanner.nextLine();

            switch (currencyFrom) {
                case "exit":
                    System.out.println("\nПрограмма завершена. До свидания!\n");
                    continue;
                case "EURO":
                    System.out.println("\nИсходная валюта Евро\n");
                    x = 1.0;  // курс euro относительно euro
                    break;
                case "USD":
                    System.out.println("\nИсходная валюта доллары США\n");
                    x = 0.92;  // курс usd относительно euro
                    break;
                case "TL":
                    System.out.println("\nИсходная валюта турецкие лиры\n");
                    x = 0.03;  // курс tl относительно euro
                    break;
                default:
                    System.out.println("\nВы ввели неверное значение.\n");
                    continue;
            }
            System.out.println(
                    "В какую валюту хотите перевести?\n"+
                            "Выберите валюту:\n" +
                            "- EURO\n" +
                            "- USD\n" +
                            "- TL\n"
            );
            System.out.print("Введите доступное значение:\n");
            currencyIn = scanner.nextLine();
            switch (currencyIn) {
                case "EURO":
                    System.out.println("\nВалюта перевода Евро\n");
                    y = 1.0;  // курс euro относительно euro
                    break;
                case "USD":
                    System.out.println("\nВалюта перевода доллары США\n");
                    y = 0.92;  // курс usd относительно euro
                    break;
                case "TL":
                    System.out.println("\nВалюта перевода турецкие лиры\n");
                    y = 0.03;  // курс tl относительно euro
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

        } while (!currencyFrom.equals("exit"));

    }}