package com.project.poseid_server.service.exception;

public class UpdateDiscountErrorException extends Exception{
    public UpdateDiscountErrorException() {
        super("Error occurred during updating discounts");
    }
}