package com.StudentMarkSheet.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="market_sheet")
public class MarkSheet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int rollNumber;
	private int sem1Thory;
	private int sem1Practicals;
	private int sem2Thory;
	private int sem2Practicals;
	private int sem1Total;
	private int sem2Total;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public int getSem1Thory() {
		return sem1Thory;
	}
	public void setSem1Thory(int sem1Thory) {
		this.sem1Thory = sem1Thory;
	}
	public int getSem1Practicals() {
		return sem1Practicals;
	}
	public void setSem1Practicals(int sem1Practicals) {
		this.sem1Practicals = sem1Practicals;
	}
	public int getSem2Thory() {
		return sem2Thory;
	}
	public void setSem2Thory(int sem2Thory) {
		this.sem2Thory = sem2Thory;
	}
	public int getSem2Practicals() {
		return sem2Practicals;
	}
	public void setSem2Practicals(int sem2Practicals) {
		this.sem2Practicals = sem2Practicals;
	}
	public int getSem1Total() {
		return sem1Total;
	}
	public void setSem1Total(int sem1Total) {
		this.sem1Total = sem1Total;
	}
	public int getSem2Total() {
		return sem2Total;
	}
	public void setSem2Total(int sem2Total) {
		this.sem2Total = sem2Total;
	}
	

}
