package com.cg.fra.exceptions;

public class InvalidFlatTypeException extends Exception{

	public InvalidFlatTypeException()
	{
		System.err.println("Flat type must be choosen from the flat type menu above");
	}
}
