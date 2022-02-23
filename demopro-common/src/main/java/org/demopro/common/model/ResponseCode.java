package org.demopro.common.model;

public enum ResponseCode {
		  USER_FOUND("200", "User found"), USER_NOT_FOUND("404", "User not found");

		  String code;
		  String message;

		  ResponseCode(String code, String message){
		   this.code = code;
		   this.message = message;
		  }

		public String getCode() {
			return code;
		}

		public String getMessage() {
			return message;
		}	  

		}