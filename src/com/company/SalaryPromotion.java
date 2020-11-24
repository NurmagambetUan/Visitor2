package com.company;

public class SalaryPromotion implements IPromotion {
    @Override
    public void visitEmployee(Employee employee) {
        if (employee.workingMonths >= 24) {
            employee.increaseSalary();
        }
    }

    @Override
    public void visitClerk(Clerk clerk) {
        if (clerk.workingMonths >= 24) {
            clerk.increaseSalary();
        }
    }
}
