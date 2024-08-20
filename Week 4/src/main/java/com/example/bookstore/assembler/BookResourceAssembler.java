package com.example.bookstoreapi.assembler;

import com.example.bookstoreapi.controller.BookController;
import com.example.bookstoreapi.model.Book;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.RepresentationModelAssemblerSupport;
import org.springframework.stereotype.Component;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

@Component
public class BookResourceAssembler extends RepresentationModelAssemblerSupport<Book, EntityModel<Book>> {

    public BookResourceAssembler() {
        super(BookController.class, EntityModel.class);
    }

    @Override
    public EntityModel<Book> toModel(Book book) {
        return EntityModel.of(book,
            linkTo(methodOn(BookController.class).getBookById(book.getId())).withSelfRel(),
            linkTo(methodOn(BookController.class).getAllBooks()).withRel("books"));
    }
}

