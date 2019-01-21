package com.capgemini.dto;
public class Employee {

	private String name;
	private Integer id;
	private String designation;
	private double salary;

	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getId() {
		return id;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id +" "+name +" "+designation+" "+salary;
	}
}