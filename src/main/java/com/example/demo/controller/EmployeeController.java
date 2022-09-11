package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository emprepo;

	@PostMapping
	public Employee saveEmp(@RequestBody Employee employee) {
		return emprepo.save(employee);
	}

	@PutMapping
	public Employee updateEmp(@RequestBody Employee employee) {
		return emprepo.save(employee);
	}

	@DeleteMapping
	public String deleteEmp(@RequestParam Integer empId) {
		emprepo.deleteById(empId);
		return "deleted successfully";
	}

	
	  @GetMapping ("/fetch-all")
	  public List<Employee> getAllEmp(@RequestBody Employee employee) {
	  return emprepo.findAll(); 
	  }
	 
	@GetMapping
	public Optional<Employee> getAllEmp(@RequestParam Integer empId) {
		return emprepo.findById(empId);
	}
}
