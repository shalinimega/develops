package com.college.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.college.entity.College;
import com.college.repository.CollegeRepository;

@Repository
public class CollegeDao {
	@Autowired
	CollegeRepository cr;
	//save
	public String datapost(College e)
	{
		cr.save(e);
		return "sucessfully";
	}
	//saveall
	public String listdata(List<College> aa)
	{
		cr.saveAll(aa);
		return "list of data sucessfully inserted";
	}
	//findbyid
	public College getdata(int a)
	{
		return cr.findById(a).get();
	}
	
	//findall
	public List<College> alldata()
	{
		return cr.findAll();
	}
	
	// Partially update a college entity
	    public College patch(int id, College aa) {
	        College a = cr.findById(id).orElse(null);

	        if (a != null && aa != null) {
	            // Update fields if they are not null in the updatedCollege
	            if (aa.getName() != null) {
	                a.setName(aa.getName());
	            }
	            if (aa.getDept() != null) {
	                a.setDept(aa.getDept());
	            }
	            if (aa.getMarks() != 0) {
	                a.setMarks(aa.getMarks());
	            }

	            // Save the updated college entity
	            return cr.save(a);
	        } else {
	            // College with given id not found
	            return null;
	        }
	    }
	}



