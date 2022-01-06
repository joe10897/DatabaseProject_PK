package com.project.poseid_server.service.exception;

public class UpdateProductErrorException extends Exception{
    public UpdateProductErrorException() {
        super("Error occurred during updating products");
    }
}