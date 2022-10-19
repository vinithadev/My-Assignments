package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		
		System.out.println("Vinitha");
	}
	
	public void studentDept() {
		
		System.out.println(" Cs");
	}
	
	public void studentid() {
		System.out.println("ID: CS015");
	}

	public static void main(String[] args) {
		
		Student call=new Student();
		call.collegeCode();
		call.collegeName();
		call.collegeRank();
		call.deptName();
		call.studentName();
		call.studentid();

		call.studentDept();
		
		
	}

}
