package myProjects.cons.cons3;

public class WageEmployee extends Employee {
private double wage;// ставка за час
    public WageEmployee(int ID,String firstName, String lastName, double hour, double wage){
        super(ID, firstName, lastName, hour);
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}' + super.toString();
    }
        public double calculateSalary(){
        double salary = getHour()*wage;
        if (salary < getHour()*StateConstants.MIN_WAGE){
            salary = getHour()*StateConstants.MIN_WAGE;
        } return salary;
        }
}
