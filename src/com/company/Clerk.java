package com.company;

import java.util.ArrayList;

public class Clerk implements IWorker {
    String name;
    double salary;
    int workingMonths;
    int vacationDays;
    private ArrayList<Clerk> clerks = IWorker.clerks;

    public Clerk(String name, double salary, int workingMonths, int vacationDays) {
        this.name = name;
        this.salary = salary;
        this.workingMonths = workingMonths;
        this.vacationDays = vacationDays;
    }

    public void Add(Clerk c) {
        clerks.add(c);
    }

    @Override
    public void accept(IPromotion iPromotion) {
        iPromotion.visitClerk(this);
    }

    @Override
    public void increaseSalary() {
        double finalSalary = this.salary * 1.1;
        System.out.println("Clerk: " + name + ", " + "Worked months: "+ workingMonths);
        System.out.println("Initial salary: "+this.salary + ", Final salary: " + finalSalary);
        this.salary = finalSalary;
    }

    @Override
    public void increaseVacationDays() {
        int finalVacationDays = this.vacationDays + 2;
        System.out.println("Clerk: " + name + ", " + "Worked months: "+ workingMonths);
        System.out.println("Initial vacation days: "+this.vacationDays + ", Final vacation days: " + finalVacationDays);
        this.vacationDays = finalVacationDays;
    }

}
