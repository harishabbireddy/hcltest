package com.hcl.library.grandabclibrary.exception;

public class InvalidServiceInputs extends Exception {
	
	private static final long serialVersionUID = 1L;
	int errorCode ;
	String errorDescription ;
	public InvalidServiceInputs(int errorCode, String errorDescription) {
		super();
		this.errorCode = errorCode;
		this.errorDescription = errorDescription;
	}
	public int getErrorCode() {
		return errorCode;
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
