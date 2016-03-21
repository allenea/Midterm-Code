package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;


public class Staff_Test {
	private static ArrayList<Staff> staff = new ArrayList<Staff>();

	

	@BeforeClass
	public static void setup() throws PersonException{
		
		Calendar hiredOn11 = Calendar.getInstance();
		hiredOn11.set(2005, 02, 12);
		
		Calendar hiredOn22 = Calendar.getInstance();
		hiredOn22.set(2009, 02, 10);

		Calendar birthDate1 = Calendar.getInstance();
		birthDate1.set(1978, 9, 10);
		
		Calendar birthDate2 = Calendar.getInstance();
		birthDate2.set(1958, 11, 17);

		Calendar birthDate3 = Calendar.getInstance();
		birthDate3.set(1982, 12, 01);

		Calendar birthDate4 = Calendar.getInstance();
		birthDate4.set(1974, 04, 03);

		Calendar birthDate5 = Calendar.getInstance();
		birthDate5.set(1998, 02, 30);

		/**(String FirstName, String MiddleName, String LastName,
				Date DOB, String Address, String Phone_number, String Email,
				String officeHours, int rank, double salary, Date hireDate,
				eTitle Title) */
		
		Staff sf1 = new Staff("Jane" , "A.", "Doe", birthDate1.getTime(), "123 Downtown UD Drive", "(302) 123-5121", "teacher1@udel.edu", "T/H 2-3PM",3, 89200.00, hiredOn11.getTime(), eTitle.MRS);
		Staff sf2 = new Staff("Jake" , "B.", "Ray", birthDate2.getTime(), "123 Downtown UD Court", "302-123-5122", "teacher2@udel.edu", "M/W/F 9-11AM",5, 29600.00, hiredOn11.getTime(), eTitle.MR);
		Staff sf3 = new Staff("Eric" , "C.", "Me", birthDate3.getTime(), "123 Downtown UD Lane", "(302)1235123", "teacher3@udel.edu", "T 2-5PM",1, 289000.00, hiredOn22.getTime(), eTitle.MR);
		Staff sf4 = new Staff("Grace" , "D.", "Fao", birthDate4.getTime(), "123 Downtown UD Circle", "(302) 1235124", "teacher4@udel.edu", "M/F 8-10AM",2, 189600.00, hiredOn22.getTime(), eTitle.MS);
		Staff sf5 = new Staff("Marcos" , "E.", "So", birthDate5.getTime(), "123 Downtown UD Road", "3021235125", "teacher5@udel.edu", "M/W/F 12-2PM",3, 119100.00, hiredOn11.getTime(), eTitle.MR);

		staff.add(sf1);
		staff.add(sf2);
		staff.add(sf3);
		staff.add(sf4);
		staff.add(sf5);

	}
	
	
	@Test
	public void Salary_Test() {
		double avgSalary = 0;
		for(Staff instance : staff){
			avgSalary += instance.getSalary();
		}
		avgSalary = avgSalary/5;
		
		assertTrue(Math.abs(avgSalary-143300.00) < 0.01);
	}
	@Test(expected=PersonException.class)
	
	public final void DOBException_Test() throws PersonException {
		Calendar birthDate1 = Calendar.getInstance();
		birthDate1.set(1808, 02, 30);
		Calendar hiredOn11 = Calendar.getInstance();
		hiredOn11.set(2005, 02, 12);
		Staff sf1 = new Staff("Jane" , "A.", "Doe", birthDate1.getTime(), "123 Downtown UD Drive", "(302) 123-5121", "teacher1@udel.edu", "T/H 2-3PM",3, 89200.00, hiredOn11.getTime(), eTitle.MRS);
		staff.add(1,sf1);

	}
	
	@Test(expected=PersonException.class)
	
	public final void PhoneNumberException_Test() throws PersonException {
		Calendar birthDate5 = Calendar.getInstance();
		birthDate5.set(1978, 02, 30);
		Calendar hiredOn11 = Calendar.getInstance();
		hiredOn11.set(2005, 02, 12);
		Staff sf5 = new Staff("Marcos" , "E.", "So", birthDate5.getTime(), "123 Downtown UD Road", "123456789", "teacher5@udel.edu", "M/W/F 12-2PM",3, 119100.00, hiredOn11.getTime(), eTitle.MR);
		staff.add(5,sf5);

	}
	



}