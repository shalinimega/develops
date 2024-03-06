package com.firstproject.services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.firstproject.Dao.Cardao;
import com.firstproject.custom.BrandnotFound;
import com.firstproject.custom.Priceless;
import com.firstproject.entity.Car;

@Service
public class Carservices {
     @Autowired
     Cardao cd;
     public String setData(Car c)throws Priceless
     {
    	 try
    	 {
    	 if(c.getPrice()>20000)
    	 {
    		 throw new Priceless("price lessthan");
    	 }
    	 else
    	 {
    	     return cd.setData(c);
    	 }
    	 }
    	 catch(Priceless e)
    	 {
    		 return e.getMessage();
    	 }
    	 
     }
     public String setall(List<Car> aa)
     {
    	 return cd.setall(aa);
     }
     public Car finddata(int w)
     {
    	 return cd.finddata(w);
     }
     public List<Car> findal()
     {
    	 return cd.findal();
     }
     public String del(int q)
     {
    	 return cd.del(q);
     }
     public String update(Car w)
     {
    	 return cd.update(w);
     }
     public List<Car> getbrand(String brand)throws BrandnotFound
     {
    	 List<Car> mylist=cd.findal();
    	 List<Car> aa=mylist.stream().filter(x->x.getBrand().equals(brand)).collect(Collectors.toList());
    	 if(aa.isEmpty())
    	 {
    		 throw new BrandnotFound("this empty string");
    	 }
    	 else
    	 {
    		 return aa;
    	 }
     }
     public List<Car> getalda(int price,String color)
     {
    	 List<Car> colors=cd.findal();
    	 List<Car> mm=colors.stream().filter(x->x.getPrice()==price && x.getColor().equals(color)).collect(Collectors.toList());
    	 return mm;
     }
     
     public List<Car> sorts()
     {
    	 List<Car> so=cd.findal();
    	 List<Car> mm=so.stream().sorted(Comparator.comparing(Car::getPrice)).collect(Collectors.toList());
    	 return mm;
     }
     public Car maxs()
     {
    	 List<Car> mx=cd.findal();
    	 Car o=mx.stream().max(Comparator.comparing(Car::getPrice)).get();
    	 return o;
     }
     public List<Car> priceupdate(int pp)
     {
    	 List<Car> bb=cd.findal();
    	 List<Car> kk=bb.stream().filter(x->x.getPrice()<pp).peek(y->y.setPrice(y.getPrice()+y.getPrice()*10/100)).collect(Collectors.toList());
    	 return cd.priceupdate(kk);
     }
     public List<Car> colorblack(String oo)
     {
    	 List<Car> b=cd.findal();
    	 List<Car> p=b.stream().filter(x->x.getBrand().equals(oo)).limit(2).collect(Collectors.toList());
    	 return p;
    	
     }
     public List<Car> odds()
     {
    	 List<Car> b=cd.findal();
    	 List<Car> p=b.stream().filter(x->x.getId()%2==0).peek(y->y.setPrice(y.getPrice()-y.getPrice()*10/100)).collect(Collectors.toList());
    	 return cd.odds(p);
     }
     
     }
     

