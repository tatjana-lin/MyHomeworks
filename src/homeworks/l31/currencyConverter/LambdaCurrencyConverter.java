package homeworks.l31.currencyConverter;
@FunctionalInterface
interface LambdaCurrencyConverter {
    double change1(double sum);
}
class Main1{
    public static void main(String[] args) {

        LambdaCurrencyConverter euroToUSD = sumEuro -> sumEuro * 1.08;
        LambdaCurrencyConverter usdToEuro = sumUSD -> sumUSD * 0.92;

        double sumEuro = 140.0;
        double sumUSD = 140.0;

        double result1 = Math.round(euroToUSD.change1(sumEuro)*100.0)/100.0;
        double result2 = Math.round(usdToEuro.change1(sumUSD)*100.0)/100.0;

        System.out.println("При обмене " + sumEuro + " Euro вы получите " + result1 + " USD");
        System.out.println("При обмене " + sumUSD + " USD вы получите " + result2 + " EURO");

    }
}
