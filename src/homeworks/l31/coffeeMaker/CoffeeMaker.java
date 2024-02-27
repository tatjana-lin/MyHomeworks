package homeworks.l31.coffeeMaker;
@FunctionalInterface
interface CoffeeMaker{// функциональный интерфейс с одним абстрактным методом
public void makeCoffee();
}
class L31Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker1 = new CoffeeMaker() { //анонимный класс
            @Override
            public void makeCoffee() {
                System.out.println("Make me Espresso, please!");
            }
        };
        CoffeeMaker coffeeMaker2 = new CoffeeMaker() {//анонимный класс
            @Override
            public void makeCoffee() {
                System.out.println("Make me Americano, please!");
            }
        };
        CoffeeMaker coffeeMaker3 = new CoffeeMaker() {//анонимный класс
            @Override
            public void makeCoffee() {
                System.out.println("Make me Cappuccino, please!");
            }
        };
        coffeeMaker1.makeCoffee();
        coffeeMaker2.makeCoffee();
        coffeeMaker3.makeCoffee();
    }
}
