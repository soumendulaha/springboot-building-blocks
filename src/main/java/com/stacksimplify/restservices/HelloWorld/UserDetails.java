package com.stacksimplify.restservices.HelloWorld;

public class UserDetails {
	
	private String firstName;
	private String lastName;
	private String Id;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public UserDetails(String firstName, String lastName, String id) {
		this.firstName = firstName;
		this.lastName = lastName;
		Id = id;
	}
	@Override
	public String toString() {
		return "UserDetails [firstName=" + firstName + ", lastName=" + lastName + ", Id=" + Id + "]";
	}
	
	
	

}
