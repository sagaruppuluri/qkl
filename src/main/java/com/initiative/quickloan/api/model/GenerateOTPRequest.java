package com.initiative.quickloan.api.model;

public class GenerateOTPRequest {
	
	private String aadhaarNo;
	private boolean acceptTerms;
	
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public boolean isAcceptTerms() {
		return acceptTerms;
	}
	public void setAcceptTerms(boolean acceptTerms) {
		this.acceptTerms = acceptTerms;
	}
	
	@Override
	public String toString() {
		return "GenerateOTPRequest [aadhaarNo=" + aadhaarNo + ", acceptTerms=" + acceptTerms + "]";
	}
	
	
}
