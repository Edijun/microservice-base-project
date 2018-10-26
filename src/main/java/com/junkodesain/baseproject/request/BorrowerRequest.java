package com.junkodesain.baseproject.request;

import javax.validation.constraints.NotEmpty;

public class BorrowerRequest {

	@NotEmpty(message = "Name can not be empty")
	private String name;

	@NotEmpty(message = "Address can not be empty")
	private String address;

	@NotEmpty(message = "Postal can not be empty")
	private String postalCode;

	@NotEmpty(message = "City can not be empty")
	private String city;

	@NotEmpty(message = "Email can not be empty")
	private String email;

	@NotEmpty(message = "Phone No can not be empty")
	private String phoneNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

}
