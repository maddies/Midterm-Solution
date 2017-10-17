package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

import com.cisc181.eNums.eTitle;
import com.cisc181.exceptions.PersonException;

public class Student_Test {

	static ArrayList<Course> CourseList = new ArrayList<Course>();
	static ArrayList<Semester> SemesterList = new ArrayList<Semester>();
	static ArrayList<Section> SectionList = new ArrayList<Section>();
	static ArrayList<Student> StudentList = new ArrayList<Student>();

	static ArrayList<Enrollment> Student1 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student2 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student3 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student4 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student5 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student6 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student7 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student8 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student9 = new ArrayList<Enrollment>();
	static ArrayList<Enrollment> Student10 = new ArrayList<Enrollment>();

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
		System.out.println("hi");
		// Course - 3
		Course c1 = new Course(UUID.randomUUID(), "Into Biology", 4, eMajor.NURSING);
		Course c2 = new Course(UUID.randomUUID(), "Electromagnetics", 4, eMajor.PHYSICS);
		Course c3 = new Course(UUID.randomUUID(), "Signals and Systems", 3, eMajor.COMPSI);

		CourseList.add(c1);
		CourseList.add(c2);
		CourseList.add(c3);
		
		// Semester - 2
		Semester s1 = new Semester(UUID.randomUUID(), new Date(2017, 9, 01), new Date(2017, 12, 01));
		Semester s2 = new Semester(UUID.randomUUID(), new Date(2018, 1, 01), new Date(2018, 7, 01));
		SemesterList.add(s1);
		SemesterList.add(s2);

