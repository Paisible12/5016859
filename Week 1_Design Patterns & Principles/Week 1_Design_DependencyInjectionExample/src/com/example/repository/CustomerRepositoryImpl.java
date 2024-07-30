package com.example.repository;

public class CustomerRepositoryImpl implements CustomerRepository {

    @Override
    public String findCustomerById(String id) {
        return "Customer{id='" + id + "', name='John Doe'}";
    }
}
