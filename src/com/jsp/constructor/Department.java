package com.jsp.constructor;

public class Department {
private int dept_id;
private String dept_name;
private Student student;

public Department(int dept_id,String dept_name) {
	this.dept_id=dept_id;
	this.dept_name=dept_name;
}

public void setDept_id(int dept_id) {
	this.dept_id=dept_id;
}
public int getDept_id() {
	return dept_id;
}

public void setDept_name(String dept_name) {
	this.dept_name=dept_name;
}
public String getDept_name() {
	return dept_name;
}

public void setStudent(Student student) {
	this.student=student;
}
public Student getStudent() {
	return student;
}

public void printDepartmentDetails() {
	System.out.println("===Dept Dtails===");
	System.out.println(dept_id);
	System.out.println(dept_name);
	
	if(student!=null) {
		student.printStudentDetails();
	}
	else {
		System.out.println("student details not present");
	}
}

}
