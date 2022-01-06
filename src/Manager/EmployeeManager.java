package Manager;
import Employee.Employee;
import IO.CreateFile;
import Interface.CRUD;
import Interface.Display;
import Interface.KPI;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class EmployeeManager implements Display, CRUD, KPI, CreateFile {
    ArrayList<Employee> employees = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public EmployeeManager() {
    }

    @Override
    public void displayAllEmployee() {
        employees.forEach(System.out::println);
    }

    @Override
    public ArrayList<Employee> displayPartTime() {
        ArrayList<Employee> partTimeEmployee = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getJobType().equalsIgnoreCase("part-time") || employee.getJobType().equalsIgnoreCase("parttime")) {
                partTimeEmployee.add(employee);
            }
        }
        return partTimeEmployee;
    }

    @Override
    public ArrayList<Employee> displayFullTime() {
        ArrayList<Employee> fullTimeEmployee = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.getJobType().equalsIgnoreCase("full-time") || employee.getJobType().equalsIgnoreCase("fulltime")) {
                fullTimeEmployee.add(employee);
            }
        }
        return fullTimeEmployee;
    }

    @Override
    public Employee createEmployee() {
        boolean checkId = false;
        int id = 0;
        while (!checkId){
            System.out.print("- Enter ID: ");
            id = scanner.nextInt();
            if (employees.isEmpty()) {
                checkId = true;
            } else {
                for (Employee e: employees) {
                    if (id != e.getId()) {
                        checkId = true;
                        break;
                    }
                }
            }
            if (!checkId) {
                System.out.println("The ID is already existence");
            }
        }
        scanner.nextLine();
        System.out.print("- Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("- Enter Age: ");
        int age = scanner.nextInt();
        if (age < 18) {
            System.out.println("Bạn không đủ tuổi lao động");
            System.exit(0);
        } else if (age > 60) {
            System.out.println("Bạn đã quá tuổi lao động");
            System.exit(0);
        }
        Pattern phonePattern = Pattern.compile("^[0][1-9]{9}$");
        String phoneNumber = null;
        boolean checkPhone = false;
        while (!checkPhone) {
            System.out.print("- Enter Phone number: ");
            phoneNumber = scanner.next();
            if (phonePattern.matcher(phoneNumber).find()) {
                checkPhone = true;
            } else {
                System.out.println("The phone number should be included 10 number with 0 first!");
            }
        }
        Pattern emailPattern = Pattern.compile("^[A-Za-z0-9]+[A-Za-z0-9]*@[a-z]+(\\.[a-z]+)$");
        String email = null;
        boolean checkEmail = false;
        while (!checkEmail) {
            System.out.print("- Enter Email: ");
            email = scanner.next();
            if (emailPattern.matcher(email).find()) {
                checkEmail = true;
            } else {
                System.out.println("Email is wrong!");
            }
        }
        System.out.print("- Enter Department:  1. Finance  |  2. Marketing  |  3. Accounting  |  4. HR.  |  5. IT  | --------- ");
        String department = null;
        System.out.print("Your choice: ");
        int choiceDepartment = scanner.nextInt();
        switch (choiceDepartment) {
            case 1:
                department = "Finance";
                break;
            case 2:
                department = "Marketing";
                break;
            case 3:
                department = "Accounting";
                break;
            case 4:
                department = "HR";
                break;
            case 5:
                department = "IT";
                break;
        }
        System.out.print("- Enter Job-Type:  1. Full-time  |  2. Part-time  | ---------- ");
        String jobType = null;
        System.out.print("Your choice: ");
        int choiceJobType = scanner.nextInt();
        switch (choiceJobType) {
            case 1:
                jobType = "Full-time";
                break;
            case 2:
                jobType = "Part-time";
                break;
        }
        System.out.print("- Enter Salary (million/month): ");
        double salary = scanner.nextDouble();
        System.out.print("- Enter KPI: ");
        int kpi = scanner.nextInt();
        return new Employee(id, name, age, phoneNumber, email, department, jobType, salary, kpi);
    }

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        Employee employee = null;
        for (Employee e: employees) {
            if (e.getId() == id) {
                employee = e;
            }
        }
        if (employee != null) {
            employees.remove(employee);
            System.out.println("Delete successfully!");
        } else {
            System.out.println("The ID is not existence!");
        }
    }

    @Override
    public void updateEmployee(int id) {
        Employee employee = null;
        for (Employee e: employees) {
            if (e.getId() == id) {
                employee = e;
            }
        }
        if (employee != null) {
            int index = employees.indexOf(employee);
            scanner.nextLine();
            System.out.print("- Re-Enter Name: ");
            String name = scanner.nextLine();
            employee.setName(name);
            scanner.nextLine();
            System.out.print("- Re-Enter Age: ");
            int age = scanner.nextInt();
            employee.setAge(age);
            scanner.nextLine();
            System.out.print("- Re-Enter Phone number: ");
            String phoneNumber = scanner.nextLine();
            employee.setPhoneNumber(phoneNumber);
            scanner.nextLine();
            System.out.print("- Re-Enter Email: ");
            String email = scanner.nextLine();
            employee.setEmail(email);
            scanner.nextLine();
            System.out.print("- Re-Enter Department:  1. Finance  |  2. Marketing  |  3. Accounting  |  4. HR.  |  5. IT   | ---------- ");
            String department = null;
            System.out.print("Your choice: ");
            int choiceDepartment = scanner.nextInt();
            switch (choiceDepartment) {
                case 1:
                    department = "Finance";
                    break;
                case 2:
                    department = "Marketing";
                    break;
                case 3:
                    department = "Accounting";
                    break;
                case 4:
                    department = "HR";
                    break;
                case 5:
                    department = "IT";
                    break;
            }
            employee.setDepartment(department);
            System.out.print("- Re-Enter Job-Type:  1. Full-time  |  2. Part-time  | ---------- ");
            String jobType = null;
            System.out.print("- Your choice: ");
            int choiceJobType = scanner.nextInt();
            switch (choiceJobType) {
                case 1:
                    jobType = "Full-time";
                    break;
                case 2:
                    jobType = "Part-time";
                    break;
            }
            employee.setJobType(jobType);
            System.out.print("- Re-Enter Salary (million/month): ");
            double salary = scanner.nextDouble();
            employee.setSalary(salary);
            System.out.print("- Enter KPI: ");
            int kpi = scanner.nextInt();
            employee.setKpi(kpi);
            employees.set(index, employee);
            System.out.println("Update Successfully!");
        } else {
            System.out.println("The ID is not existence!");
        }
    }

    @Override
    public void viewEmployee(int id) {
        Employee employee = null;
        for (Employee e: employees) {
            if (e.getId() == id) {
                employee = e;
            }
        }
        if (employee != null) {
            System.out.println(employee);
        } else {
            System.out.println("The ID is not existence!");
        }
    }

    @Override
    public void sortEmployeeByKPI() {
        employees.sort((o1, o2) -> {
            if (o1 != null && o2 != null) {
                return Integer.compare(o2.getKpi(), o1.getKpi());
            } else {
                return 0;
            }
        });
    }

    @Override
    public ArrayList<Employee> viewMaxKPI() {
        ArrayList<Employee> maxKPI = new ArrayList<>();
        int max = employees.get(0).getKpi();
        for (Employee employee : employees) {
            if (employee.getKpi() > max) {
                max = employee.getKpi();
            }
        }
        for (Employee employee : employees) {
            if (employee.getKpi() == max) {
                maxKPI.add(employee);
            }
        }
        return maxKPI;
    }

    @Override
    public void reviewByKPI() {
        for (Employee e: employees) {
            if (e.getKpi() >= 1 && e.getKpi() <= 4) {
                System.out.printf("%15s%20s%15s", e.getName(), e.getDepartment(), "Bad");
            } else if (e.getKpi() >= 5 && e.getKpi() <= 6) {
                System.out.printf("%15s%20s%15s", e.getName(), e.getDepartment(), "Normal");
            } else if (e.getKpi() >= 7 && e.getKpi() <= 8) {
                System.out.printf("%15s%20s%15s", e.getName(), e.getDepartment(), "Good");
            } else {
                System.out.printf("%15s%20s%15s", e.getName(), e.getDepartment(), "Great");
            }
            System.out.println();
        }
    }

    @Override
    public void bonusByKPI() {
        for (Employee e: employees) {
            if (e.getKpi() >= 1 && e.getKpi() <= 4) {
                System.out.printf("%15s%20s%10d%15s", e.getName(), e.getDepartment(), e.getKpi(), "0");
            } else if (e.getKpi() >= 5 && e.getKpi() <= 6) {
                System.out.printf("%15s%20s%10d%15s", e.getName(), e.getDepartment(), e.getKpi(), "1" );
            } else if (e.getKpi() >= 7 && e.getKpi() <= 8) {
                System.out.printf("%15s%20s%10d%15s", e.getName(), e.getDepartment(), e.getKpi(), "5");
            } else {
                System.out.printf("%15s%20s%10d%15s", e.getName(), e.getDepartment(), e.getKpi(), "10");
            }
        }
    }

    @Override
    public void writeFile(String pathName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName,true));
            for (Employee e: employees) {
                bufferedWriter.write(e.display());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Wrote to File Employee.csv");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Employee> readFile(String pathName) {
        ArrayList<Employee> employees1 = new ArrayList<>();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(pathName));
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strings = line.split(",");
                int id = Integer.parseInt(strings[0]);
                String name = strings[1];
                int age = Integer.parseInt(strings[2]);
                String phoneNumber = strings[3];
                String emmail = strings[4];
                String department = strings[5];
                String jopType = strings[6];
                double salary = Double.parseDouble(strings[7]);
                int kpi = Integer.parseInt(strings[8]);
                employees1.add(new Employee(id, name, age, phoneNumber, emmail, department, jopType, salary, kpi));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        employees = employees1;
        return employees1;
    }
}
