package com.initiative.quickloan.api.model;

public class LoanConfirmationRequest {
	
	private String aadhaarNo;
	private double loanAmount;
	private int tenure;
	
	
	public String getAadhaarNo() {
		return aadhaarNo;
	}
	public void setAadhaarNo(String aadhaarNo) {
		this.aadhaarNo = aadhaarNo;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	
	@Override
	public String toString() {
		return "LoanConfirmationRequest [aadhaarNo=" + aadhaarNo + ", loanAmount=" + loanAmount + ", tenure=" + tenure
				+ "]";
	}
	
}
