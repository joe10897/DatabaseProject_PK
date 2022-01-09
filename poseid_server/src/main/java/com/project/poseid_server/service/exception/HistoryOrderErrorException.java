package com.project.poseid_server.service.exception;

public class HistoryOrderErrorException extends Exception{
    public HistoryOrderErrorException() {
        super("Error occurred during getting order history");
    }
}