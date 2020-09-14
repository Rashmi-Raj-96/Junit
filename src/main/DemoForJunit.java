package main;

import employeeDetails.EmployeeExperience;
import employeeDetails.EmployeeName;
import employeeDetails.EmployeeSalary;
import model.Employee;

import java.time.LocalDate;

public class DemoForJunit {
    public static void main( String args[]) {
        Employee firstEmployee= new Employee();
        EmployeeExperience experience=new EmployeeExperience();
        EmployeeSalary employeeSalary = new EmployeeSalary();
        EmployeeName employeeName = new EmployeeName();
        firstEmployee.setFirstName("Rashmi");
        firstEmployee.setLastName("Raj");
        firstEmployee.setDateOfJoining("23-07-2020");
        firstEmployee.setMonthlySalary(40000);
        System.out.println(employeeName.getDisplayName(firstEmployee)+": working since "+ experience.getExperienceInYears(firstEmployee)+" years and"+ experience.getExperienceInDays(firstEmployee)+" days");
        System.out.println("Annual Salary: "+employeeSalary.getAnnualSalary(firstEmployee));
        System.out.println("Appraisal: "+employeeSalary.getAppraisal(firstEmployee));
        System.out.println("Total Salary Annually including appraisal"+ employeeSalary.getTotalSalary(firstEmployee));

    }
}
