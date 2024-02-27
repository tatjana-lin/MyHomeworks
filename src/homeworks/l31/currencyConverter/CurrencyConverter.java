package homeworks.l31.currencyConverter;
@FunctionalInterface
interface CurrencyConverter {
    public double change(int sum);
}
class Main{
    public static void main(String[] args) {
        CurrencyConverter euroToUSD = new CurrencyConverter() { // переводит Евро в доллары
            @Override
            public double change(int sumEuro) {
                return sumEuro * 0.92;
            }
        };
        CurrencyConverter usdToEuro = new CurrencyConverter(){ // переводит доллары в Евро
            @Override
            public double change(int sumUSD){
                return sumUSD * 1.08;
            }
        };
        System.out.println("При обмене вы получите " + euroToUSD.change(100) + " USD"); // // можно ли обратиться к sum??
        System.out.println("При обмене вы получите " + usdToEuro.change(100) + " EURO");
    }
}
