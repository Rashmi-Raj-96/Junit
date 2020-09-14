package employeeDetails;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeNameTest {

    @Test
    public void testGetDisplayName() {
        Employee firstEmployee = new Employee();
        EmployeeName employeeName=new EmployeeName();
        firstEmployee.setFirstName("ram");
        firstEmployee.setLastName("raavan");
        String displayName = employeeName.getDisplayName(firstEmployee);
        assertEquals("ram raavan",displayName);

    }
}