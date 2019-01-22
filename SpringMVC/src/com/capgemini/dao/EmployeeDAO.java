package com.capgemini.dao;

import java.util.ArrayList;

import com.capgemini.dto.Employee;

public class EmployeeDAO {

	private static ArrayList<Employee> employeesList = new ArrayList<Employee>(); 
	public void addEmployeeDAO(Employee employee)
	{
		EmployeeDAO.employeesList.add(employee);
		//if(employeesList!=null)
		//System.out.println(employeesList);
	}
	public ArrayList<Employee> getEmployeeDAO()
	{
		//if(employeesList!=null)
		//System.out.println(employeesList);
		return employeesList;
	}
	
	public void deleteEmployeeDAO(Employee employee)
	{
		for(int i=0;i<employeesList.size();i++)
		{
			if(employeesList.get(i).getId()==employee.getId())
			{
				employeesList.remove(i);
			}
		}
	}
	public Employee searchEmployeeDAO(Employee employee)
	{
		for (Employee emp : employeesList) {
			if(emp.getId()==employee.getId())
			{
				return emp;
			}
		}
		return null;
	}
	public void updateEmployeeDAO(Employee employee)
	{
		for(int i=0;i<employeesList.size();i++)
		{
			if(employeesList.get(i).getId()==employee.getId())
			{
				employeesList.remove(i);
				employeesList.add(employee);
			}
		}
	}
}
