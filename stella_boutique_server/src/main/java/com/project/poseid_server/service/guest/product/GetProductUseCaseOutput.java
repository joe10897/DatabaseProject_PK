package com.project.poseid_server.service.guest.product;

import java.util.List;

import com.project.poseid_server.model.item.Item;

public class GetProductUseCaseOutput {
    private List<Item> productList;

    public void setProductList(List<Item> productList) {
        this.productList = productList;
    }

    public List<Item> getProductList() {
        return this.productList;
    }

}