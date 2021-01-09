package com.ed.rules.api.deservice;

import java.lang.reflect.Method;

import org.springframework.stereotype.Service;

import com.ed.rules.api.domain.EDIndivInfoBinding;
import com.ed.rules.api.domain.EdPlanInfoBinding;

@Service
public class DetermineEligibilityService  {

	public EdPlanInfoBinding determineEligibility(EDIndivInfoBinding indvInfo) {
		String planName = indvInfo.getPlanName();
		String clzName = "com.ed.rules.api.deservice." + planName + "RulesExecutor";
		EdPlanInfoBinding planInfo = null;
		try {
			Class<?> clz = Class.forName(clzName);

			Method method = clz.getDeclaredMethod("executeRules", EDIndivInfoBinding.class);

			Object object = clz.newInstance();

			planInfo = (EdPlanInfoBinding) method.invoke(object, indvInfo);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return planInfo;

	}

}
