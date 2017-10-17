package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Staff_Test {
	static ArrayList<Staff> StaffList = new ArrayList<Staff>();
	
			
	@BeforeClass
	public static void setup() {

	Staff staff1 = new Staff("Aimee", "Jean", "Stank", 
			new Date(1960, 11, 6), "123 Stony Brook", "(212)-234-7646", "stank@udel.edu",
			"3-4pm", 2, 400000.00, new Date(1990, 9, 9), eTitle.MS);
	
	Staff staff2 = new Staff("Jordan", "Lee", "Schrader",
			new Date(1970, 10, 12), "234 Mallard Creek", "(212)-234-7646", "schrader@yahoo.com",
			"1-2pm", 4, 100000.00, new Date(2015, 11, 2), eTitle.MRS); 
	
	Staff staff3 = new Staff("Chris", "David", "Argo",
			new Date(1977, 1, 10), "12 Hopkins Farm Road", "(212)-234-7646", "chargo@gmail.com",
			"6-7pm", 1, 200000.00, new Date(2000, 8, 12), eTitle.MR); 
	
	Staff staff4 = new Staff("Alyssa", "Mae", "Phalen",
			new Date(1980, 2, 3), "97 Green Haven Court","(212)-234-7646", "phalen@udel.edu",
			"3:30-5:40 pm", 7, 350000.00, new Date(1988, 8, 05),
			eTitle.MS); 
	
	Staff staff5 = new Staff("Kenneth", "Robert", "McArthur",
			new Date(1979, 9, 10), "123 Glen Mill Road", "(212)-234-7646", "kcmc@udel.edu",
			"10-11am", 3, 600000.00, new Date(1960, 5, 4), eTitle.MR); 
	
	StaffList.add(staff1);
	StaffList.add(staff2);
	StaffList.add(staff3);
	StaffList.add(staff4);
	StaffList.add(staff5);
	
	}
	
	@Test
	public void SalaryTest() {
		double AverageStaffSalary = 0;
		for (int i = 0; i < StaffList.size(); i++) {
			 double s = StaffList.get(i).getSalary();
			 AverageStaffSalary += s;

		}
		AverageStaffSalary = AverageStaffSalary/5;
		assertTrue(AverageStaffSalary == 330000.00);
		assertFalse(AverageStaffSalary == 1000000.00);

	}	

	@Test (expected = PersonException.class)
	public void PhoneNumberTest() throws PersonException{
		System.out.println("hi");
		Staff staff_phone_error = new Staff("Molly", "Allison", "McGee",
			new Date(1900, 8, 11), "66 Sunflower Drive", "213488777777", "Msmith@udel.edu",
			"12-3pm", 3, 100000.00, new Date(2000, 7, 8), eTitle.MRS); 
	
	} 
	
	@Test(expected = PersonException.class)
	public void HundredTest() throws PersonException {
		Staff staff_DOB_error = new Staff("Madeline", "Alden", "Smith", 
				new Date(1800,7,7), "234 Ferry Drive", "(233)-636-8888",
				"maddie@udel.edu", "6-7pm", 5, 343444, new Date(2000,1,1), eTitle.MR);
}
	
	
}
