package com.initiative.quickloan.api.model;

import java.util.Arrays;

public class Customer {
	private String name;
	private String dob;
	private String gender;
	private String address;
	private String contact;
	private byte[] photo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", dob=" + dob + ", gender=" + gender + ", address=" + address + ", contact="
				+ contact + ", photo=" + Arrays.toString(photo) + "]";
	}
	
	
}
