package com.example.bookstore.repository;

import com.example.bookstore.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	com.example.bookstoreapi.model.Customer save(com.example.bookstoreapi.model.Customer customer);
}

