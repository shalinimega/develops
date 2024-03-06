package com.Bank.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Bank.Repository.BankRepository;
import com.Bank.entity.Bank;

@Repository
public class Bankdao {
     @Autowired
     BankRepository br;
     public String sendall(List<Bank> mm)
     {
    	 br.saveAll(mm);
    	 return "sucessfully";
     }
     public String getall(String a)
 	{
 		return br.getall(a);
 	}
     public String exc(String a1)
     {
    	  br.save(a1);
    	  return "sucessfullly";
  
     }
     public List<Bank> mess(int q)
 	{
 		return br.findById().get();
 	}
}
