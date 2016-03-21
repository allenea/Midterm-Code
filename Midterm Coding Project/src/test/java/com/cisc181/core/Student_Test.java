package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
	private static ArrayList<Student> student = new ArrayList<Student>();
	private static ArrayList<Semester> semester = new ArrayList<Semester>();
	private static ArrayList<Course> course = new ArrayList<Course>();
	private static ArrayList<Section> section = new ArrayList<Section>();


	@BeforeClass
	public static void setup() throws PersonException {
		
		Calendar StartDate1 = Calendar.getInstance();
		Calendar StartDate2 = Calendar.getInstance();
		Calendar EndDate1 = Calendar.getInstance();
		Calendar EndDate2 = Calendar.getInstance();
		StartDate1.set(2015, 8, 30);
		StartDate2.set(1995, 2, 07);
		EndDate1.set(2015, 12, 18);
		EndDate2.set(1995, 5, 289);

		Semester fall15 = new Semester(StartDate1.getTime(), EndDate1.getTime());
		Semester spring16 = new Semester(StartDate2.getTime(), EndDate2.getTime());
		semester.add(fall15);
		semester.add(spring16);
		
		/**	Course(String CourseName, int GradePoints) */
		Course MATH302 = new Course("Ordinary Differential Equations", 3);
		Course GEOG420 = new Course("Physical Meteorology", 3);
		Course PHYS208 = new Course("Physics II", 4);
		course.add(MATH302);
		course.add(PHYS208);
		course.add(GEOG420);
		
		/**	 Section(UUID SemesterID, UUID CourseID,int RoomID) */
		int[] Room = new int[] {208, 101, 413, 212, 218, 59};
		Section F010 = new Section(fall15.getSemesterID(),MATH302.getCourseID(), Room[0]);
		Section S011 = new Section(spring16.getSemesterID(), MATH302.getCourseID(), Room[1]);
		Section F020 = new Section(fall15.getSemesterID(), PHYS208.getCourseID(), Room[2]);
		Section S021 = new Section(spring16.getSemesterID(), PHYS208.getCourseID(), Room[3]);
		Section F030 = new Section(fall15.getSemesterID(), GEOG420.getCourseID(), Room[4]);
		Section S031 = new Section(spring16.getSemesterID(),GEOG420.getCourseID(), Room[5]);
		section.add(F010);
		section.add(S011);
		section.add(F020);
		section.add(S021);
		section.add(F030);
		section.add(S031);
		
		Calendar birthDate1 = Calendar.getInstance();
		birthDate1.set(1996, 9, 10);
		
		Calendar birthDate2 = Calendar.getInstance();
		birthDate2.set(1998, 11, 17);

		Calendar birthDate3 = Calendar.getInstance();
		birthDate3.set(1989, 12, 01);

		Calendar birthDate4 = Calendar.getInstance();
		birthDate4.set(1994, 04, 13);

		Calendar birthDate5 = Calendar.getInstance();
		birthDate5.set(1998, 12, 30);
		
		Calendar birthDate6 = Calendar.getInstance();
		birthDate6.set(1998, 9, 10);
		
		Calendar birthDate7 = Calendar.getInstance();
		birthDate7.set(1968, 11, 17);

		Calendar birthDate8 = Calendar.getInstance();
		birthDate8.set(1987, 12, 11);

		Calendar birthDate9 = Calendar.getInstance();
		birthDate9.set(1995, 04, 25);

		Calendar birthDate10 = Calendar.getInstance();
		birthDate10.set(2000, 02, 30);




		/**	Student(String FirstName, String MiddleName, String LastName,Date DOB, eMajor Major,
			String Address, String Phone_number, String Email) throws PersonException */
		
		Student st1 = new Student("Jane" , "Passion-Fruit.", "Doe", birthDate1.getTime(),eMajor.BUSINESS, "123 Downtown UD Drive", "(302) 1235121", "teacher1@udel.edu");
		Student st2 = new Student("Jake" , "Mero-Beach.", "Ray", birthDate2.getTime(),eMajor.CHEM, "123 Downtown UD Court", "302123-5122", "teacher2@udel.edu");
		Student st3 = new Student("Eric" , "Scotts-Head.", "Me", birthDate3.getTime(), eMajor.PHYSICS, "123 Downtown UD Lane", "(302)1235123", "teacher3@udel.edu");
		Student st4 = new Student("Grace" , "Mountain-Chicken.", "Fao", birthDate4.getTime(),eMajor.BUSINESS, "123 Downtown UD Circle", "(302) 1235124", "teacher4@udel.edu");
		Student st5 = new Student("Marcos" , "Traifalger.", "So", birthDate5.getTime(),eMajor.PHYSICS, "123 Downtown UD Road", "3021235125", "teacher5@udel.edu");
		Student st6 = new Student("Columbo" , "Emerald-View.", "La", birthDate1.getTime(),eMajor.CHEM, "123 Downtown UD Drive", "(302) 123 5126", "teacher1@udel.edu");
		Student st7 = new Student("Mara" , "Morne-Diablotin.", "Ti", birthDate2.getTime(),eMajor.BUSINESS, "123 Downtown UD Court", "302 123 5127", "teacher2@udel.edu");
		Student st8 = new Student("Amanda" , "Boiling-Lake.", "Do", birthDate3.getTime(),eMajor.PHYSICS, "123 Downtown UD Lane", "(302)1235128", "teacher3@udel.edu");
		Student st9 = new Student("Nick" , "Secret-Beach.", "Rosseau", birthDate4.getTime(), eMajor.CHEM, "123 Downtown UD Circle", "(302) 1235129", "teacher4@udel.edu");
		Student st10 = new Student("JR" , "Bar.", "Dominica", birthDate5.getTime(),eMajor.BUSINESS, "123 Downtown UD Road", "3021235130", "teacher5@udel.edu");

		
		student.add(st1);
		student.add(st2);
		student.add(st3);
		student.add(st4);
		student.add(st5);
		student.add(st6);
		student.add(st7);
		student.add(st8);
		student.add(st9);
		student.add(st10);
		

	}
	
	/** Determine each student’s GPA, test it with an assertEquals.
	 * 	public Enrollment(UUID StudentID, UUID SectionID){
	 */
	@Test
	public void testGrades() throws PersonException {		
		
		double[][] gradesPerson = new double[][]{
			// 3 credits for first 4 .... 4 credits for last 2
				{4.0, 4.0, 4.0, 4.0, 4.0, 4.0}, //Jane
				{3.0, 3.0, 3.0, 3.0, 3.0, 3.0}, //Jake
				{2.0, 2.0, 2.0, 2.0, 2.0, 2.0}, //Eric
				{4.0, 2.7, 3.0, 3.3, 2.3, 4.0}, //Grace
				{2.7, 3.0, 3.3, 3.3, 2.3, 3.7}, //Marcos
				{3.0, 0.0, 1.0, 1.7, 1.3, 3.0}, //Columbo
				{2.0, 1.7, 1.3, 2.0, 3.3, 3.0}, //Mara
				{3.0, 3.3, 3.7, 4.0, 3.0, 3.0}, //Amanda
				{2.7, 3.0, 2.3, 3.0, 4.0, 3.7}, //Nick
				{2.0, 2.7, 3.0, 4.0, 3.7, 3.3}}; //JR


		
		ArrayList<Double> gpa = new ArrayList<Double>();
		ArrayList<Double> CourseAvg = new ArrayList<Double>();
		CourseAvg.add(0.0);
		CourseAvg.add(0.0);
		CourseAvg.add(0.0);
		
		//Problems with for loops getting grades out of loop
		int count = 0;
		double Credits = 0;
		double TotalGradePoints = 0;
		for (Student st: student){
			//int countSem = 0;
			for (Section section: section){
				int countCourses = 0;
				for (Course cs: course){	
					/** Enrollment(UUID StudentID, UUID SectionID) */
					//count should equal classes in semester
	
					Enrollment enroll = new Enrollment(st.getStudentID(), section.getSectionID());
					enroll.setGrade(gradesPerson[count][countCourses]);
					TotalGradePoints += enroll.getGrade()*cs.getGradePoints();
					Credits += cs.getGradePoints();
					
					
					count ++;
					countCourses ++;
					//countSem ++;
				
				}
			}
			gpa.add(TotalGradePoints / Credits);
			//CourseAvg.set(countCourses, enroll.getGrade());
		}
		
		//TESTS GPA Per Student
		assertTrue(Math.abs(gpa.get(0) - 4.00) < 0.01); //Straight As
		assertTrue(Math.abs(gpa.get(1) - 3.00) < 0.01); //Straight Bs
		assertTrue(Math.abs(gpa.get(2) - 2.00) < 0.01); //Straight Cs
		assertTrue(Math.abs(gpa.get(3) - 3.21) < 0.01);
		assertTrue(Math.abs(gpa.get(4) - 3.04) < 0.01);
		assertTrue(Math.abs(gpa.get(5) - 1.72) < 0.01);
		assertTrue(Math.abs(gpa.get(6) - 2.31) < 0.01);
		assertTrue(Math.abs(gpa.get(7) - 3.30) < 0.01);
		assertTrue(Math.abs(gpa.get(8) - 3.19) < 0.01);
		assertTrue(Math.abs(gpa.get(9) - 3.16) < 0.01);

		//TESTS Course Average
		//total GPA for class / # of people total - my calculated GPA
		//Course should Include 10 people from both semesters
		assertTrue(Math.abs(CourseAvg.get(0)/20 - 2.69) < 0.01);
		assertTrue(Math.abs(CourseAvg.get(1)/20 - 2.84) < 0.01);
		assertTrue(Math.abs(CourseAvg.get(2)/20 - 2.78) < 0.01);

		
		}
	
	

	@Test
	public void testEmajor(){
		Student st1 = student.get(1);
		Student st3 = student.get(3);
		Student st5 = student.get(5);
		Student st7 = student.get(7);
		Student st9 = student.get(9);

		st1.seteMajor(eMajor.NURSING);
		st3.seteMajor(eMajor.CHEM);
		st5.seteMajor(eMajor.NURSING);
		st7.seteMajor(eMajor.CHEM);
		
		assertEquals(st1.geteMajor(),eMajor.NURSING);
		assertEquals(st3.geteMajor(),eMajor.CHEM);
		assertEquals(st5.geteMajor(),eMajor.NURSING);
		assertEquals(st7.geteMajor(),eMajor.CHEM);
		assertEquals(st9.geteMajor(),eMajor.BUSINESS);

	}
	
}
