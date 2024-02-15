package homeworks.l23.people;

public class Man extends People {

    protected String business;

    public Man(String name, int age, String business) {
        super(name, age);
        this.business = business;
    }
    public String toString(){
       return "Man | " + name + " | " + age + " | " + business;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Human. I'm a man.");
    }
}
