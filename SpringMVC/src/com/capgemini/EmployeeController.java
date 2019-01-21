package com.capgemini;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.capgemini.dto.Employee;
import com.capgemini.service.EmployeeService;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;

@Controller
public class EmployeeController {
	@RequestMapping(value = "/", method = RequestMethod.GET)
	   public String home() {
	      return "index";
	   }
   @RequestMapping(value = "/form", method = RequestMethod.GET)
   public ModelAndView student() {
      return new ModelAndView("form", "command", new Employee());
   }
   @RequestMapping(value = "/addEmployee", method = RequestMethod.POST)
      public String addEmployee(@ModelAttribute()Employee employee, 
   
   ModelMap model) {
	  
      new EmployeeService().addEmployeeService(employee);
      return "index";
   }
   @RequestMapping(value = "/display", method = RequestMethod.GET)
   public ModelAndView display() {
	   ModelAndView model = new ModelAndView("display");
	   model.addObject("listOfEmployees",new EmployeeService().getEmployeeService());
      return model;
   }
   @RequestMapping(value="/delete", method = RequestMethod.GET)
   public ModelAndView delete()
   {
	   return new ModelAndView("delete", "command", new Employee());
   }
   @RequestMapping(value="/deleteId", method=RequestMethod.POST)
   public String deleteId(@ModelAttribute("del")Employee emp)
   {
	   System.out.println(emp.getId());
	   new EmployeeService().deleteEmployeeService(emp);
	   return "index";
   }
}