package com.StudentMarkSheet.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.StudentMarkSheet.Dao.MarkSheetdao;
import com.StudentMarkSheet.entity.MarkSheet;

@Service
public class MarkSheetService {
	@Autowired
	MarkSheetdao md;
	
	/*public String postdata(List<MarkSheet> aa)
	{
		aa.forEach(x->
		{
			x.setSem1Total(x.getSem1Practicals()+x.getSem1Thory());
			x.setSem2Total(x.getSem2Total()+x.getSem2Thory());

		});
		return md.postdata(aa);
	}*/
	public String postdata(List<MarkSheet> a) {
	    List<MarkSheet> list = a.stream()
	        .peek(x -> {
	            x.setSem1Total(x.getSem1Thory() + x.getSem2Practicals());
	            x.setSem2Total(x.getSem2Thory() + x.getSem2Practicals());
	        })
	        .collect(Collectors.toList());

	    return md.postdata(list);
	}

	


}
