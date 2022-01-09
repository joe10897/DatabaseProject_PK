package com.project.poseid_server.service.seller.discount.remove;

public class RemoveSellerDiscountUseCaseInput {
    private int discountID;
    
    public RemoveSellerDiscountUseCaseInput(){}

	public int getDiscountID() {
		return this.discountID;
	}

	public void setDiscountID(int discountID) {
		this.discountID = discountID;
	}

}