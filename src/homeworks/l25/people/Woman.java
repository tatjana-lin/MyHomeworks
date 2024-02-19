package homeworks.l24.people;

public class Woman extends People {
    protected String business;
    protected String hobby;
    public Woman(String name, int age, String business, String hobby) {
        super(name, age);
        this.business = business;
        this.hobby = hobby;

    }
    public String toString(){
        return "Woman | " + name + " | " + age + " | " + business + " | " + hobby;
    }
    public void printWhoAmI(){
        System.out.println("I'm a Human. I'm a woman.");
    }
}
