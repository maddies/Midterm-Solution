package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {
	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	
	public Semester(UUID semesterID, Date date, Date date2) {
		super();
		SemesterID = semesterID;
		StartDate = date;
		EndDate = date2;
	}

	// semesterID
	protected void setSemesterID(UUID semesterID) {
		this.SemesterID = semesterID;
	}
	
	protected UUID getSemesterID() {
		return this.SemesterID;
	}
	
	// Start Date
	protected void setStartDate(Date startDate) {
		this.StartDate = startDate;
	}
	protected Date getStartDate() {
		return this.StartDate;
	}
	
	protected void setEndDate(Date endDate) {
		this.EndDate = endDate;
	}
	protected Date getEndDate() {
		return this.EndDate;
	}
	
	
	
}
