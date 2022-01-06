package com.project.poseid_server.service.exception;

public class AddDiscountErrorException extends Exception{
    public AddDiscountErrorException() {
        super("Error occurred during adding discounts");
    }
}