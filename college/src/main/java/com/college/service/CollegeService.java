package com.college.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.college.dao.CollegeDao;
import com.college.entity.College;

@Service
public class CollegeService {
	@Autowired
	CollegeDao cd;
	//save
	public String datapost(College c)
	{
		return cd.datapost(c);
	}
	//saveall
	public String listdata(List<College> aa)
	{
		return cd.listdata(aa);
	}
	//findById
	public College getdata(int a)
	{
		return cd.getdata(a);
	}
	
	//findall
	public List<College> alldata()
	{
	  return cd.alldata();
	}
	
	//put
	public String modifydata(College aa)
	{
		return cd.modifydata(aa);
	}
	
	//patch
	public College patch(int id,College aa)
	{
		return cd.patch(id,aa);
	}
	

}
