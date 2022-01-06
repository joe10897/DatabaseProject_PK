package com.project.poseid_server.service.exception;

public class AddLikeErrorException extends Exception{
    public AddLikeErrorException() {
        super("Error occurred during adding likes");
    }
}