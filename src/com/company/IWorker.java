package com.company;

import java.util.ArrayList;

public interface IWorker {
    void increaseSalary();
    void increaseVacationDays();
    void accept(IPromotion iPromotion);
    ArrayList<Employee> employees = new ArrayList<>();
    ArrayList<Clerk> clerks = new ArrayList<>();
}
