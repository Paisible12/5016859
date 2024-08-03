
import java.util.Arrays;
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size;

    public EmployeeManagementSystem(int capacity) {
        employees = new Employee[capacity];
        size = 0;
    }

    public boolean addEmployee(Employee employee) {
        if (size >= employees.length) {
            System.out.println("Array is full. Cannot add more employees.");
            return false;
        }
        employees[size++] = employee;
        return true;
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    public boolean deleteEmployee(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].employeeId == employeeId) {
               
                for (int j = i; j < size - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[--size] = null;  
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        // Add employees
        ems.addEmployee(new Employee(1, "Alice", "Manager", 85000));
        ems.addEmployee(new Employee(2, "Bob", "Developer", 70000));
        ems.addEmployee(new Employee(3, "Charlie", "Analyst", 55000));

        // Traverse 
        System.out.println("All Employees:");
        ems.traverseEmployees();

        // Search 
        System.out.println("\nSearch for Employee with ID 2:");
        Employee emp = ems.searchEmployee(2);
        System.out.println(emp != null ? emp : "Employee not found.");

        // Delete 
        System.out.println("\nDeleting Employee with ID 2:");
        boolean deleted = ems.deleteEmployee(2);
        System.out.println(deleted ? "Employee deleted successfully." : "Employee not found.");


        System.out.println("\nAll Employees after deletion:");
        ems.traverseEmployees();
    }
}
