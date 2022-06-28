package com.mycompany.demo.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.demo.model.Employee;
import com.mycompany.demo.model.EmployeeView;
import com.mycompany.demo.service.EmployeeService;

@RestController
@RequestMapping("/api")
public class EmployeeController {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping(path="/emp", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<Employee> getMasterById() {
		//Call the service to get the required data
		employeeService.addEmployee();
		return employeeService.getAllEmployees();
		
	}
	
	@GetMapping(path="/empview", produces = "application/json; charset=UTF-8")
	@ResponseBody
	public List<EmployeeView> getEmployeeView() {
		//Call the service to get the required data
		return employeeService.getAllEmployeesView();
		
	}

}
