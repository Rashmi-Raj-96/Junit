package employeeDetails;

import model.Employee;
import org.junit.Test;

import static org.junit.Assert.*;

public class EmployeeExperienceTest {

    Employee employee=new Employee();
    //mock this class
    EmployeeExperience experience = new EmployeeExperience();
    //mock this class

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
        assertEquals(50,experienceDays,0.0);
    }


}