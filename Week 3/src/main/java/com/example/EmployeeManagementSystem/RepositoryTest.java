package com.example.EmployeeManagementSystem;

import com.example.EmployeeManagementSystem.entity.Department;
import com.example.EmployeeManagementSystem.entity.Employee;
import com.example.EmployeeManagementSystem.repository.DepartmentRepository;
import com.example.EmployeeManagementSystem.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class RepositoryTest implements CommandLineRunner {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public static void main(String[] args) {
        SpringApplication.run(RepositoryTest.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Department department = new Department();
        department.setName("Engineering");
        department = departmentRepository.save(department);
        Employee employee = new Employee();
        employee.setName("John Doe");
        employee.setEmail("john.doe@example.com");
        employee.setDepartment(department);
        employeeRepository.save(employee);
        List<Employee> employees = employeeRepository.findByDepartmentId(department.getId());
        System.out.println("Employees in department: " + employees);
        Department fetchedDepartment = departmentRepository.findByName("Engineering");
        System.out.println("Fetched department: " + fetchedDepartment);
    }
}
