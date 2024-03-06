package com.Gst.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Gst.dao.Gstdao;
import com.Gst.entity.Gst;

@Service
public class Gstservice {
	@Autowired
	Gstdao gd;
	public String gstsave(List<Gst> aa)
	{
		return gd.gstsave(aa);
	}
	public List<Gst> find()
	{
		return gd.find();
	}
	public int findhsn(int s)
    {
  	    return gd.findhsn(s);
    }
  	    
   
    
	

}
