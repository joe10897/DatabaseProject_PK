package com.project.poseid_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.project.poseid_server.service.SellerService;

import java.util.ArrayList;
import java.util.List;
import java.io.*;

import com.project.poseid_server.model.discount.Discount;
import com.project.poseid_server.model.item.*;
import com.project.poseid_server.model.order.Order;
import com.project.poseid_server.model.user.User; 

@SpringBootApplication
public class PoseidServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(PoseidServerApplication.class, args);
		SellerService sellerService = new SellerService();
	}

}
