package com.initiative.quickloan.api.model;

public class CustomerInfoResponse {
	
	private int status;
	private String description;
	
	private Customer customer;
	
	public int getStatus() {
		return status;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "CustomerInfoResponse [status=" + status + ", description=" + description + ", customer=" + customer
				+ "]";
	}
	
	
}
