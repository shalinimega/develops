package com.Gst.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Gst.entity.Gst;
import com.Gst.repostoiry.GstRepository;

@Repository
public class Gstdao {
	@Autowired
	GstRepository gr;
	public String gstsave(List<Gst> aa)
	{
		gr.saveAll(aa);
		return "sucessfully";
	}
	public List<Gst> find()
	{
		return gr.findAll();
	}
	public int findhsn(int s)
    {
  	  return gr.findhsn(s);
    }

}
