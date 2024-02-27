package homeworks.l31.currencyConverter;
@FunctionalInterface
interface LambdaCurrencyConverter {
    public double change(int sum);
}
class Main1{
    public static void main(String[] args) {
        CurrencyConverter euroToUSD = sumEuro -> sumEuro * 0.92;
        CurrencyConverter usdToEuro = sumUSD -> sumUSD * 1.08;

        System.out.println("При обмене вы получите " + euroToUSD.change(100) + " USD"); // можно ли обратиться к sum??
        System.out.println("При обмене вы получите " + usdToEuro.change(100) + " EURO");
    }
}
