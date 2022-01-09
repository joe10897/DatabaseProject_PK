package com.project.poseid_server.service.exception;

public class AddProductErrorException extends Exception{
    public AddProductErrorException() {
        super("Error occurred during adding product");
    }
}