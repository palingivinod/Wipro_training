import java.util.*;
import java.util.stream.Collectors;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    public Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }

    public String toString() {
        return "EmpNo: " + empNo + ", Name: " + name + ", Age: " + age + ", Location: " + location;
    }
}
public class FilterEmployeesByLocation {
    public static void main(String[] args) {

        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(101, "Vinnu", 24, "Hyderabad"));
        employeeList.add(new Employee(102, "Chinni", 25, "Pune"));
        employeeList.add(new Employee(103, "Abhi", 26, "Delhi"));
        employeeList.add(new Employee(104, "Shree", 27, "Pune"));
        employeeList.add(new Employee(105, "kenji", 28, "Mumbai"));

        List<Employee> puneEmployees = employeeList.stream()
                .filter(emp -> emp.location.equalsIgnoreCase("Pune"))
                .collect(Collectors.toList());
        System.out.println("Employees in Pune:");
        puneEmployees.forEach(System.out::println);//Here we calling the toString method of Employee class to print details automatically inside the jvm
        
    }
}
