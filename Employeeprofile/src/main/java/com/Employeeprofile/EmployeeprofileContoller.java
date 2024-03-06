package com.Employeeprofile;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeprofileContoller {

	    @Value("${my.name}")
		//@Value("10")
		String name;
		//int num;
		@GetMapping(value="/get")
		public String getthis()
		{
			return "Hello"+name;
		}
	
}
