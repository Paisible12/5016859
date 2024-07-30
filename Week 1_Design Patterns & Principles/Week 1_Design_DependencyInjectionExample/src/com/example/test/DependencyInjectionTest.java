package com.example.test;

import com.example.repository.CustomerRepository;
import com.example.repository.CustomerRepositoryImpl;
import com.example.service.CustomerService;

public class DependencyInjectionTest {
    public static void main(String[] args) {
    	
        CustomerRepository customerRepository = new CustomerRepositoryImpl();
        CustomerService customerService = new CustomerService(customerRepository);
        String customer = customerService.getCustomer("1");
        System.out.println(customer);
    }
}
