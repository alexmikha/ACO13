package main.java.week2.day1.inheritens;

/**
 * Created by mykhailov on 31.05.2016.
 */
public class Manager extends Employee {

    private Employee[] employees;

    public Manager(int age, String name, String surname, Employee[] employees) {
        super(age, name, surname);
        this.employees = employees;
    }

    @Override
    public void work() {
        System.out.println("I make people work");
        for (Employee employee : employees) {
            if (employee != null)
                employee.work();
            if (employee instanceof Coder) {
                Coder tmp = (Coder) employee;
                tmp.writeCode();
            }
        }
    }
}