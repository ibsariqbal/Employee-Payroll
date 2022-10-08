package com.bridgelabz.employeepayrollapp.model;

import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.bridgelabz.employeepayrollapp.dto.EmployeePayrollDTO;

@Entity
@Table(name="EMPLOYEES")
public class EmployeeData {

	@Id
	private Long id;
	private String name;
	private String profilePic;
	private String gender;
	private String department;
	private int salary;
	private String startDate;
	private String note;
	
	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public EmployeeData() {}
	
	public EmployeeData(Long id, EmployeePayrollDTO employeePayrollDTO) {
		this.id=id;
		this.name = employeePayrollDTO.getName();
		this.profilePic = employeePayrollDTO.getProfilePic();
		this.gender = employeePayrollDTO.getGender();
		this.department = Arrays.asList(employeePayrollDTO.getDepartment()).toString();
		this.salary = employeePayrollDTO.getSalary();
		this.startDate = employeePayrollDTO.getStartDate();
		this.note=employeePayrollDTO.getNote();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getStartDate() {
		return startDate;
	}
	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
}
