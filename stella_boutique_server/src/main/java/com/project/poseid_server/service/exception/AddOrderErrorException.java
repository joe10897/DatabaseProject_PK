package com.project.poseid_server.service.exception;

public class AddOrderErrorException extends Exception{
    public AddOrderErrorException() {
        super("Error occurred during adding order");
    }
}