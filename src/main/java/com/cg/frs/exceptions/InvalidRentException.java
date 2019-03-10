package com.cg.frs.exceptions;

public class InvalidRentException extends Exception{

	public InvalidRentException() {
		System.err.println("Rent cannot be less than zero");
	}
}