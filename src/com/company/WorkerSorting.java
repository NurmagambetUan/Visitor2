package com.company;

public class WorkerSorting implements IPromotion {

    @Override
    public void visitEmployee(Employee employee) {
        employee.Add(employee);
        System.out.println(employee.name + " is Employee");
    }

    @Override
    public void visitClerk(Clerk clerk) {
        clerk.Add(clerk);
        System.out.println(clerk.name + " is Clerk");
    }
}
