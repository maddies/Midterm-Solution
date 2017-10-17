package com.cisc181.core;

import java.util.UUID;

public class Section {
	private UUID CourseID;
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}
	// Course ID
	protected void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	protected UUID getCourseID() {
		return this.CourseID;
	}
	
	// Semester ID
	protected void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	protected UUID getSemesterID() {
		return this.SemesterID;
	}
	
	// Section ID
	protected void setSectionID(UUID sectionID) {
		this.SectionID = sectionID;
	}
	protected UUID getSectionID() {
		return this.SectionID;
	}
	
	// Room ID
	protected void setRoomID(int roomID) {
		this.RoomID = roomID;
	}
	protected int getRoomID() {
		return this.RoomID;
	}
	
	
	
}
