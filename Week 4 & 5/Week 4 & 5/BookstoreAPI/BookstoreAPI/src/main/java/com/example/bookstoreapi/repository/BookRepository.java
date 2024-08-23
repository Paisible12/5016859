package com.example.bookstore.repository;

import com.example.bookstore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByTitleContainingIgnoreCase(String title);
    
    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByTitleContainingIgnoreCaseAndAuthorContainingIgnoreCase(String title, String author);

	Optional<com.example.bookstoreapi.model.Book> findById(Long id);

	void delete(Long id);

	List<com.example.bookstoreapi.model.Book> findAll();

	Object save(com.example.bookstoreapi.model.Book existingBook);

	boolean existsById(Long id);
}
