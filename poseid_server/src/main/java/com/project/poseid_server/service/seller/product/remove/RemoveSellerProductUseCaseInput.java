package com.project.poseid_server.service.seller.product.remove;

public class RemoveSellerProductUseCaseInput {
    private int itemID;

    public RemoveSellerProductUseCaseInput(){
        
    }
	public int getItemID() {
		return this.itemID;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

}