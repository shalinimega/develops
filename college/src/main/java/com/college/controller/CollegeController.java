package com.college.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.college.entity.College;
import com.college.service.CollegeService;

@RestController
public class CollegeController {
	@Autowired
	CollegeService cs;
	
	//Save
	@PostMapping(path="/data")
	public String datapost(@RequestBody College c)
	{
		return cs.datapost(c);
	}
	//saveAll
	@PostMapping(path="/data1")
	public String listdata(@RequestBody List<College> aa)
	{
		return cs.listdata(aa);
	}
	
	//findById
	@GetMapping(path="/dataget/{a}")
	public College getdata(@PathVariable int a)
	{
	  return cs.getdata(a);
	}
	
	//findAll
	@GetMapping(path="/dataall")
	public List<College> alldata()
	{
		return cs.alldata();
	}
	//put
	@PutMapping(path="/dataf")
	public String modifydata(@RequestBody College aa)
	{
		return cs.modifydata(aa);
	}
	//patchmapping
	@PatchMapping(path="/datapatch/{id}")
	public College patch(@PathVariable int id,@RequestBody College aa)
	{
		return cs.patch(id,aa);
	}
	
	
	
	
}
