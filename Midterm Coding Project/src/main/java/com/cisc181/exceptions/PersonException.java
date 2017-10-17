package com.cisc181.exceptions;

import java.util.Date;

import com.cisc181.core.Person;

public class PersonException extends Exception {
	
	private Person p;
	private Date d;
	private String phone_number;
	
	public PersonException() {}
	
	
	public PersonException(Person p) {
		this.p = p;
	}
	
	public PersonException(Date d) {
		this.d = d;
	}
	
	public PersonException(String phone_number) {
		this.phone_number = phone_number;
	}
}
