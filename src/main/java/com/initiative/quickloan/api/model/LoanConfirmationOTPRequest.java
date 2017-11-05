package com.initiative.quickloan.api.model;

public class LoanConfirmationOTPRequest {
	
	private String aadhaarNo;
	private String otp;
	
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	
	public String getOtp() {
		return otp;
	}
	public void setOtp(String otp) {
		this.otp = otp;
	}
	@Override
	public String toString() {
		return "LoanConfirmationOTPRequest [aadhaarNo=" + aadhaarNo 
				+ "]";
	}
	
}
