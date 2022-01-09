package com.project.poseid_server.service.exception;

public class GetRateErrorException extends Exception{
    public GetRateErrorException() {
        super("Error occurred during getting rates");
    }
}