package Main;
import Employee.Employee;
import Manager.EmployeeManager;
import Manager.IOManager;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        IOManager ioManager = new IOManager();
        Scanner scanner = new Scanner(System.in);
        boolean check;
         do {
            System.out.println("Sign in with Admin Account");
            System.out.print("Account: ");
            String account = scanner.nextLine();
            System.out.print("Password: ");
            String pass = scanner.nextLine();
            if (account.equals("admin") && pass.equals("123456789")) {
                check = true;
                int choice;
                do {
                    System.out.println("------------------------✫✫✫✫✫✫✫✫✫✫✫✫✫✫------------------------");
                    System.out.println("|   1.  Display all Employee                                       |");
                    System.out.println("|   2.  Display Part-time Employee                                 |");
                    System.out.println("|   3.  Display Full-time Employee                                 |");
                    System.out.println("|   4.  Add an Employee                                            |");
                    System.out.println("|   5.  Delete an Employee by ID                                   |");
                    System.out.println("|   6.  Update an Employee by ID                                   |");
                    System.out.println("|   7.  View an Employee by ID                                     |");
                    System.out.println("|   8.  Sort Employee by KPI                                       |");
                    System.out.println("|   9.  Display Employee with max KPI                              |");
                    System.out.println("|   10. Review Employee by KPI                                     |");
                    System.out.println("|   11. Bonus by KPI                                               |");
                    System.out.println("|   12. Write to file.csv                                          |");
                    System.out.println("|   13. Read from file.csv                                         |");
                    System.out.println("|   0.  Exit                                                       |");
                    System.out.println("------------------------✫✫✫✫✫✫✫✫✫✫✫✫✫✫------------------------");
                    boolean check1 = false;
                    do {
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        System.out.println("________________________________________________________________");
                        if (choice <= 13) {
                            check1 = true;
                            switch (choice) {
                                case 1:
                                    System.out.println("1. Display all Employee");
                                    employeeManager.displayAllEmployee();
                                    break;
                                case 2:
                                    System.out.println("2. Display Part-time Employee");
                                    ArrayList<Employee> partTimeEmployee = employeeManager.displayPartTime();
                                    partTimeEmployee.forEach(System.out::println);
                                    break;
                                case 3:
                                    System.out.println("3. Display Full-time Employee");
                                    ArrayList<Employee> fullTimeEmployee = employeeManager.displayFullTime();
                                    fullTimeEmployee.forEach(System.out::println);
                                    break;
                                case 4:
                                    System.out.println("4. Add an Employee");
                                    Employee employee = employeeManager.createEmployee();
                                    employeeManager.addEmployee(employee);
                                    break;
                                case 5:
                                    System.out.println("5. Delete an Employee by ID");
                                    System.out.print("Enter ID that you want to delete: ");
                                    int deleteId = scanner.nextInt();
                                    employeeManager.deleteEmployee(deleteId);
                                    break;
                                case 6:
                                    System.out.println("6. Update an Employee by ID");
                                    System.out.print("Enter ID that you want to update: ");
                                    int updateId = scanner.nextInt();
                                    employeeManager.updateEmployee(updateId);
                                    break;
                                case 7:
                                    System.out.println("7. View an Employee by ID");
                                    System.out.print("Enter ID that you want to view: ");
                                    int viewId = scanner.nextInt();
                                    employeeManager.viewEmployee(viewId);
                                    break;
                                case 8:
                                    System.out.println("8. Sort Employee by KPI");
                                    employeeManager.sortEmployeeByKPI();
                                    break;
                                case 9:
                                    System.out.println("9. Display Employee with max KPI");
                                    ArrayList<Employee> maxKPI = employeeManager.viewMaxKPI();
                                    maxKPI.forEach(System.out::println);
                                    break;
                                case 10:
                                    System.out.println("10. Review Employee by KPI");
                                    employeeManager.reviewByKPI();
                                    break;
                                case 11:
                                    System.out.println("11. Bonus by KPI");
                                    employeeManager.bonusByKPI();
                                    break;
                                case 12:
                                    System.out.println("12. Write to file.csv");
                                    System.out.print("Link File: ");
                                    String write = scanner.next();
                                    ioManager.writeFile(employeeManager.getEmployees(), write);
                                    break;
                                case 13:
                                    System.out.println("13. Read from file.csv");
                                    System.out.print("Link File: ");
                                    String read = scanner.next();
                                    ArrayList<Employee> employee1 = ioManager.readFile(read);
                                    for (Employee e: employee1) {
                                        System.out.println(e);
                                    }
                                    break;
                            }
                        } else {
                            System.out.println("☢ Do not have the number. Please Re-Enter!");
                        }
                    } while (!check1);
                } while (true);
            } else {
                System.out.println("-------------------------------------------------------------------");
                System.out.println("    ☢ Account or password is not existence or error. Please Re-Enter!");
                System.out.println("-------------------------------------------------------------------");
                check = false;
            }
        } while (true);
    }
}
