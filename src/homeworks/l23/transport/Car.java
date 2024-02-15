package homeworks.l23.transport;

public class Car extends Transport {

    protected String color;

    public Car(String mark, int productionYear, String color) {
        super(mark, productionYear);
        this.color = color;
    }
    public String toString(){

        return "Car | " + mark + " | " + productionYear + " | "+ color;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Transport. I'm not so ecofriendly.");
    }
}