		// Section - 6
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 100));
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 100));
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 322));
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 322));
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 125));
		SectionList.add(new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 125));

		// Student - 10

		Student t1 = new Student("Madeline", "Alden", "Smith", new Date(1996, 9, 01), eMajor.BUSINESS,
				"102 Stony Brook Manor", "302.841.2002", "smithmad@udel.edu");
		Student t2 = new Student("Maggie", "Audrey", "Johnson", new Date(1996, 8, 3), eMajor.CHEM,
				"122 Love Circle Ave", "302.342.2342", "maggie@udel.edu");
		Student t3 = new Student("Nathan", "Mark", "Moyer", new Date(1996, 2, 8), eMajor.NURSING,
				"1 Garnet Valley Lane", "847.234.2342", "nate@udel.edu");
		Student t4 = new Student("Benji", "Luke", "Moyer", new Date(1995, 7, 3), eMajor.CHEM, "33 Black Duck Reach",
				"344.233.2343", "BLM@yahoo.edu");
		Student t5 = new Student("Jake", "Alexander", "Marshall", new Date(1997, 2, 10), eMajor.COMPSI,
				"233 School Lane Drive", "344.699.6700", "amarsh@udel.edu");
		Student t6 = new Student("Abigal", "Dorothy", "Russell", new Date(1996, 8, 5), eMajor.NURSING,
				"56 Glade Circle East", "677.664.2333", "abby@udel.edu");
		Student t7 = new Student("Sean", "Mathew", "Moyer", new Date(1995, 1, 12), eMajor.COMPSI, "123 Garden Trail",
				"377.334.2333", "seanM@udel.edu");
		Student t8 = new Student("Joe", "James", "Fizgerald", new Date(1996, 12, 5), eMajor.PHYSICS,
				"54 Glade Circle West", "332.567.8894", "JoeFitz@udel.edu");
		Student t9 = new Student("Jessica", "Lynn", "Peterson", new Date(1995, 6, 7), eMajor.CHEM,
				"67 Cherry Hill Drive", "707.899.9465", "jessicaP@udel.edu");
		Student t10 = new Student("Talia", "Elizabeth", "Flamini", new Date(1996, 7, 10), eMajor.NURSING,
				"55 New London Bld", "333.445.2342", "flamini23@udel.edu");

		StudentList.add(t1);
		StudentList.add(t2);
		StudentList.add(t3);
		StudentList.add(t4);
		StudentList.add(t5);
		StudentList.add(t6);
		StudentList.add(t7);
		StudentList.add(t8);
		StudentList.add(t9);
		StudentList.add(t10);
		System.out.println("hi");
	}
	
	@Test
	public void test() {
		assertEquals(1,1);
	}

	
	@Test
	public void Test_enrollment1() {
		// enroll student 1
		Enrollment a1 = new Enrollment(SectionList.get(0).getSectionID(), StudentList.get(0).getStudentID(),
				UUID.randomUUID(), 97);
		Enrollment a2 = new Enrollment(SectionList.get(2).getSectionID(), StudentList.get(0).getStudentID(),
				UUID.randomUUID(), 80);
		Enrollment a3 = new Enrollment(SectionList.get(4).getSectionID(), StudentList.get(0).getStudentID(),
				UUID.randomUUID(), 90);
		Student1.add(a1);
		Student1.add(a2);
		Student1.add(a3);

		double Average_grade1 = (Student1.get(0).getGrade() + Student1.get(1).getGrade() + Student1.get(2).getGrade())
				/ 3;
		assertTrue(Average_grade1 == 89);
			}
	@Test
	public void Test_enrollment2() {
		Enrollment b1 = new Enrollment(SectionList.get(1).getSectionID(), StudentList.get(1).getStudentID(),
				UUID.randomUUID(), 70);
		Enrollment b2 = new Enrollment(SectionList.get(3).getSectionID(), StudentList.get(1).getStudentID(),
				UUID.randomUUID(), 66);
		Enrollment b3 = new Enrollment(SectionList.get(5).getSectionID(), StudentList.get(1).getStudentID(),
				UUID.randomUUID(), 83);
		Student2.add(b1);
		Student2.add(b2);
		Student2.add(b3);
		double Average_grade2 = (Student2.get(0).getGrade() + Student2.get(1).getGrade() + Student2
				.get(2).getGrade())
				/ 3;
		assertTrue(Average_grade2 == 73);
	}
	@Test
	public void Test_enrollment3() {
		// enroll student 3
		Enrollment c1 = new Enrollment(SectionList.get(0).getSectionID(), StudentList.get(2).getStudentID(),
				UUID.randomUUID(), 50);
		Enrollment c2 = new Enrollment(SectionList.get(2).getSectionID(), StudentList.get(2).getStudentID(),
				UUID.randomUUID(), 60);
		Enrollment c3 = new Enrollment(SectionList.get(4).getSectionID(), StudentList.get(2).getStudentID(),
				UUID.randomUUID(), 70);
		Student3.add(c1);
		Student3.add(c2);
		Student3.add(c3);
		double Avg_grade3 = (Student3.get(0).getGrade() + Student3.get(1).getGrade() + Student3.get(2).getGrade()) / 3;
		assertTrue(Avg_grade3 == 60);
	}
	@Test
	public void Test_enrollment4() {
		// enroll student 4
		Enrollment d1 = new Enrollment(SectionList.get(1).getSectionID(), StudentList.get(3).getStudentID(),
				UUID.randomUUID(), 90);
		Enrollment d2 = new Enrollment(SectionList.get(3).getSectionID(), StudentList.get(3).getStudentID(),
				UUID.randomUUID(), 90);
		Enrollment d3 = new Enrollment(SectionList.get(5).getSectionID(), StudentList.get(3).getStudentID(),
				UUID.randomUUID(), 90);
		Student4.add(d1);
		Student4.add(d2);
		Student4.add(d3);
		double Avg_grade4 = (Student4.get(0).getGrade() + Student4.get(1).getGrade() + Student4.get(2).getGrade()) / 3;

		assertTrue(Avg_grade4 == 90);
	}
	@Test
	public void Test_enrollment5() {
		// enroll student 5
		Enrollment e1 = new Enrollment(SectionList.get(0).getSectionID(), StudentList.get(4).getStudentID(),
				UUID.randomUUID(), 81);
		Enrollment e2 = new Enrollment(SectionList.get(2).getSectionID(), StudentList.get(4).getStudentID(),
				UUID.randomUUID(), 89);
		Enrollment e3 = new Enrollment(SectionList.get(4).getSectionID(), StudentList.get(4).getStudentID(),
				UUID.randomUUID(), 91);
		Student5.add(e1);
		Student5.add(e2);
		Student5.add(e3);
		double Avg_grade5 = (Student5.get(0).getGrade() + Student5.get(1).getGrade() + Student5.get(2).getGrade()) / 3;

		assertTrue(Avg_grade5 == 87);
	}
	@Test
	public void Test_enrollment6() {
		// enroll student 6
		Enrollment f1 = new Enrollment(SectionList.get(1).getSectionID(), StudentList.get(5).getStudentID(),
				UUID.randomUUID(), 91);
		Enrollment f2 = new Enrollment(SectionList.get(3).getSectionID(), StudentList.get(5).getStudentID(),
				UUID.randomUUID(), 92);
		Enrollment f3 = new Enrollment(SectionList.get(5).getSectionID(), StudentList.get(5).getStudentID(),
				UUID.randomUUID(), 99);
		Student6.add(f1);
		Student6.add(f2);
		Student6.add(f3);
		double Avg_grade6 = (Student6.get(0).getGrade() + Student6.get(1).getGrade() + Student6.get(2).getGrade()) / 3;

		assertTrue(Avg_grade6 == 94);
	}
	
	@Test
	public void Test_enrollment7() {
		// enroll student 7
		Enrollment g1 = new Enrollment(SectionList.get(0).getSectionID(), StudentList.get(6).getStudentID(),
				UUID.randomUUID(), 97);
		Enrollment g2 = new Enrollment(SectionList.get(2).getSectionID(), StudentList.get(6).getStudentID(),
				UUID.randomUUID(), 80);
		Enrollment g3 = new Enrollment(SectionList.get(4).getSectionID(), StudentList.get(6).getStudentID(),
				UUID.randomUUID(), 90);
		Student7.add(g1);
		Student7.add(g2);
		Student7.add(g3);
		double Avg_grade7 = (Student7.get(0).getGrade() + Student7.get(1).getGrade() + Student7.get(2).getGrade()) / 3;

		assertTrue(Avg_grade7 == 89);
	}
	@Test
	public void Test_enrollment8() {
		// enroll student 8
		Enrollment h1 = new Enrollment(SectionList.get(1).getSectionID(), StudentList.get(7).getStudentID(),
				UUID.randomUUID(), 90);
		Enrollment h2 = new Enrollment(SectionList.get(3).getSectionID(), StudentList.get(7).getStudentID(),
				UUID.randomUUID(), 92);
		Enrollment h3 = new Enrollment(SectionList.get(5).getSectionID(), StudentList.get(7).getStudentID(),
				UUID.randomUUID(), 97);
		Student8.add(h1);
		Student8.add(h2);
		Student8.add(h3);
		double Avg_grade8 = (Student8.get(0).getGrade() + Student8.get(1).getGrade() + Student8.get(2).getGrade()) / 3;

		assertTrue(Avg_grade8 == 93);
	}
	
	@Test
	public void Test_enrollment9() {
		// enroll student 9
		Enrollment i1 = new Enrollment(SectionList.get(0).getSectionID(), StudentList.get(8).getStudentID(),
				UUID.randomUUID(), 97);
		Enrollment i2 = new Enrollment(SectionList.get(2).getSectionID(), StudentList.get(8).getStudentID(),
				UUID.randomUUID(), 80);
		Enrollment i3 = new Enrollment(SectionList.get(4).getSectionID(), StudentList.get(8).getStudentID(),
				UUID.randomUUID(), 90);
		Student9.add(i1);
		Student9.add(i2);
		Student9.add(i3);
		double Avg_grade9 = (Student9.get(0).getGrade() + Student9.get(1).getGrade() + Student9.get(2).getGrade()) / 3;

		assertTrue(Avg_grade9 == 89);
	}
	@Test
	public void Test_enrollment10() {
		// enroll student 10
		Enrollment j1 = new Enrollment(SectionList.get(1).getSectionID(), StudentList.get(9).getStudentID(),
				UUID.randomUUID(), 90);
		Enrollment j2 = new Enrollment(SectionList.get(3).getSectionID(), StudentList.get(9).getStudentID(),
				UUID.randomUUID(), 63);
		Enrollment j3 = new Enrollment(SectionList.get(5).getSectionID(), StudentList.get(9).getStudentID(),
				UUID.randomUUID(), 99);
		Student10.add(j1);
		Student10.add(j2);
		Student10.add(j3);
		double Avg_grade10 = (Student10.get(0).getGrade() + Student10.get(1).getGrade() + Student10.get(2).getGrade())
				/ 3;

		assertTrue(Avg_grade10 == 84);
	}

}
