package com.springboot.foodieapp.exception;

public class ItemAlreadyExistException extends RuntimeException 
{
	public ItemAlreadyExistException(String message)
	{
		super(message);
	}
}