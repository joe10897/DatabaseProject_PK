package com.project.poseid_server.service.exception;

public class RemoveFromOrderErrorException extends Exception{
    public RemoveFromOrderErrorException() {
        super("Error occurred during removing item from order");
    }
}