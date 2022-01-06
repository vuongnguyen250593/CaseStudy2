package Interface;

import Employee.Employee;

import java.util.ArrayList;

public interface KPI {
    void sortEmployeeByKPI();

    ArrayList<Employee> viewMaxKPI();

    void reviewByKPI();

    void bonusByKPI();
}
