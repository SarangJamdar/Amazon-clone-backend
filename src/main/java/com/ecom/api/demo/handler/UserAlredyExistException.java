package com.ecom.api.demo.handler;

public class UserAlredyExistException extends RuntimeException{
	public UserAlredyExistException(String msg) {
		super(msg);
	}
	
}
