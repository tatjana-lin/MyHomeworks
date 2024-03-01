package myProjects.cons.cons3;

public abstract class Employee {
    private int ID;
    private String firstName;
    private String lastName;
    private double hour;

    public Employee(int ID,String firstName, String lastName, double hour){
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hour = hour;

    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getHour() {
        return hour;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "ID=" + ID +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hour=" + hour +
                '}';
    }
}
