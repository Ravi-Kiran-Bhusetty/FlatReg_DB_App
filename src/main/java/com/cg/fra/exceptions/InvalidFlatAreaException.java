package com.cg.fra.exceptions;

public class InvalidFlatAreaException extends Exception{

	public InvalidFlatAreaException() {
		System.err.println("Flat Area cannot be zero");
	}
}
