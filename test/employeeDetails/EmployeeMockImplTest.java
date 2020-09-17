package employeeDetails;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;


import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeMockImplTest {

   @InjectMocks
           EmployeeMockImpl employeeMockImpl =new EmployeeMockImpl();

   @Mock
      EmployeeMock employeeMock;
   //the test case was failing with only mockito-core
    //needed to add mockito-all
    @Test
    public void setRandomEmployeeID() {
        when(employeeMock.setRandomEmployeeID()).thenReturn("esarjar");
       assertEquals("esarjar",employeeMockImpl.setRandomEmployeeID());
        assertEquals("esarjar",employeeMockImpl.setRandomEmployeeID());
       // verify(employeeMock).setRandomEmployeeID();
        //cannot run together when the equals are used two times for same method as
        //verify does comparing by default
        //testing if its done for two times
        //we also have verify with never argument,atleast, atmost
        verify(employeeMock,times(2)).setRandomEmployeeID();
    }
}