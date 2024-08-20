package com.example.bookstoreapi.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import lombok.Data;

@Entity
@Data
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Title is required")
    @Size(min = 1, max = 100, message = "Title must be between 1 and 100 characters")
    private String title;

    @NotNull(message = "Author is required")
    @Size(min = 1, max = 100, message = "Author must be between 1 and 100 characters")
    private String author;

    @NotNull(message = "Price is required")
    @Min(value = 0, message = "Price must be positive")
    private Double price;

    @NotNull(message = "ISBN is required")
    @Size(min = 10, max = 13, message = "ISBN must be between 10 and 13 characters")
    private String isbn;

@Version
private Long version;
}
	public Object getTitle() {
		
		return null;
	}
	public Object getAuthor() {
		
		return null;
	}
	public Object getPrice() {
		
		return null;
	}
	public Object getIsbn() {
	
		return null;
	}
	public void setTitle(Object title2) {
		
		
	}
	public void setAuthor(Object author2) {
		
	}
	public void setPrice(Object price2) {
		
	}
	public void setIsbn(Object isbn2) {
		
	}
}
