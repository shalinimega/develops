package com.checkms.entity;

public class shop {
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
