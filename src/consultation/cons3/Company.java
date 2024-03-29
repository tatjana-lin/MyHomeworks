package myProjects.cons.cons3;

public class Company {
    private Employee[] employees;
    private int companySize; //сколько сотрудников можно взять

    public Employee[] getEmployees() {
        return employees;
    }

    public int getCompanySize() {
        return companySize;
    }

    public Company(int capacity) {
        employees = new Employee[capacity];
        companySize = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (companySize < employees.length) {
            employees[companySize] = employee;
            companySize++;
            return true;
        }
        return false;
    }

    public boolean removeEmployee(Employee employee) {
        for (int i = 0; i < companySize; i++) {

            if (employees[i].equals(employee)) {
                employees[i] = employees[companySize - 1];
                companySize--;
                return true;
            }
        }
        return false; //не нашли сотрудника
    }

    public void display() {
        for (int i = 0; i < companySize; i++) {
            System.out.println(employees[i]);
        }
    }
    public double sumSalary(){
        double sum = 0;
        for (int i = 0; i < companySize; i++){
            sum = sum + employees[i].calculateSalary();
        }return sum;

    }
}
