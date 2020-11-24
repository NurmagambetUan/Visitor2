package com.company;

import java.util.ArrayList;

public class Employee implements IWorker{
    String name;
    double salary;
    int workingMonths;
    int vacationDays;
    private ArrayList<Employee> employees = IWorker.employees;

    public Employee(String name, double salary, int workingMonths, int vacationDays) {
        this.name = name;
        this.salary = salary;
        this.workingMonths = workingMonths;
        this.vacationDays = vacationDays;
    }

    public void Add(Employee e) {
        employees.add(e);
    }

    @Override
    public void accept(IPromotion iPromotion) {
        iPromotion.visitEmployee(this);
    }

    @Override
    public void increaseSalary() {
        double finalSalary = this.salary * 1.15;
        System.out.println("Employee: " + name + ", " + "Worked months: "+ workingMonths);
        System.out.println("Initial salary: "+this.salary + ", Final salary: " + finalSalary);
        this.salary = finalSalary;
    }

    @Override
    public void increaseVacationDays() {
        int finalVacationDays = this.vacationDays + 4;
        System.out.println("Employee: " + name + ", " + "Worked months: "+ workingMonths);
        System.out.println("Initial vacation days: "+this.vacationDays + ", Final vacation days: " + finalVacationDays);
        this.vacationDays = finalVacationDays;
    }
}
