package com.mycompany.demo.service;

import java.sql.Date;
import java.util.List;
import java.util.Random;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mycompany.demo.dao.EmployeeRepo;
import com.mycompany.demo.dao.EmployeeViewRepo;
import com.mycompany.demo.model.Employee;
import com.mycompany.demo.model.EmployeeView;

@Service
public class EmployeeService {
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Autowired
	private EmployeeViewRepo employeeViewRepo;
	
	public String findMasterById() {
		logger.debug("findMasterById is invoked....");
		return "Find Master By Id";
	}
	
	public List<Employee> getAllEmployees(){
		return (List<Employee>) employeeRepo.findAll();
	}
	
	public List<EmployeeView> getAllEmployeesView(){
		return (List<EmployeeView>) employeeViewRepo.findAll();
	}
	
	public String addEmployee() {
		
		Random random = new Random();
		int id = random.nextInt(50);
		Date dateOfBirth = new Date(random.nextInt());
		String name =new String("New Name" + id);

		Employee emp  = new Employee();
		
		emp.setId(id);
		emp.setName(name);
		emp.setDateOfBirth(dateOfBirth);
		emp.setStatus(random.nextBoolean());
		
		employeeRepo.save(emp);
		
		return "Success";
	}

}
