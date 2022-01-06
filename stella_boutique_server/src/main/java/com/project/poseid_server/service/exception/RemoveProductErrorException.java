package com.project.poseid_server.service.exception;

public class RemoveProductErrorException extends Exception{
    public RemoveProductErrorException() {
        super("Error occurred during removing products");
    }
}