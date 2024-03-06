package com.Gst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Gst.entity.Gst;
import com.Gst.service.Gstservice;

@RestController
public class Gstcontroller {
      @Autowired
      Gstservice gs;
      @PostMapping("savelist")
      public String gstsave(@RequestBody List<Gst> aa)
      {
    	  return gs.gstsave(aa);
      }
      @GetMapping("find")
      public List<Gst> find()
      {
    	  return gs.find();
      }
      
      @GetMapping("findhsn/{s}")
      public int findhsn(@PathVariable int s)
      {
    	  return gs.findhsn(s);
      }
      
      
}
