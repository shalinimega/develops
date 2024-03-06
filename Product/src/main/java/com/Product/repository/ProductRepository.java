package com.Product.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.Product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

	@Query(value="SELECT * FROM boot.product where name=?",nativeQuery=true)
	public List<Product> getname(String name);
	
	@Query(value="select * from boot.product where price>?",nativeQuery=true)
	public List<Product> getprice(int price);
	
	@Query(value="select * from boot.product where price between ? and ?",nativeQuery=true)
	public List<Product> getrange(int a,int b);
	
	@Query(value="select count(exp) from product",nativeQuery=true)
	public int getexp();
	
	@Query(value="select * from boot.product where price=(select max(price) from boot.product)", nativeQuery=true)
	public Product getmax();`
	
	@Query(value="select avg(price) from product",nativeQuery=true)
    public int getavg();
	
	@Query(value="select sum(exp) from product",nativeQuery=true)
	public int getsum();
	
	@Query(value="select * from product order by exp asc",nativeQuery=true)
	public List<Product> getasc();
	
	@Query(value="select * from product order by price desc",nativeQuery=true)
	public List<Product> getdsc();
	
	@Query(value="select hsn from product where id=?",nativeQuery=true)
	public int gethsn(int a);
//	
//	//jquery
//	@Query(value="select  e from Product e where e.price >=:a")
//	public List<Product> getpp(@Param(value="a") int a);
//	
	@Query(value="select e from Product e where e.price >=:p")
	public List<Product> getpr(@Param(value="p") int p);
	
	/*@Query(value="select e from Product e where e.name=:n")
	public Product gname(@Param(value="n") String n);*/
	
	/*@Query(value="select e from Product e where e.price between pp and cc")
	public List<Product> betw(@Param(value="pp") int pp, @Param(value="cc") int cc);*/
	
}

 