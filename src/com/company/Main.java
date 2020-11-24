package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee ("Leo Messi",40000,50, 100);
        Employee employee2 = new Employee ("Cristiano",34000,42, 84);
        Employee employee3 = new Employee ("Mo Salah",25000,22, 44);
        Employee employee4 = new Employee ("Ronaldo",15000,15, 30);

        Clerk clerk1 = new Clerk("Klopp", 35000, 28,56);
        Clerk clerk2 = new Clerk("Benites", 15000, 12,24);
        Clerk clerk3 = new Clerk("Guardiola", 40000, 32,64);
        Clerk clerk4 = new Clerk("Mourinho", 28000, 18,36);

        IPromotion salaryPromotion = new SalaryPromotion();
        IPromotion vacationDaysPromotion = new VacationDaysPromotion();
        IPromotion workerSorting = new WorkerSorting();

        ArrayList<IWorker> workers = new ArrayList<>();
        workers.add(employee1);
        workers.add(employee2);
        workers.add(employee3);
        workers.add(employee4);
        workers.add(clerk1);
        workers.add(clerk2);
        workers.add(clerk3);
        workers.add(clerk4);

        for (IWorker w: workers) {
            w.accept(workerSorting);
        }

        System.out.println();

        for (IWorker w: workers) {
            w.accept(salaryPromotion);
        }

        System.out.println();

        for (IWorker w: workers) {
            w.accept(vacationDaysPromotion);
        }

        System.out.println();

        System.out.println("Overall " + IWorker.employees.size() + " Employees");
        System.out.println("Overall " + IWorker.clerks.size() + " Clerks");
    }
}
