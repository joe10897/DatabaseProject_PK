package com.project.poseid_server.service.exception;

public class UpdateOrderErrorException extends Exception{
    public UpdateOrderErrorException() {
        super("Error occurred during updating orders");
    }
}