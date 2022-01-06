package com.project.poseid_server.service.exception;

public class RemoveDiscountErrorException extends Exception{
    public RemoveDiscountErrorException() {
        super("Error occurred during removing discounts");
    }
}