package Employee;

public class Employee {
    private int id;
    private String name;
    private int age;
    private int phoneNumber;
    private String email;
    private String department;
    private String jobType;
    private double salary;
    private int kpi;

    public Employee() {
    }

    public Employee(int id, String name, int age, int phoneNumber, String email, String department, String jobType, double salary, int kpi) {
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

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
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
        return "Employee [" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                ", phoneNumber = " + phoneNumber +
                ", email = '" + email + '\'' +
                ", department = '" + department + '\'' +
                ", jobType = '" + jobType + '\'' +
                ", salary = " + salary +
                ", kpi = " + kpi +
                ']';
    }
}
