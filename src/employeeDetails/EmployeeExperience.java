package employeeDetails;

import model.Employee;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmployeeExperience {


    //without Formatter it was throwing error
    DateTimeFormatter dateTimeFormatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");


    public long getExperienceInYears(Employee newEmployee) {

        //ChronoUnit contains 16 enum values to retrieve for calendar details which include centuries, narcos, day
        LocalDate d1= LocalDate.parse(newEmployee.getDateOfJoining(),dateTimeFormatter);
        return ChronoUnit.YEARS.between(d1, LocalDate.now());
    }
    public long getExperienceInDays(Employee newEmployee) {
        //ChronoUnit contains 16 enum values to retrieve for calendar details which include centuries, narcos, day
        LocalDate d1= LocalDate.parse(newEmployee.getDateOfJoining(),dateTimeFormatter);
        return ChronoUnit.DAYS.between(d1, LocalDate.now());
    }
}
