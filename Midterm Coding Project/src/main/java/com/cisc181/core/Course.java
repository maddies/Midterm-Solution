package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course {
	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	private eMajor Major;
	
	
	public Course(UUID courseID, String courseName, int gradePoints, eMajor major) {
		super();
		CourseID = courseID;
		CourseName = courseName;
		GradePoints = gradePoints;
		Major = major;
	}

	// CourseID
	protected void setCourseID(UUID courseID) {
		this.CourseID = courseID;
	}
	protected UUID getCourseID() {
		return this.CourseID;
	}
	
	// CourseName
	protected void setCourseName(String courseName) {
		this.CourseName = courseName;
	}
	protected String getCourseName() {
		return this.CourseName;
	}
	// GradePoints
	protected void setGradePoints(int gradePoints) {
		this.GradePoints = gradePoints;
	}

	protected int getGradePoints() {
		return this.GradePoints;
	}

	
}