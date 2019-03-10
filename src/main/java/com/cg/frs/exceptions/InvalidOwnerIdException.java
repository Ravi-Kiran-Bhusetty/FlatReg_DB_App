package com.cg.frs.exceptions;

public class InvalidOwnerIdException extends Exception{

	public InvalidOwnerIdException() {
		System.err.println("Owner id entered doesn't exist");
	}
}
