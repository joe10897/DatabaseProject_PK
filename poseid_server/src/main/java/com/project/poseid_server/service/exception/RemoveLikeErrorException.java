package com.project.poseid_server.service.exception;

public class RemoveLikeErrorException extends Exception{
    public RemoveLikeErrorException() {
        super("Error occurred during Removing likes");
    }
}