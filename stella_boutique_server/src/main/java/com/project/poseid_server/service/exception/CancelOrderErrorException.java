package com.project.poseid_server.service.exception;

public class CancelOrderErrorException extends Exception{
    public CancelOrderErrorException() {
        super("Error occurred during cancelling order");
    }
}