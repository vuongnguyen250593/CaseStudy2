package Interface;

import Employee.Employee;

import java.util.ArrayList;

public interface Display {
    void displayAllEmployee();

    ArrayList<Employee> displayPartTime();

    ArrayList<Employee> displayFullTime();

    void viewEmployee(int id);
}
