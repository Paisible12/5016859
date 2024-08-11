package com.example.EmployeeManagementSystem.repository;

import com.example.EmployeeManagementSystem.model.Department;
import com.example.EmployeeManagementSystem.projection.DepartmentProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
	
    @Query("SELECT d FROM Department d")
    List<DepartmentProjection> findAllDepartments();
    
    @Query("SELECT new com.example.EmployeeManagementSystem.projection.DepartmentProjectionImpl(d.id, d.name) FROM Department d")
    List<DepartmentProjectionImpl> findAllDepartmentsClassBased();
}
