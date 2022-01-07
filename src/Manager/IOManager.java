package Manager;

import Employee.Employee;
import Interface.CreateFile;

import java.io.*;
import java.util.ArrayList;

public class IOManager implements CreateFile {
    ArrayList<Employee> employees = new ArrayList<>();
    @Override
    public void writeFile(ArrayList<Employee> employees, String pathName) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(pathName,true));
            for (Employee e: employees) {
                bufferedWriter.write(e.display());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("    Wrote to File");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Employee> readFile(String pathName) {
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
                employees.add(new Employee(id, name, age, phoneNumber, emmail, department, jopType, salary, kpi));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return employees;
    }
}
