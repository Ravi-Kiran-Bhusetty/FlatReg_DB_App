package com.cg.fra.exceptions;

public class InvalidDepositException extends Exception{

	public InvalidDepositException()
	{
		System.err.println("Deposit amount should be greater than rent amount");
	}
}
