package myProjects.cons.cons3;
//создать бухгалтерскую программу, которая будет добавлять сотрудников в штат, удалять из штата
// и рассчитывать ЗП для 2х категорий сотрудников (1 сотрудник с почасовой оплатой и 1 менеджер по продажам)
// у программы должны быть:
// классы сотрудников - родит.класс Employee и 2 дочерник класса: WageEmployee и SalesManager.
// у всех сотрудников есть общие характеристики: ID, name, surname, метод для подсчета ЗП.
// У сотрудника на почасовой оплате д.б.поле Ставка за час. Метод расчета его ЗП должен
// учитывать мин.размер оплаты труда. У менеджера нет фиксированной оплаты. Его ЗП рассчитывается как % от продаж.
// Минимальный размер оплаты труда должен учитываться.
// В программе д.быть класс Company, имеющий методы для добавления сотрудника, вывода на экран списка всех сотрудников,
// суммирования ЗП всех сотрудников.
public class Main {
    public static void main(String[] args) {
        Company ourCompany = new Company(10);
        Employee wageEmployee1 = new WageEmployee(123, "John",  "Smith", 160, 16.50);
        Employee wageEmployee2 = new WageEmployee(124, "Joe",  "Smith", 130, 18.50);
        Employee wageEmployee3 = new WageEmployee(125, "Peter",  "Smith", 170, 15.50);
        Employee manager1 = new SalesManager(126, "Kate",  "Smith", 160, 75000);
        Employee manager2 = new SalesManager(127, "Ann",  "Smith", 60, 25000);
        Employee manager3 = new SalesManager(128, "Annabell",  "Smith", 65, 15000);
        Employee wageEmployee4 = new WageEmployee(121, "Pet",  "Smith", 170, 15.50);

        System.out.println(manager1.calculateSalary());
        System.out.println(wageEmployee1.calculateSalary());

        ourCompany.addEmployee(manager1);
        ourCompany.addEmployee(manager2);
        ourCompany.addEmployee(manager3);
        ourCompany.addEmployee(wageEmployee1);
        ourCompany.addEmployee(wageEmployee2);
        ourCompany.addEmployee(wageEmployee3);
        System.out.println("Employee List: ");
        ourCompany.display();

        System.out.println("Remove salesManager1 ");
        System.out.println(ourCompany.removeEmployee(manager1));
        ourCompany.display();

        System.out.println(ourCompany.removeEmployee(wageEmployee4));

        //for (Employee employee : ourCompany.getEmployees()){// цикл для добавления эл-тов
       //    employee[i].addEmployee;
       //    employees.display;

       }

    }

