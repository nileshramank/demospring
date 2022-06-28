package com.mycompany.demo.dao;

import org.springframework.stereotype.Repository;

import com.mycompany.demo.model.Employee;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{
}
