package com.internship.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Students {
	
	@Id
	private Integer rollno;
	private String name;
	private String standard;
	private String section;
	private String house;
	private String grades;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return "Students [rollno=" + rollno + ", name=" + name + ", standard=" + standard + ", section=" + section
				+ ", house=" + house + ", grades=" + grades + "]";
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getStandard() {
		return standard;
	}
	public void setStandard(String standard) {
		this.standard = standard;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getHouse() {
		return house;
	}
	public void setHouse(String house) {
		this.house = house;
	}
	public String getGrades() {
		return grades;
	}
	public void setGrades(String grades) {
		this.grades = grades;
	}
	
	

}
