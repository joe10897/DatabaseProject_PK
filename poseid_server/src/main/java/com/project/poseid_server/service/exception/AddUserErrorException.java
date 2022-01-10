package com.project.poseid_server.service.exception;

public class AddUserErrorException extends Exception{
    public AddUserErrorException() {
        super("Error occurred during register");
    }
}