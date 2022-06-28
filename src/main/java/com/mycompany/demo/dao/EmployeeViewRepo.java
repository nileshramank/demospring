package com.mycompany.demo.dao;

import org.springframework.stereotype.Repository;

import com.mycompany.demo.model.Employee;
import com.mycompany.demo.model.EmployeeView;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

@Repository
public interface EmployeeViewRepo extends CrudRepository<EmployeeView, Integer>{
}
//pojo