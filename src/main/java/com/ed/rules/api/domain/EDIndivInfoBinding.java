package com.ed.rules.api.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class EDIndivInfoBinding {

	
	private String indvFirstName;
	private String indvLastName;
	private String planName;
	private String isEmployed;
	
	private EdPlanInfoBinding planInfo;
}
