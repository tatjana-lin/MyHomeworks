package myProjects.CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        System.out.println(
                "Приветствуем в CurrencyConverter!\n" +
                        "Выберите исходную валюту или завершите программу:\n" +
                        "- EURO\n" +
                        "- USD\n" +
                        "- TL\n" +
                        "- exit\n"
        );

        System.out.print("Введите доступное значение:\n");
        Scanner scanner = new Scanner(System.in);
        String currencyFrom = scanner.nextLine();

        switch (currencyFrom) {
            case "EURO":
                System.out.println("\nИсходная валюта Евро\n");
                break;
            case "USD":
                System.out.println("\nИсходная валюта доллары США\n");
                break;
            case "TL":
                System.out.println("\nИсходная валюта турецкие лиры\n");
                break;
            case "exit":
                System.out.println("\nПрограмма завершена. До свидания!\n");
                System.exit(0);
                break;
            default:
                System.out.println("\nВы ввели неверное значение.\n");
                System.exit(-1);
        }
        System.out.println(
                "В какую валюту хотите перевести?\n"+
                        "Выберите валюту:\n" +
                        "- EURO\n" +
                        "- USD\n" +
                        "- TL\n"
        );
        System.out.print("Введите доступное значение:\n");
        String currencyIn = scanner.nextLine();
        switch (currencyIn) {
            case "EURO":
                System.out.println("\nВалюта перевода Евро\n");
                break;
            case "USD":
                System.out.println("\nВалюта перевода доллары США\n");
                break;
            case "TL":
                System.out.println("\nВалюта перевода турецкие лиры\n");
                break;
            default:
                System.out.println("\nВы ввели неверное значение.\n");
                System.exit(-1);
        }
        System.out.println("Введите сумму перевода: ");
        double sum = scanner.nextDouble();

        double x;
        double y;

        if (currencyFrom.equals("EURO")) {
            x = 1.0;  // курс euro относительно euro
        } else if (currencyFrom.equals("USD")) {
            x = 0.92;  // курс usd относительно euro
        } else {
            x = 0.03;  // курс tl относительно euro
        }

        if (currencyIn.equals("EURO")) {
            y = 1.0;  // курс euro относительно euro
        } else if (currencyIn.equals("USD")) {
            y = 0.92;  // курс usd относительно euro
        } else {
            y = 0.03;  // курс tl относительно euro
        }

        double total = sum * x / y;

        System.out.print("\nВы получите: ");
        System.out.println(total);

    }}
