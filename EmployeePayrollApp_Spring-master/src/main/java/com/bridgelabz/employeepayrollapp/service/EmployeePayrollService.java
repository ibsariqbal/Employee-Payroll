package com.bridgelabz.employeepayrollapp.service;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;
import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollResponseDTO;
import com.bridgelabz.employeepayrollapp.model.EmployeeData;
import com.bridgelabz.employeepayrollapp.repository.EmployeePayrollRepository;

@Service
public class EmployeePayrollService implements IEmployeePayrollService{

	@Autowired
	private EmployeePayrollRepository employeePayrollRepository;
	private final AtomicLong counter=new AtomicLong();
	@Override
	public EmployeePayrollResponseDTO addEmployee(EmployeePayrollDTO employeePayrollDTO) {
		return new EmployeePayrollResponseDTO(employeePayrollRepository.save(new EmployeeData(counter.incrementAndGet(), employeePayrollDTO)));
	}

	@Override
	public EmployeePayrollResponseDTO editEmployee(Long id, EmployeePayrollDTO employeePayrollDTO) {
		return new EmployeePayrollResponseDTO(employeePayrollRepository.save(new EmployeeData(id, employeePayrollDTO)));

	}

	@Override
	public EmployeePayrollResponseDTO[] getEmployees() {
		List<EmployeeData> employeesList = employeePayrollRepository.findAll();
		EmployeePayrollResponseDTO[] employeeDatas=new EmployeePayrollResponseDTO[employeesList.size()];
		for(int i=0;i<employeeDatas.length;i++) {
			employeeDatas[i]=new EmployeePayrollResponseDTO(employeesList.get(i));
		}
		counter.set(employeeDatas[employeeDatas.length-1].getId());
		return employeeDatas;
	}

	@Override
	public void deleteEmployee(Long id) {
		employeePayrollRepository.deleteById(id);
	}

}
