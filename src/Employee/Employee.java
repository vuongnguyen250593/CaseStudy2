package Employee;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String phoneNumber;
    private String email;
    private String department;
    private String jobType;
    private double salary;
    private int kpi;

    public Employee() {
    }

    public Employee(int id, String name, int age, String phoneNumber, String email, String department, String jobType, double salary, int kpi) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.department = department;
        this.jobType = jobType;
        this.salary = salary;
        this.kpi = kpi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getKpi() {
        return kpi;
    }

    public void setKpi(int kpi) {
        this.kpi = kpi;
    }

    @Override
    public String toString() {
        return String.format("%5d%15s%10d%20s%25s%20s%20s%20f%10d", id, name, age, phoneNumber, email, department, jobType, salary, kpi);
    }

    public String display() {
        return id + "," + name + "," + age + "," + phoneNumber + "," + email + "," + department + "," + jobType + "," + salary + "," + kpi;
    }
}
