package employeeDetails;

import model.Employee;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
@RunWith(MockitoJUnitRunner.class)  //without this inject mock was throwing null pointer exception
public class EmployeeExperienceTest {

    //Mock used to create for a given class/interface
    //with Mock the test case was ignoring?
    @InjectMocks
    Employee employee;

    @InjectMocks
    EmployeeExperience experience;

    @Test
    public void testGetExperienceInYears() {
        // LocalDate dateOfJoining=LocalDate.parse("23-07-2020");
        //LocalDate currentDate=LocalDate.parse("08-09-2020");
        employee.setDateOfJoining("23-07-2020");
        long experienceYears= experience.getExperienceInYears(employee);
        assertEquals(0,experienceYears,0.0);
    }

    @Test
    public void testGetExperienceInDays() {
        //LocalDate dateOfJoining=LocalDate.parse("23-07-2020");
        //LocalDate currentDate=LocalDate.parse("08-09-2020");
        employee.setDateOfJoining("23-07-2020");
        //Employee firstEmployee = new Employee("Rashmi","Raj", dateOfJoining,()->currentDate);
        long experienceDays= experience.getExperienceInDays(employee);
        assertEquals(55,experienceDays,0.0);
    }


}