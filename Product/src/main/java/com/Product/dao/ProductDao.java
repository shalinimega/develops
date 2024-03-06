package com.Product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Product.entity.Product;
import com.Product.repository.ProductRepository;

@Repository
public class ProductDao {
	@Autowired
	ProductRepository pr;
	public String send(Product aa)
	{
		pr.save(aa);
		return "sucessfully";
		
	}
	public String sendall(List<Product> aa)
	{
		pr.saveAll(aa);
		return "sucessfully";
	}
	
	public List<Product> getname(String name)
	{
		return pr.getname(name);
	}
	public List<Product> getprice(int price)
	{
		return pr.getprice(price);
	}
	
	public List<Product> getrange(int a,int b)
	{
		return pr.getrange(a,b);
	}
	public int getexp()
	{
		return pr.getexp();
	}
	public Product getmax()
	{
		return pr.getmax();
	}
	public int getavg()
	{
		return pr.getavg();
	}
	public int getsum()
	{
		return pr.getsum();
	}
	public List<Product> getasc()
	{
		return pr.getasc();
	}
	public List<Product> getdsc()
	{
		return pr.getdsc();
	}
	/*public List<Product> getpp(int a)
	{
		return pr.getpp(a);
	}*/
	public int gethsn(int a)
	{
		return pr.gethsn(a);
	}
	public List<Product> getpr(int p)
	{
	     return pr.getpr(p);	
	}
	/*public Product gname(String nn)
	{
		return pr.gname(nn);
	}*/
	/*public List<Product> betw(int a,int b)
	{
		return pr.betw(a,b);
	}*/
	
}
	


