package com.project.poseid_server.service.exception;

public class LoginErrorException extends Exception{
    public LoginErrorException() {
        super("Can't login");
    }
}