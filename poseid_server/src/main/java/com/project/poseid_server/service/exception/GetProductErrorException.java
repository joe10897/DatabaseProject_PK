package com.project.poseid_server.service.exception;

public class GetProductErrorException extends Exception{
    public GetProductErrorException() {
        super("Error occurred during getting products");
    }
}