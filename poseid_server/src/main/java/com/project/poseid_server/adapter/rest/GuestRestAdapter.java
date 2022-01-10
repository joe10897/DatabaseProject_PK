package com.project.poseid_server.adapter.rest; //是否需要adapter?

import com.project.poseid_server.service.guest.rate.GetRateUseCase;
import com.project.poseid_server.service.guest.rate.GetRateUseCaseInput;
import com.project.poseid_server.service.guest.rate.GetRateUseCaseOutput;
import com.project.poseid_server.service.guest.product.GetProductUseCase;
import com.project.poseid_server.service.guest.product.GetProductUseCaseOutput;
import com.project.poseid_server.service.guest.discount.GetDiscountUseCase;
import com.project.poseid_server.service.guest.discount.GetDiscountUseCaseInput;
import com.project.poseid_server.service.guest.discount.GetDiscountUseCaseOutput;
import com.project.poseid_server.service.management.add.*;
import com.project.poseid_server.service.management.login.*;

import com.project.poseid_server.service.exception.GetDiscountErrorException;
import com.project.poseid_server.service.exception.GetProductErrorException;
import com.project.poseid_server.service.exception.GetRateErrorException;
import com.project.poseid_server.service.exception.LoginErrorException;
import com.project.poseid_server.service.exception.AddUserErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.*;

@RestController
@RequestMapping("/api/guest")
public class GuestRestAdapter {
    @Autowired
    GetRateUseCase getRateUseCase;

    @Autowired
    GetProductUseCase getProductUseCase;

    @Autowired
    GetDiscountUseCase getDiscountUseCase;

    @Autowired
    LoginUseCase loginUseCase;

    @Autowired
    AddUserUseCase addUserUseCase;


    @PostMapping(value= "/Login")
    public ResponseEntity<LoginUseCaseOutput> login(@RequestBody LoginUseCaseInput requestBody){
        System.out.println("--------server----------");
        LoginUseCaseInput input = new LoginUseCaseInput();
        LoginUseCaseOutput output = new LoginUseCaseOutput();
        input.setUsername(requestBody.getUsername());
        input.setPassword(requestBody.getPassword());
        try {
            this.loginUseCase.execute(input, output);
        } catch (LoginErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @PostMapping(value= "/Register")
    public String addUser(@RequestBody AddUserUseCaseInput requestBody) {
        // AddUserUseCaseInput input = new AddUserUseCaseInput(requestBody.getPassword(),requestBody.getFullName(),requestBody.getUsername(),requestBody.getBirthday(),requestBody.getAddress(),requestBody.getPhoneNumber(),requestBody.getEmail());
        // AddUserUseCaseOutput output = new AddUsertUseCaseOutput();
        try {
            this.addUserUseCase.execute(requestBody.getUsername(),requestBody.getPassword(),requestBody.getFullName(),requestBody.getBirthday(),requestBody.getAddress(),requestBody.getPhoneNumber(),requestBody.getEmail());
        } catch (AddUserErrorException e) {
            return "get failed";
        }
        return "get successfully";
    }
    

    @GetMapping(value= "/product")
    public ResponseEntity<GetProductUseCaseOutput> getAllProduct() {        
        System.out.println("--------server----------");
        GetProductUseCaseOutput output = new GetProductUseCaseOutput();
        try {
            this.getProductUseCase.execute(output);
        } catch (GetProductErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }


    @GetMapping(value= "/discount")
    public ResponseEntity<GetDiscountUseCaseOutput> getAllDiscount() {
        GetDiscountUseCaseInput input = new GetDiscountUseCaseInput();
        GetDiscountUseCaseOutput output = new GetDiscountUseCaseOutput();
        //------Request body send current date
        input.setCurrentDate("2021/12/07");
        try {
            this.getDiscountUseCase.execute(input, output);
        } catch (GetDiscountErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @GetMapping(value= "/seller/discount")
    public ResponseEntity<GetDiscountUseCaseOutput> getSellerDiscount() {
        GetDiscountUseCaseInput input = new GetDiscountUseCaseInput();
        GetDiscountUseCaseOutput output = new GetDiscountUseCaseOutput();
        //------Request body send current date
        input.setCurrentDate("2022/01/07");
        try {
            this.getDiscountUseCase.sellerExecute(input, output);
        } catch (GetDiscountErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }

    @GetMapping(value= "/rate")
    public ResponseEntity<GetRateUseCaseOutput> getAllRate(@RequestBody GetRateUseCaseInput requestBody){
        GetRateUseCaseInput input = new GetRateUseCaseInput();
        GetRateUseCaseOutput output = new GetRateUseCaseOutput();
        try {
            this.getRateUseCase.execute(input, output);
        } catch (GetRateErrorException e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(output);
        }
        return ResponseEntity.status(HttpStatus.OK).body(output);
    }
}
