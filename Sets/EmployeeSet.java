import java.util.HashSet;
import java.util.Iterator;

public class EmployeeSet {

    public static void main(String[] args) {

        HashSet<String> employeeNames = new HashSet<>();

        employeeNames.add("Anil");
        employeeNames.add("Bhavya");
        employeeNames.add("Charan");
        employeeNames.add("Deepa");
        employeeNames.add("Esha");

        Iterator<String> iterator = employeeNames.iterator();

        System.out.println("Employee Names:");
        while (iterator.hasNext()) {
            String name = iterator.next();
            System.out.println(name);
        }
    }
}
