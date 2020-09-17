package employeeDetails;

import model.Employee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeSalaryTest {



    @InjectMocks
    EmployeeSalary salary;

    @InjectMocks
    Employee employee;

    @Test
    public void testGetAnnualSalary() {
        //why cant we define this outside
       employee.setMonthlySalary(40000);
       //assertEquals(480000,salary.getAnnualSalary()); this method is deprecated which means we have to pass third argument to see how close they can be in decimal value
        assertEquals(480000,salary.getAnnualSalary(employee),0.0); //works fine
    }

    @Test
    public void testGetAppraisal() {
        employee.setMonthlySalary(41000);
        assertEquals(4700,salary.getAppraisal(employee),0.0);
    }

    @Test
    public void testGetTotalSalary() {
        employee.setMonthlySalary(30000);
        assertEquals(363600,salary.getTotalSalary(employee),0.0);
    }
}