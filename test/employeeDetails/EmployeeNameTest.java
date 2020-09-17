package employeeDetails;

import model.Employee;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;


public class EmployeeNameTest {

    @InjectMocks
    Employee firstEmployee;

    @InjectMocks
    EmployeeName employeeName;

    @Before
    public void init() {
        //here we used initMocks explicitly instead of MockitoRunner to process annotations
        MockitoAnnotations.initMocks(this);

    }
   /* public void getDisplayName() {
        when(employeeName.getDisplayName(firstEmployee)).thenReturn("ram raavan");
    }
    //gave error org.mockito.exceptions.misusing.MissingMethodInvocationException:
*/


    @Test
    public void testGetDisplayName() {

        firstEmployee.setFirstName("ram");
        firstEmployee.setLastName("raavan");

        assertEquals("ram raavan",employeeName.getDisplayName(firstEmployee));
        assertEquals("ram raavan",employeeName.getDisplayName(firstEmployee));
       // verify(employeeName,times(2)).getDisplayName(firstEmployee);
        //cannot be verified as done only on mock
    }
}