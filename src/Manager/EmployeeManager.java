package Manager;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class EmployeeManager {
    ArrayList<Employee> employees;
    Scanner scanner = new Scanner(System.in);

    public EmployeeManager() {
    }

    public EmployeeManager(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }

    public void displayAllEmployee() {
        employees.forEach(System.out::println);
    }

    public ArrayList<Employee> displayPartTime() {
        ArrayList<Employee> partTimeEmployee = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getJobType().equalsIgnoreCase("part-time")) {
                partTimeEmployee.add(employee);
            }
        }
        return partTimeEmployee;
    }

    public ArrayList<Employee> displayFullTime() {
        ArrayList<Employee> fullTimeEmployee = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getJobType().equalsIgnoreCase("full-time")) {
                fullTimeEmployee.add(employee);
            }
        }
        return fullTimeEmployee;
    }

    public Employee createrEmployee() {
        System.out.print("Enter ID: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        System.out.print("Enter Phone number: ");
        int phoneNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Email: ");
        String email = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Department: ");
        String department = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Job-Type: ");
        String jobType = scanner.nextLine();
        scanner.nextLine();
        System.out.print("Enter Salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter KPI: ");
        int kpi = scanner.nextInt();
        return new Employee(id, name, age, phoneNumber, email, department, jobType, salary, kpi);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}
