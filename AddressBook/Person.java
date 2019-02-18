package com.bridgelabz.AddressBook;

public class Person {
	private String firstname;
	private String lastname;
	private String address;
	private String state;
	private String city;
	private String zip;
	private String phone_num;
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhone_num() {
		return phone_num;
	}
	public void setPhone_num(String phone_num) {
		this.phone_num = phone_num;
	}
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", state=" + state
				+ ", city=" + city + ", zip=" + zip + ", phone_num=" + phone_num + "]";
	}
	public Person(String firstname, String lastname, String address, String state, String city, String zip,
			String phone_num) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.address = address;
		this.state = state;
		this.city = city;
		this.zip = zip;
		this.phone_num = phone_num;
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
}
