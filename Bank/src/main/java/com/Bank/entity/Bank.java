package com.Bank.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="bank")
public class Bank {
	@Override
	public String toString() {
		return "Bank [id=" + id + ", branch=" + branch + ", name=" + name + ", ifsc=" + ifsc + "]";
	}
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	public Bank(int id, String branch, String name, String ifsc) {
		super();
		this.id = id;
		this.branch = branch;
		this.name = name;
		this.ifsc = ifsc;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	private String branch;
	private String name;
	private String ifsc;

}
