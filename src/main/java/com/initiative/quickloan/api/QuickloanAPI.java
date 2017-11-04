package com.initiative.quickloan.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuickloanAPI {
	
	@RequestMapping("/ping")
	public String ping() {
		return "ping";
	}
}
