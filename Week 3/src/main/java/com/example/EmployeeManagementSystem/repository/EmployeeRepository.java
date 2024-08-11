package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Employee;
import com.example.EmployeeManagementSystem.projection.EmployeeProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.department.id = :departmentId")
    List<EmployeeProjection> findByDepartmentId(@Param("departmentId") Long departmentId);
    @Query("SELECT new com.example.EmployeeManagementSystem.projection.EmployeeProjectionImpl(e.id, e.name, e.email) FROM Employee e WHERE e.department.id = :departmentId")
    List<EmployeeProjectionImpl> findByDepartmentIdClassBased(@Param("departmentId") Long departmentId);
}
