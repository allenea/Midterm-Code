package com.cisc181.core;

import java.util.Date;
///import com.cisc181.core.*;

public class PersonException extends Exception {

	private Date DOB;
	private String phone_number;

	public PersonException(Date DOB) {
		this.DOB = DOB;
		System.out.println("Your age is TOO OLD. Please be younger and try again."  + DOB);

	}

	public PersonException(String phone_number) {
		this.phone_number = phone_number;
		System.out.println("Your phone number is invalid check to make sure it is"
				+ " correct and enter in the following format: (###)-###-####:    "   + phone_number);
	}
}

