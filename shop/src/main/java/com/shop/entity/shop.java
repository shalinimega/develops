package com.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="shop")
public class shop {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private  int id;
	private String name;
	private int price;
	private int hsn;
	private int quans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getHsn() {
		return hsn;
	}
	public void setHsn(int hsn) {
		this.hsn = hsn;
	}
	public int getQuans() {
		return quans;
	}
	public void setQuans(int quans) {
		this.quans = quans;
	}

}
