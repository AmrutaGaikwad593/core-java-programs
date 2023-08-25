package com.jsp.constructor;

public class TestFather {
	public static void main(String[] args) {
		Father f=new Son();
		f.m1();
		Son s=(Son) f;
		s.m3();
		
	}
}
