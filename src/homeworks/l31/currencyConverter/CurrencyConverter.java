package homeworks.l31.currencyConverter;
@FunctionalInterface
interface CurrencyConverter {
    double change(double sum);
}
class Main{
    public static void main(String[] args) {
        CurrencyConverter euroToUSD = new CurrencyConverter() { // анонимный класс
            // переводит Евро в доллары
            @Override
            public double change(double sumEuro) {
                return sumEuro * 1.08;
            }
        };
        CurrencyConverter usdToEuro = new CurrencyConverter(){ // анонимный класс
            // переводит доллары в Евро
            @Override
            public double change(double sumUSD){
                return sumUSD * 0.92;
            }
        };
        double sumEuro = 150.0;
        double sumUSD = 140.0;

        double result1 = Math.round(euroToUSD.change(sumEuro)*100.0)/100.0;
        double result2 = Math.round(usdToEuro.change(sumUSD)*100.0)/100.0;

        System.out.println("При обмене " + sumEuro + " Euro вы получите " + result1 + " USD");
        System.out.println("При обмене " + sumUSD + " USD вы получите " + result2 + " EURO");
    }
}
