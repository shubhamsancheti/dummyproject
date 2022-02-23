package org.demopro.common.model;


public class Successv2 implements Response {
	private boolean success;
	private String Code;
	private String Message;
   private ResponseUserData UserData;

public boolean isSuccess() {
	return success;
}


public void setSuccess(boolean success) {
	this.success = success;
}


public String getCode() {
	return Code;
}


public void setCode(String code) {
	Code = code;
}


public String getMessage() {
	return Message;
}


public void setMessage(String message) {
	Message = message;
}





public ResponseUserData getUserData() {
	return UserData;
}

public void setUserData(ResponseUserData userData) {
	UserData = userData;
}


@Override
public String toString() {
	return "Successv2 [success=" + success + ", Code=" + Code + ", Message=" + Message + ", UserData=" + UserData + "]";
}
   
}
