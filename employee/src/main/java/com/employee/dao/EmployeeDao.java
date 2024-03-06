package com.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;
import com.employee.repository.EmployeeRepository;

@Repository
public class EmployeeDao {
	@Autowired
	EmployeeRepository er;
	public String postdata(Employee a)
	{
		er.save(a);
		return "sucessful";
		
	}
	public String changedata(String name)
	{
		 er.saveAll(name);
		 return "sucess";
	}
	

}
