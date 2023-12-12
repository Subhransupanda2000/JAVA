import java.util.HashSet;

class Employee {
    private int id;
    private String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        Employee employee = (Employee) obj;
        return id == employee.id;
    }
}

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet of Employees
        HashSet<Employee> employeeSet = new HashSet<>();

        // Adding employees to the HashSet
        employeeSet.add(new Employee(1, "John Doe"));
        employeeSet.add(new Employee(2, "Jane Smith"));
        employeeSet.add(new Employee(1, "John Doe")); // Duplicate, won't be added

        // Displaying the unique employees
        System.out.println("Unique Employees:");
        for (Employee employee : employeeSet) {
            System.out.println("ID: " + employee.getId() + ", Name: " + employee.getName());
        }
    }
}
