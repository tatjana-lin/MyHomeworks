package myProjects.OOP;
//Домашка № 15 Введение в ООП
public class CurrencyConverter {
    // поля для хранения доступных валют и курсов
    double[] currencyRates;
    String[] availableCurrencies;

    // конструктор без параметров, используются курсы валют по умолчанию
        CurrencyConverter() {
            this.availableCurrencies = new String[3];
            this.availableCurrencies[0] = "EURO";
            this.availableCurrencies[1] = "USD";
            this.availableCurrencies[2] = "TL";

            this.currencyRates = new double[3];
            this.currencyRates[0] = 1;
            this.currencyRates[1] = 0.92;
            this.currencyRates[2] = 0.03;

        }
    // конструктор принимающий в параметрах курсы вадют
    CurrencyConverter(String[] currencyRates) {
        this();
        if (currencyRates.length == 3) {
            this.currencyRates[0] = Double.parseDouble(currencyRates[0]);
            this.currencyRates[1] = Double.parseDouble(currencyRates[1]);
            this.currencyRates[2] = Double.parseDouble(currencyRates[2]);
        }
    }

    public CurrencyConverter(double[] currencyRates, String[]
            availableCurrencies) {

    }
}
