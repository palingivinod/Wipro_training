

import java.util.*;
@FunctionalInterface
interface MyFunction {
    String apply(Employee emp);
}


class Employee {
    int id;
    String name;
    String location;
    double salary;

    public Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}


public class EmployeeLocation {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee(1, "Vinnu", "Hyderabad", 50000));
        employees.add(new Employee(2, "Abde", "Bangalore", 55000));
        employees.add(new Employee(3, "Chinni", "Pune", 52000));
        employees.add(new Employee(4, "Abhi", "Delhi", 51000));
        employees.add(new Employee(5, "Shree", "Mumbai", 53000));

        MyFunction getLocation = (Employee emp) -> emp.location;
        ArrayList<String> locations = new ArrayList<>();
        for (Employee emp : employees) {
            locations.add(getLocation.apply(emp));
        }

        System.out.println("Locations:");
        locations.forEach(System.out::println);
    }
}
