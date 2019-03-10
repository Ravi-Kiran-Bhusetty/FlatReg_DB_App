package com.cg.frs.exceptions;

public class InvalidFlatAreaException extends Exception{

	public InvalidFlatAreaException() {
		System.err.println("Flat Area cannot be zero");
	}
}
