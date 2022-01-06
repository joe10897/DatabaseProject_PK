package com.project.poseid_server.service.exception;

public class GetOrderErrorException extends Exception{
    public GetOrderErrorException() {
        super("Error occurred during getting orders");
    }
}