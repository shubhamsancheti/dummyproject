package org.demopro.common.model;

public class SuccessResponse implements Response {
	private boolean success;
	private String errorCode;
	private String errorMessage;
   private User UserData;

public User getUserdata() {
	return UserData;
}

public void setUserdata(User userdata) {
	this.UserData = userdata;
}

@Override
public String toString() {
	return "SuccessResponse [success=" + success + ", errorCode=" + errorCode + ", errorMessage=" + errorMessage
			+ ", UserData=" + UserData + "]";
}

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
   
}
