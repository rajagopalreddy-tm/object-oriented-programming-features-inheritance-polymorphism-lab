package com.trainingmug.employee.app;

public class Employee {

    // Instance Variables

    public long empId;
    public String name;
    public String designation;
    public float grossSalary;
    public float travellingAllowances;
    public float federalTax;
    public float stateTax;
    public float incrementPercentage;


    static String companyName = "Digi-Safari Pvt Ltd";
    static String companyContactNo = "+1 678-505-0990";
    static int employeeCount = 0;



    public Employee() {
        this.empId = 1111;
        this.name = "Andrew Fuller";
        this.designation = "Senior Software Engineer";
        this.grossSalary = 5208.33f;
        this.travellingAllowances = 300.0f;
        this.federalTax = 611.86f;
        this.stateTax = 359.24f;
        this.incrementPercentage = 15.3f;
        employeeCount++;
    }

    public Employee(long empId, String name, String designation, float grossSalary, float travellingAllowances, float federalTax, float stateTax, float incrementPercentage) {
        this.empId = empId;
        this.name = name;
        this.designation = designation;
        this.grossSalary = grossSalary;
        this.travellingAllowances = travellingAllowances;
        this.federalTax = federalTax;
        this.stateTax = stateTax;
        this.incrementPercentage = incrementPercentage;
        employeeCount++;
    }


    public void displayProfile() {
        System.out.println("displayProfile() - Employee Class");
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Travelling Allowances: " + travellingAllowances);
        System.out.println("Federal Tax: " + federalTax);
        System.out.println("State Tax: " + stateTax);
        System.out.println("Net Salary Increment Percentage: " + incrementPercentage);
        System.out.println("Net Salary: " + this.calculateNetSalary());
        System.out.println("Net Salary After Increment: " + this.calculateNetSalaryAfterIncrement());
    }

    static void displayCompanyInfo() {
        System.out.println("Company Name : " + companyName);
        System.out.println("Company Contact No : " + companyContactNo);
        System.out.println("Employee Count : " + employeeCount);
    }

    float calculateNetSalary() {
        System.out.println("calculateNetSalary() - Employee Class");
        return grossSalary - federalTax - stateTax;
    }

    float calculateNetSalaryAfterIncrement() {
        System.out.println("calculateNetSalaryAfterIncrement() - Employee Class");
        float netSalary;
        netSalary = calculateNetSalary();
        netSalary += (netSalary * incrementPercentage / 100);
        return netSalary;
    }

}
