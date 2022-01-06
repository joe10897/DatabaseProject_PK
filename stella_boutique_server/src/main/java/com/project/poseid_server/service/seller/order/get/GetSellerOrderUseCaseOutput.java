package com.project.poseid_server.service.seller.order.get;

import java.util.List;

import com.project.poseid_server.model.order.Order;

public class GetSellerOrderUseCaseOutput {
    private List<Order> orderList;

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public List<Order> getOrderList() {
        return this.orderList;
    }
}