package Main;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        raiseSalary();
    }

    public double tax() {
        if (salary > 1000)
            return getSalary() - (getSalary() * 0.30);
        return getSalary();
    }

    public double bonus() {
        if (getWorkHours() > 40)
            return tax() + ((getWorkHours() - 40) * 30);
        return tax();
    }

    public double raiseSalary() {
        int totalWorkYear = 2021 - getHireYear();
        if (totalWorkYear > 19) {
            return bonus() + (bonus() * 0.15);
        }
        if (totalWorkYear > 9) {
            return bonus() + (bonus() * 0.10);
        }
        return bonus() + (bonus() * 0.5);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    @Override
    public String toString() {
        return "Employee -> " + " \nName : " + name + "\nNormal salary : " + salary + "\nWorking hours : " + workHours + "\nHire year : " + hireYear +
                "\nAfter calculating tax , bonus and raise salary methods : " + raiseSalary();
    }
}
