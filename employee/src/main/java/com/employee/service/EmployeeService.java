package com.employee.service;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.dao.EmployeeDao;
import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	EmployeeDao eo;
	@Autowired
	EmployeeRepository er;
	public String postdata(Employee a)
	{
		return eo.postdata(a);
	}
	
	

}
