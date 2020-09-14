package employeeDetails;

import model.Employee;

public class EmployeeName {
    public String getDisplayName(Employee employee) {
        return employee.getFirstName()+" "+employee.getLastName();
    }
}
