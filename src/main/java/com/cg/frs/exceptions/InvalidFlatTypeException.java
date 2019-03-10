package com.cg.frs.exceptions;

public class InvalidFlatTypeException extends Exception{

	public InvalidFlatTypeException()
	{
		System.err.println("Flat type must be choosen from the flat type menu above");
	}
}
