package com.example.EmployeeManagementSystem.repository;

import org.springframework.beans.factory.annotation.Value;

public interface Projection {

    @Value("#{target.id}")
    Long getId();

    @Value("#{target.name}")
    String getName();

    @Value("#{target.email}")
    String getEmail();
}
