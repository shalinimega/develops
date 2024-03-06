package com.StudentMarkSheet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.StudentMarkSheet.entity.MarkSheet;
import com.StudentMarkSheet.service.MarkSheetService;

@RestController
public class StudentMarkSheetController {
	@Autowired
	MarkSheetService ms;
	@PostMapping(path="/data")
	public String postdata(@RequestBody List<MarkSheet> aa)
	{
		return ms.postdata(aa);
	}


}