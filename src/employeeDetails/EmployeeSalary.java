package employeeDetails;

import model.Employee;

public class EmployeeSalary {

    public double getAnnualSalary(Employee newEmployee) {
        double annualSalary = 0;
        annualSalary= newEmployee.getMonthlySalary()*12;
        return annualSalary;

    }

    public double getAppraisal(Employee newEmployee) {
        double appraisal=0;
        if (newEmployee.getMonthlySalary()<10000) {
            appraisal=600;
        }
        else
            appraisal=(newEmployee.getMonthlySalary()*10)/100+600;
        return  appraisal;

    }

    public double getTotalSalary(Employee newEmployee) {
        return (getAppraisal(newEmployee)+getAnnualSalary(newEmployee));
    }


}
