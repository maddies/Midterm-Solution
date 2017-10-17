package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	private UUID SectionID;
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){		
	}
	
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
	}


	public Enrollment(UUID sectionID, UUID studentID, UUID enrollmentID, double grade) {
		super();
		SectionID = sectionID;
		StudentID = studentID;
		EnrollmentID = enrollmentID;
		Grade = grade;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		this.EnrollmentID = enrollmentID;
	}
	
	public void setGrade(double grade) {
		this.Grade = grade;
	}
	public double getGrade() {
		return this.Grade;
	}
	public double GradePoint() {
		int g = (int) this.Grade; 
		double G;
		switch (g) {
		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93:
			G = 4.0;
			break;
		case 92: case 91: case 90: case 89:
			G = 3.7;
			break;
		case 88: case 87: case 86: case 85:
			G = 3.33;
			break;
		case 84: case 83: case 82: case 81:
			G = 3.00;
			break;
		case 80: case 79: case 78: case 77:
			G = 2.7;
			break;
		case 76: case 75: case 74: case 73:
			G = 2.3;
			break;
		case 72: case 71: case 70: case 69:
			G = 2.00;
			break;
		case 68: case 67: case 66: case 65:
			G = 1.7;
			break;
		case 64: case 63: case 62: case 61: case 60:
			G = 1.3;
			break;
		default:
			G =1 ;
		}
			return G;
		
	}
	

	
}
