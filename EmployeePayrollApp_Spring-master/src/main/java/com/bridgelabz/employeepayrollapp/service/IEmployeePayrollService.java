package com.bridgelabz.employeepayrollapp.service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollResponseDTO;

public interface IEmployeePayrollService {
	EmployeePayrollResponseDTO addEmployee(EmployeePayrollDTO employeePayrollDTO);
	EmployeePayrollResponseDTO editEmployee(Long id, EmployeePayrollDTO employeePayrollDTO);
	EmployeePayrollResponseDTO[] getEmployees();
	void deleteEmployee(Long id);
}
