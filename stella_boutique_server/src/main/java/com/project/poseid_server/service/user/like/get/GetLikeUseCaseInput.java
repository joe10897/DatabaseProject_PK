package com.project.poseid_server.service.user.like.get;

public class GetLikeUseCaseInput {
    private int userID;

    public GetLikeUseCaseInput(){
        
    }
    
	public int getUserID() {
		return this.userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}

}