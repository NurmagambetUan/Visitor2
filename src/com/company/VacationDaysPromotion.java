package com.company;

public class VacationDaysPromotion implements IPromotion {
    @Override
    public void visitEmployee(Employee employee) {
        if (employee.workingMonths >= 24) {
            employee.increaseVacationDays();
        }
    }

    @Override
    public void visitClerk(Clerk clerk) {
        if (clerk.workingMonths >= 24) {
            clerk.increaseVacationDays();
        }
    }
}
