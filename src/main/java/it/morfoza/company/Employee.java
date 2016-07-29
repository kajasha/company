package it.morfoza.company;

public class Employee {

    private double salary;


    public Employee(double salary) {
        this.salary = salary;

    }

    public double getSalary() {
        return salary;
    }

    public void giveRise(int percent) {
        double rise = salary * percent / 100;
        salary = salary + rise;

    }

    @Override
    public String toString() {
        return "Employee: [salary: " + salary + "]";
    }
}

