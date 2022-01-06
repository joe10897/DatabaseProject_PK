package com.project.poseid_server.service.exception;

public class GetLikeErrorException extends Exception{
    public GetLikeErrorException() {
        super("Error occurred during Getting likes");
    }
}