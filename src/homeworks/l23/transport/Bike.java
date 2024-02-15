package homeworks.l23.transport;

public class Bike extends Transport {
    protected String color;

    public Bike(String mark, int productionYear, String color) {
        super(mark, productionYear);
        this.color = color;
    }

    public String toString(){
        return "Bike | " + mark + " | " + productionYear + " | "+ color;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Transport. I'm very ecofriendly.");
    }
}
