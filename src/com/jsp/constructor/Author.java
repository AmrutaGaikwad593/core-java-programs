package com.jsp.constructor;

public class Author {
	
	private String author_name;
	private String email;
	private long contact_no;
	private Address address;
	
	
	Author(String author_name,String email,long contact_no)
	{
		this.author_name=author_name;
		this.email=email;
		this.contact_no=contact_no;
	}

	public String getAuthor_name() {
		return author_name;
	}

	public void setAuthor_name(String author_name) {
		this.author_name = author_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getContact_no() {
		return contact_no;
	}

	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	public void printAuthorDetails()
	{
		System.out.println("====AuthorDetails====");
		System.out.println(author_name);;
		System.out.println(email);
		System.out.println(contact_no);
		
		if(address!=null)
		{
			address.printAddressDetails();
		}
		else
		{
			System.out.println("Address Not Mention");
		}
	}
	
	

}
