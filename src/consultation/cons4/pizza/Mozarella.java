package myProjects.cons.cons4.pizza;

public class Mozarella extends Pizza {
    private static String TYPE = "Pizza Mozarella";

    public Mozarella() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing with Mozarella");
    }
}
