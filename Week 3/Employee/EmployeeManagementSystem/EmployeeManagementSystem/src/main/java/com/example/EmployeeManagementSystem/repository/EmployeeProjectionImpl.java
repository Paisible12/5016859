package com.example.EmployeeManagementSystem.projection;

public class EmployeeProjectionImpl {

    private Long id;
    private String name;
    private String email;

    public EmployeeProjectionImpl(Long id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

}
