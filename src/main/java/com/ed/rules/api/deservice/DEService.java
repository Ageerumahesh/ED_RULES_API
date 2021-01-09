package com.ed.rules.api.deservice;

import java.io.IOException;

import org.drools.compiler.compiler.DroolsParserException;

import com.ed.rules.api.domain.EDIndivInfoBinding;
import com.ed.rules.api.domain.EdPlanInfoBinding;

public interface DEService {

	public EdPlanInfoBinding executeRules(EDIndivInfoBinding indvInfo) throws DroolsParserException, IOException;
}
