package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;  
	
	
	public UUID getSectionID() {
		return SectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public double getGrade() {
		return Grade;
	}
	
	public void setGrade(double grade) {
		Grade = grade;
	}

	private Enrollment() {
		this.EnrollmentID = UUID.randomUUID();
	}

	/*
	 * Constructors Constructor with arguments
	 */
	

	public Enrollment(UUID StudentID, UUID SectionID){
		this();
		this.StudentID = StudentID;
		this.SectionID = SectionID;
	}
}
