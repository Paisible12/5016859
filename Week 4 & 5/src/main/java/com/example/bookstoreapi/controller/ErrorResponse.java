package com.example.bookstoreapi.controller;

public class ErrorResponse {

    @SuppressWarnings("unused")
	private String error;
    @SuppressWarnings("unused")
	private String message;

    public ErrorResponse(String error, String message) {
        this.error = error;
        this.message = message;
    }

}
