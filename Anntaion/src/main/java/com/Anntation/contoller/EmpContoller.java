package com.Anntation.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpContoller {
	@Qualifier("senior")
	@Autowired
	Emp ee;
	@GetMapping(value="/getEmpmsg")
	public String getEmp()
	{
		return ee.getmsg();
	}
}
