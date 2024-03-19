package homeworks.l31.coffeeMaker;

@FunctionalInterface
interface LambdaCoffeeMaker {
    void makeCoffee1();
}
class L31Main1 {
    public static void main(String[] args) {

        LambdaCoffeeMaker lambdaCoffeeMaker1 = () -> System.out.println("Make me 2 Espresso, please!");
        LambdaCoffeeMaker lambdaCoffeeMaker2 = () -> System.out.println("Make me 2 Americano, please!");
        LambdaCoffeeMaker lambdaCoffeeMaker3 = () -> System.out.println("Make me 2 Cappuccino, please!");

        lambdaCoffeeMaker1.makeCoffee1();
        lambdaCoffeeMaker2.makeCoffee1();
        lambdaCoffeeMaker3.makeCoffee1();
    }
}
