package com.Product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.Product.custmo.Hsnnotfound;
import com.Product.custmo.Priceless;
import com.Product.dao.ProductDao;
import com.Product.entity.Product;

@Service
public class Productservice {
	@Autowired
	ProductDao pd;

	public String send(Product aa) {
		return pd.send(aa);
	}

	public String sendall(List<Product> aa) {
		return pd.sendall(aa);
	}

	public List<Product> getname(String name) {
		return pd.getname(name);
	}

	public List<Product> getprice(int price)throws Priceless{
		if(price>1000)
		{
			throw new  Priceless("less");
		}
		else
		{
		     return pd.getprice(price);
		}
	}

	public List<Product> getrange(int a, int b) {
		return pd.getrange(a, b);
	}

	public int getexp() {
		return pd.getexp();
	}

	public Product getmax() {
		return pd.getmax();
	}

	public int getavg() {
		return pd.getavg();
	}

	public int getsum() {
		return pd.getsum();
	}

	public List<Product> getasc() {
		return pd.getasc();
	}

	public List<Product> getdsc() {
		return pd.getdsc();
	}

	/*public List<Product> getpp(int a) {
		return pd.getpp(a);
	}*/

	public int gethsn(int a) throws Hsnnotfound {
		{
			if (a == 0) {
				throw new Hsnnotfound("not");
			} else {
				return pd.gethsn(a);
			}
		}

	}
	public List<Product> getpr(int p)throws Priceless
	{
		if(p>50)
		{
			throw new Priceless("less than 50");
		}
		else
		{
	     return pd.getpr(p);
		}
	}
	/*public Product gname(String nn)
	{
		return pd.gname(nn);
	}*/
	/*public List<Product> betw(int a,int b)
	{
		return pd.betw(a,b);
	}*/
	
}
