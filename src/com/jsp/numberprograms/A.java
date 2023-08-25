package com.jsp.numberprograms;

   public class A {
   A(){
	   System.out.println("A class cons");
   }
   A(String x){
	   System.out.println("B class cons");
   }
   }
   class B extends A{
	   B(int x){
		   super("xyz");
		   System.out.println("B class int cons");
	   }
	   B(){
		   this(10);
		   System.out.println("B class cons1");
	   }
   }
   class C extends B{
	   C(){
		   System.out.println("C class");
	   }
   }
//	public static void m1() {
//		   System.out.println("1");
//	   }
//	   void m2() {
//		   System.out.println("2");
//	   }
// }
//   class B extends A{
//public static void m1() {
//		   System.out.println("3");
//	   }
//	   void m3() {
//		   System.out.println("4");
//	   }
// }
//   class C extends B {
//	   void m1() {
//		   System.out.println("5");
//	   }
//	   void m4() {
//		   System.out.println("6");
//	   }
 
//5(Abstraction)		   void tranfer();
//	   }
//	 class ICICI implements A{
//		@Override
//		public void tranfer() {
//			System.out.println("ICICI is");
//		}
//   }
//	   class SBI implements A{
//		@Override
//		public void tranfer() {
//			System.out.println("SBI is");
//		}
//	   }
//	   class YES implements A{
//
//		@Override
//		public void tranfer() {
//			System.out.println("YES is");
//		}
//		  
//	   }
	   
	   
//4(Fan)	void on();
//	void off();
//}
//
//interface B{
//   void  inspeed();
//   void decspeed();
//}

//3	public void eat(){
//		int a=hashCode();
//		System.out.println(a);
//		System.out.println("veg");
//	}
//	public void drink() {
//		System.out.println("whisky");
//	}}
//   class F extends A{
//		public void eat() {
//			System.out.println("non veg");
//		}
	


//2	int a= 10;
//	void m1() {
//		System.out.println("m1 method");
//	}
//}
// 
//class C extends A{
//	int a=20;
//	void superExample() {
//		System.out.println(a);
//		System.out.println(super.a);
//		super.m1();
//	}
//}


//		A(){
//			System.out.println("A class");
//		}
//	}
//	class B extends A{
//		B(){
//		System.out.println("B class");
//		}
//	}
//	class C extends B{
//		C(){
//			System.out.println("C class");
//		}
//	}

	


	
	
	
	
	
	

