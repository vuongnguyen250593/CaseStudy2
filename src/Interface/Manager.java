package Interface;

import Employee.Employee;

public interface Manager {
    Employee createEmployee();

    void addEmployee(Employee employee);

    void deleteEmployee(int id);

    void updateEmployee(int id);
}
