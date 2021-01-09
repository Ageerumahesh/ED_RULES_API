package com.ed.rules.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ed.rules.api.deservice.DEService;
import com.ed.rules.api.deservice.DetermineEligibilityService;
import com.ed.rules.api.domain.EDIndivInfoBinding;
import com.ed.rules.api.domain.EdPlanInfoBinding;

@Controller
public class DeteriminationEligibilityController {

	
	@Autowired
	private DEService eligService1;
	
	@Autowired
	private DetermineEligibilityService eligService;
 
	@PostMapping(
		value = "/determineElig", 
		produces = { "application/xml", "application/json" },
		consumes= {"application/xml", "application/json"}
	)
	public ResponseEntity<EdPlanInfoBinding> checkPlanEligibility(@RequestBody EDIndivInfoBinding indvInfo) {
		EdPlanInfoBinding planInfo = eligService .determineEligibility(indvInfo);
		return new ResponseEntity<EdPlanInfoBinding>(planInfo, HttpStatus.OK);
	 
	}    
}
