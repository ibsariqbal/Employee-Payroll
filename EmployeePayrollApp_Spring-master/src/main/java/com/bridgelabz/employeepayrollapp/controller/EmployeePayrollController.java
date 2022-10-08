package com.bridgelabz.employeepayrollapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollResponseDTO;
import com.bridgelabz.employeepayrollapp.service.IEmployeePayrollService;
import com.google.gson.Gson;

@CrossOrigin
@RestController
@RequestMapping("/employees")
public class EmployeePayrollController {
	
	@Autowired
	private IEmployeePayrollService employeePayrollService;

	@GetMapping("/")
	public ResponseEntity<String> getEmployees(){
		EmployeePayrollResponseDTO[] employeePayrollResponses=employeePayrollService.getEmployees();
		if(employeePayrollResponses.length!=0) {
			return new ResponseEntity<String>(new Gson().toJson(employeePayrollResponses, EmployeePayrollResponseDTO[].class),HttpStatus.OK);
		}else {
			return new ResponseEntity<String>("[]",HttpStatus.OK);
		}
	}
	
	@PostMapping("/")
	public ResponseEntity<String> addEmployee(@RequestBody EmployeePayrollDTO employeePayrollDTO){
		return new ResponseEntity<String>(new Gson().toJson(employeePayrollService.addEmployee(employeePayrollDTO), EmployeePayrollResponseDTO.class),HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<String> editEmployee(@PathVariable Long id, @RequestBody EmployeePayrollDTO employeePayrollDTO){
		return new ResponseEntity<String>(new Gson().toJson(employeePayrollService.editEmployee(id, employeePayrollDTO), EmployeePayrollResponseDTO.class),HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable Long id){
		try {
			employeePayrollService.deleteEmployee(id);
			return new ResponseEntity<String>("Employee Data Deleted Successfully",HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<String>("Employee Data Unavailable",HttpStatus.NOT_FOUND);
		}
	}
}
