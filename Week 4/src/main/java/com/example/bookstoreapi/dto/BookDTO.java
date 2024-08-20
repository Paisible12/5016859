package com.example.bookstoreapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class BookDTO {

    private Long id;

    @JsonProperty("book_title")
    private String title;

    @JsonProperty("book_author")
    private String author;

    private Double price;
    private String isbn;
    public BookDTO() {}

    public BookDTO(Long id, String title, String author, Double price, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }

}
