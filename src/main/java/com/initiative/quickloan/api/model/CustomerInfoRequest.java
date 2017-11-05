package com.initiative.quickloan.api.model;

public class CustomerInfoRequest {
	
	private String aadhaarNo;
	
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	
	@Override
	public String toString() {
		return "OTPAuthenticateRequest [aadhaarNo=" + aadhaarNo + "]";
	}
	
}
