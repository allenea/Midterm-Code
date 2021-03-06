package com.cisc181.core;

import java.util.UUID;
import com.cisc181.eNums.eMajor;


public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor eMajor;
	
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	public void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	public String getCourseName() {
		return CourseName;
	}
	public void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	public int getGradePoints() {
		return GradePoints;
	}
	public void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}
	
	public eMajor geteMajor() {
		return eMajor;
	}
	public void seteMajor(eMajor eMajor) {
		this.eMajor = eMajor;
	}	

	public Course(){
		this.CourseID = UUID.randomUUID();
	}
	
	public Course(String CourseName, int GradePoints){
		this();
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
	
	}

	
	
}
