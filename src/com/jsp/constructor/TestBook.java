package com.jsp.constructor;

public  class TestBook {

	public static void main(String[] args) {
		
		Book b1=new Book("life amazing secrets","motivational	",200);
		b1.setAuthor(new Author("gaur gopal das","gopal@gmail.com",5678931421l));
		b1.getAuthor().setAddress(new Address("sg barve marg","kurla","mumbai","maharashtra"));
        b1.printBookDetails();		
		
	}
}
