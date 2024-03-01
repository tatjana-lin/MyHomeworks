package myProjects.cons.cons3;

public class SalesManager extends Employee {
    private double salesVolume;
    private double percent;

    public SalesManager(int ID, String firstName, String lastName, double hour, double salesVolume) {
        super(ID, firstName, lastName, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + salesVolume +
                ", percent=" + percent +
                '}' + super.toString();
    }

    public double calculateSalary(){
        double salary = salesVolume * percent;
        if(salary < getHour() * StateConstants.MIN_WAGE){
            salary = getHour() * StateConstants.MIN_WAGE;
        } return salary;
    }
}
