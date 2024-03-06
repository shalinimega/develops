package com.firstproject.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.firstproject.Repository.CarRepository;
import com.firstproject.custom.Priceless;
import com.firstproject.entity.Car;

@Repository
public class Cardao {
	 @Autowired
     CarRepository cr;
	 public String setData(Car c)
	 {
		 
		        cr.save(c);
		        return "sucessfully";
	 }
	 public String setall(List<Car> aa)
	 {
		 cr.saveAll(aa);
		 return "all data sucessfully";
	 }
	 public Car finddata(int w)
	 {
		 return cr.findById(w).get();
		 
	 }
	 public List<Car> findal()
	 {
		 return cr.findAll();
	 }
	 public String del(int q)
	 {
		  cr.deleteById(q);
		  return "sucesful";
	 }
	 public String update(Car w)
	 {
		 cr.save(w);
		 return "updatesucessful";
	 }
	public List<Car> priceupdate(List<Car> kk) {
	
		return cr.saveAll(kk);
	}
	public List<Car> odds(List<Car> p)
	{
		return cr.saveAll(p);
	}
}
