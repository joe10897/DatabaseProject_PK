package com.project.poseid_server.service.exception;

public class GetDiscountErrorException extends Exception{
    public GetDiscountErrorException() {
        super("Error occurred during getting discounts");
    }
}