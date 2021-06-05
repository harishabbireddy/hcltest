package com.hcl.library.grandabclibrary.exception;

public class UserNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;
	int errorCode ;
	String errorDescription ;
	
	
	public UserNotFoundException(int code, String errorDescription) {
		super();
		this.errorCode = code;
		this.errorDescription = errorDescription;
	}
	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorDescription() {
		return errorDescription;
	}
	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
	
	
	

}
