package com.project.poseid_server.service.management.login;

public class LoginUseCaseOutput {
    private int userID;
  
    public void LoginUseCaseOutput() {

    }
    
	public int getUserID() {
        return this.userID;
	}
	
    public void setUserID(int id) {
        this.userID = id;
    }

}
