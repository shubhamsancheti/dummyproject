package org.demopro.common.model;

public class FailureResponse implements Response {
	private boolean success=false;
	private String errorCode="404";
	private String errorMessage="User not found";
   private User UserData;
public boolean isSuccess() {
	return success;
}
public void setSuccess(boolean success) {
	this.success = success;
}
public String getErrorCode() {
	return errorCode;
}
public void setErrorCode(String errorCode) {
	this.errorCode = errorCode;
}
public String getErrorMessage() {
	return errorMessage;
}
public void setErrorMessage(String errorMessage) {
	this.errorMessage = errorMessage;
}
public User getUserData() {
	return UserData;
}
public void setUserData(User userData) {
	UserData = userData;
}
   
}

