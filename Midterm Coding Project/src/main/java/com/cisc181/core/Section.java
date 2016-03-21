package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SectionID;
	private UUID SemesterID;
	private int RoomID;
	
	
	public UUID getCourseID() {
		return CourseID;
	}
	
	public UUID getSectionID() {
		return SectionID;
	}

	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		this.RoomID = roomID;
	}
	
	public UUID getSemesterID() {
		return SemesterID;
	}

	
	public Section(){
		this.SectionID = UUID.randomUUID();
	}
	
	public Section(UUID SemesterID, UUID CourseID,int RoomID){
		this();
		this.CourseID = CourseID;
		this.SemesterID = SemesterID;
		this.RoomID = RoomID;
		
	}
	

}
