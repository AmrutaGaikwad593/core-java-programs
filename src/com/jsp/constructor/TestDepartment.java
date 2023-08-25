package com.jsp.constructor;

public class TestDepartment {
public static void main(String[] args) {
	Department d=new Department(1, "computer science");
	d.setStudent(new Student(101,"amruta"));
	d.printDepartmentDetails();
}
}
