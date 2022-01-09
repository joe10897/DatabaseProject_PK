package com.project.poseid_server.service.exception;

public class AddIntoOrderErrorException extends Exception{
    public AddIntoOrderErrorException() {
        super("Error occurred during adding item into order");
    }
}