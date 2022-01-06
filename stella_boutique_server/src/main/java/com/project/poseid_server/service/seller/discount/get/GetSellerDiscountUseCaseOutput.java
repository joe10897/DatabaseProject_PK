package com.project.poseid_server.service.seller.discount.get;

import java.util.List;

import com.project.poseid_server.model.discount.Discount;

public class GetSellerDiscountUseCaseOutput {
    private List<Discount> discountList;

    public void setDiscountList(List<Discount> discountList){
        this.discountList = discountList;
    }

    public List<Discount> getDiscountList() {
        return this.discountList;
    }
}