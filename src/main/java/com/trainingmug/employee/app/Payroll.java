package com.trainingmug.employee.app;

public class Payroll {

    void displayProfile(Employee employee) {
        employee.displayProfile();
    }

    float calculateNetSalary(Employee employee) {
        return employee.calculateNetSalary();
    }

    float calculateNetSalaryAfterIncrement(Employee employee) {
        return employee.calculateNetSalaryAfterIncrement();
    }

    void displayProfile(int empId) {
        System.out.println("This method display the employee profile with Employee ID");
    }

    void displayProfile(float fromSalaryRange,float toSalaryRange) {
        System.out.println("This method display all employee profiles from and to given salary ranges");
    }

    void displayProfile(String department) {
        System.out.println("This method display all the employee profiles from a given department");
    }

}

