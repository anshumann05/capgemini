package com.capgemini.service;

import java.util.ArrayList;

import com.capgemini.dao.EmployeeDAO;
import com.capgemini.dto.Employee;

public class EmployeeService {
	
	public void addEmployeeService(Employee employee)
	{
		new EmployeeDAO().addEmployeeDAO(employee);
	}
	public ArrayList<Employee> getEmployeeService()
	{
		ArrayList<Employee> e =  new EmployeeDAO().getEmployeeDAO();
		//System.out.println(e);
		return e;
	}
	
	public void deleteEmployeeService(Employee employee)
	{
		new EmployeeDAO().deleteEmployeeDAO(employee);
	}
	public Employee searchEmployeeService(Employee employee)
	{
		return new EmployeeDAO().searchEmployeeDAO(employee);
	}
	public void updateEmployeeService(Employee employee)
	{
		new EmployeeDAO().updateEmployeeDAO(employee);
	}

}
