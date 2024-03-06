package com.StudentMarkSheet.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.StudentMarkSheet.entity.MarkSheet;
import com.StudentMarkSheet.repository.MarkSheetRepository;

@Repository
public class MarkSheetdao {
	@Autowired
	MarkSheetRepository mr;
	public String postdata(List<MarkSheet> a)
	{
		mr.saveAll(a);
		return "saved suceful";
	}
	

}





