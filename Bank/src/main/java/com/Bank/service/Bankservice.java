package com.Bank.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Bank.customException.IfscNotfoundException;
import com.Bank.dao.Bankdao;
import com.Bank.entity.Bank;

@Service
public class Bankservice {
	@Autowired
	Bankdao bd;
	public String sendall(List<Bank> mm)
	{
		return bd.sendall(mm);
	}
	public String getall(String a)
	{
		return bd.getall(a);
	}
	public String exc(String a1)throws IfscNotfoundException
	{
	
			if(a1.equals("0"))
			{
				throw new IfscNotfoundException(" correct");
			}
			else
			{
				return bd.exc(a1);
			}
	}
	public List<Bank> mess(int q)
	{
		return bd.mess(q);
	}

}
