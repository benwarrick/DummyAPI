package com.bw.dummyApi.api;

public class EmailRequest2 {
	String Subject;
	String FirstName;
	String LastName;
	String email; 
	String OrderNumber; 
	String Items;
	
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOrderNumber() {
		return OrderNumber;
	}
	public void setOrderNumber(String orderNumber) {
		OrderNumber = orderNumber;
	}
	public String getItems() {
		return Items;
	}
	public void setItems(String items) {
		Items = items;
	} 
}
