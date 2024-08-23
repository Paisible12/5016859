package com.example.bookstoreapi.controller;

import com.example.bookstoreapi.model.Customer;
import com.example.bookstoreapi.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;
    @PostMapping
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customer) {
        Customer createdCustomer = customerRepository.save(customer);
        return ResponseEntity.ok(createdCustomer);
    }

    @PostMapping("/register")
    public ResponseEntity<String> registerCustomer(@RequestParam String name,
                                                   @RequestParam String email,
                                                   @RequestParam String address) {
        Customer customer = new Customer(name, email, address);
        customerRepository.save(customer);
        return ResponseEntity.ok("Customer registered successfully!");
    }
}

