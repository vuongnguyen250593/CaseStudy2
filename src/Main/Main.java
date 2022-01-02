package Main;
import Employee.Employee;
import Manager.EmployeeManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeManager employeeManager = new EmployeeManager();
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            System.out.println("Sign in");
            System.out.print("Account: ");
            String account = scanner.nextLine();
            System.out.print("Password: ");
            String pass = scanner.nextLine();
            if (account.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("123456789")) {
                check = true;
                int choice;
                do {
                    System.out.println("_________________✫✫✫✫✫✫✫✫✫✫✫✫✫✫__________________");
                    System.out.println("| 1.  Display all Employee                            |");
                    System.out.println("| 2.  Display Part-time Employee                      |");
                    System.out.println("| 3.  Display Full-time Employee                      |");
                    System.out.println("| 4.  Add an Employee                                 |");
                    System.out.println("| 5.  Delete an Employee by ID                        |");
                    System.out.println("| 6.  Update an Employee by ID                        |");
                    System.out.println("| 7.  View an Employee by ID                          |");
                    System.out.println("| 8.  Sort Employee by KPI                            |");
                    System.out.println("| 9.  Display Employee with max KPI                   |");
                    System.out.println("| 10. Review Employee by KPI                          |");
                    System.out.println("| 11. Bonus by KPI                                    |");
                    System.out.println("| 12. Write to file.csv                               |");
                    System.out.println("| 13. Read from file.csv                              |");
                    System.out.println("| 0.  Exit                                            |");
                    System.out.println("_________________✫✫✫✫✫✫✫✫✫✫✫✫✫✫__________________");
                    boolean check1 = false;
                    do {
                        System.out.print("Enter your choice: ");
                        choice = scanner.nextInt();
                        System.out.println("_______________________________________________________");
                        if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5 || choice == 6 || choice == 7 || choice == 8 || choice == 9 || choice == 10 || choice == 11 || choice == 12 || choice == 13) {
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
                                    Employee employee = employeeManager.createrEmployee();
                                    employeeManager.addEmployee(employee);
                                    break;
                                case 5:
                                    System.out.println("5. Delete an Employee by ID");
                                    break;
                                case 6:
                                    System.out.println("6. Update an Employee by ID");
                                    break;
                                case 7:
                                    System.out.println("7. View an Employee by ID");
                                    break;
                                case 8:
                                    System.out.println("8. Sort Employee by KPI");
                                    break;
                                case 9:
                                    System.out.println("9. Display Employee with max KPI");
                                    break;
                                case 10:
                                    System.out.println("10. Review Employee by KPI");
                                    break;
                                case 11:
                                    System.out.println("11. Bonus by KPI");
                                    break;
                                case 12:
                                    System.out.println("12. Write to file.csv");
                                    break;
                                case 13:
                                    System.out.println("13. Read from file.csv");
                                    break;
                            }
                        } else {
                            System.out.println("Do not have the number. Please Re-Enter!");
                        }
                    } while (!check1);
                } while (true);
            } else {
                System.out.println("---------------------------------------------------------------");
                System.out.println("Account or password is not existence or error. Please Re-Enter!");
                System.out.println("---------------------------------------------------------------");
                check = false;
            }
        } while (true);
    }
}
