package Interface;

import Employee.Employee;

import java.util.ArrayList;

public interface Display {
    void displayAllEmployee();

    ArrayList<Employee> displayPartTime();

    ArrayList<Employee> displayFullTime();

    ArrayList<Employee> viewEmployee(int id);

    void sortEmployeeByID();
}
