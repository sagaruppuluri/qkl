package com.initiative.quickloan.api;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.initiative.quickloan.api.model.Customer;
import com.initiative.quickloan.api.model.CustomerInfoRequest;
import com.initiative.quickloan.api.model.CustomerInfoResponse;
import com.initiative.quickloan.api.model.GenerateOTPRequest;
import com.initiative.quickloan.api.model.GenerateOTPResponse;
import com.initiative.quickloan.api.model.LoanConfirmationOTPRequest;
import com.initiative.quickloan.api.model.LoanConfirmationOTPResponse;
import com.initiative.quickloan.api.model.LoanConfirmationRequest;
import com.initiative.quickloan.api.model.LoanConfirmationResponse;
import com.initiative.quickloan.api.model.OTPAuthenticateRequest;
import com.initiative.quickloan.api.model.OTPAuthenticateResponse;

// API Comment Added 1
// Api Comment 2
@RestController
public class QuickloanAPI {
	
	private Logger logger = Logger.getLogger(getClass());
	
	@RequestMapping("/ping")
	public String ping() {
		return "ping";
	}
	
	@RequestMapping(value = "/api/v1.0.0/otp/generate", method = RequestMethod.POST)
	public GenerateOTPResponse generateOTP(@RequestBody GenerateOTPRequest request) {
		
		logger.info("Received generateOTP request " + request );
		
		GenerateOTPResponse response = new GenerateOTPResponse();
		response.setStatus(ResponseStatus.SUCCESS);
		response.setDescription("Success");
		
		return response;
	}
	
	@RequestMapping(value = "/api/v1.0.0/otp/authenticate", method = RequestMethod.POST)
	public OTPAuthenticateResponse authenticateOTP(@RequestBody OTPAuthenticateRequest request) {
		
		logger.info("Received authenticateOTP request " + request );
		
		OTPAuthenticateResponse response = new OTPAuthenticateResponse();
		response.setStatus(ResponseStatus.SUCCESS);
		response.setDescription("Success");
		
		return response;
	}
	
	
	@RequestMapping(value = "/api/v1.0.0/customerInfo/get", method = RequestMethod.POST)
	public CustomerInfoResponse getCustomerInfo(@RequestBody CustomerInfoRequest request) {
		
		logger.info("Received getCustomerInfo request " + request );
		
		CustomerInfoResponse response = new CustomerInfoResponse();
		response.setStatus(ResponseStatus.SUCCESS);
		response.setDescription("Success");
		
		Customer customer = new Customer();
		customer.setName("abc");
		customer.setAddress("xyz");
		customer.setContact("132123");
		
		response.setCustomer(customer);
		
		return response;
	}
	
	@RequestMapping(value = "/api/v1.0.0/loan/confirm", method = RequestMethod.POST)
	public LoanConfirmationResponse loanConfirm(@RequestBody LoanConfirmationRequest request) {
		
		logger.info("Received loanConfirm request " + request );
		
		LoanConfirmationResponse response = new LoanConfirmationResponse();
		response.setStatus(ResponseStatus.SUCCESS);
		response.setDescription("Success");
		
		return response;
	}
	
	@RequestMapping(value = "/api/v1.0.0/loan/confirm/otp/authenticate", method = RequestMethod.POST)
	public LoanConfirmationOTPResponse loanConfirmOTP(@RequestBody LoanConfirmationOTPRequest request) {
		
		logger.info("Received loanConfirm request " + request );
		
		LoanConfirmationOTPResponse response = new LoanConfirmationOTPResponse();
		response.setStatus(ResponseStatus.SUCCESS);
		response.setDescription("Success");
		
		return response;
	}
	
}
