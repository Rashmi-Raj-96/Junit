package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String firstName;
    private  String lastName;
    private String dateOfJoining;
    private double monthlySalary;

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfJoining() {
        return dateOfJoining;
    }

    public void setFirstName( String firstName) {
        this.firstName=firstName;
    }

    public void setLastName(String lastName) {
      this.lastName=lastName;
    }

    public void setDateOfJoining(String dateOfJoining) {
        this.dateOfJoining=dateOfJoining;
    }


}
