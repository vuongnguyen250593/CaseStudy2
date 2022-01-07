package Interface;

import Employee.Employee;

import java.util.ArrayList;

public interface CreateFile {
    void writeFile(ArrayList<Employee> employees, String pathName);

    ArrayList<Employee> readFile(String pathName);
}
