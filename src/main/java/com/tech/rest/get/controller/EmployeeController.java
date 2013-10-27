package com.tech.rest.get.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tech.rest.get.model.EmployeeDetails;
import com.tech.rest.get.model.EmployeeList;

@Controller
@RequestMapping("/employee/*")
public class EmployeeController {
	
	@RequestMapping(method = RequestMethod.GET, value = "listAllDetails", headers="Accept=*/*")
	public ModelAndView getAllEmployee()
    {
		EmployeeList employeeList = new EmployeeList();
		
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setEmpId("001");
		emp1.setEmpName("eName1");
		
		EmployeeDetails emp2 = new EmployeeDetails();
		emp2.setEmpId("002");
		emp2.setEmpName("eName2");
		
		employeeList.setEmployeeDetails(new ArrayList<EmployeeDetails>());
		employeeList.getEmployeeDetails().add(emp1);
		employeeList.getEmployeeDetails().add(emp2);
		
		return new ModelAndView("employeeView", "EmployeeList",
				employeeList);
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "listDetails/{id}", headers="Accept=*/*")
	public ModelAndView getEmployee(@PathVariable String id)
    {
		EmployeeDetails emp1 = new EmployeeDetails();
		emp1.setEmpId(id);
		emp1.setEmpName("eName-" + id);
		
		return new ModelAndView("employeeView", "EmployeeDetails",
				emp1);
    }
	
	@RequestMapping(method = RequestMethod.GET, value = "getAllDetailsPage")
	public ModelAndView showHelloScreen() {
		ModelAndView view = new ModelAndView("employee" + "/employeeDetails");
		return view;
	}	

}
