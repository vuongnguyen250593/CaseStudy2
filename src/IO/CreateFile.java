package IO;

import Employee.Employee;

import java.util.ArrayList;

public interface CreateFile {
    void writeFile(String pathName);

    ArrayList<Employee> readFile(String pathName);
}
