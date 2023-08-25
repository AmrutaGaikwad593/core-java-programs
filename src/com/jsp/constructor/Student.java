package com.jsp.constructor;

public class Student {
private int stu_id;
private String stu_name;

public Student(int stu_id,String stu_name)
{
	this.stu_id=stu_id;
	this.stu_name=stu_name;
}

public void setStu_id(int stu_id) {
	this.stu_id=stu_id;
}
public int getStu_id(){
	return stu_id;
	}

public void setStu_name(String stu_id) {
	this.stu_name=stu_name;
}
public String getStu_name() {
	return stu_name;
}

public void printStudentDetails() {
	System.out.println("===Student Details===");
	System.out.println(stu_id);
	System.out.println(stu_name);
}
}
