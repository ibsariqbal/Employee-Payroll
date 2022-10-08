package com.bridgelabz.employeepayrollapp.dto;

import com.bridgelabz.employeepayrollapp.model.EmployeeData;

public class EmployeePayrollResponseDTO {
	private Long id;
	private String name;
	private String profilePic;
	private String gender;
	private String[] department;
	private int salary;
	private String startDate;
	private String note;

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public EmployeePayrollResponseDTO() {
	}

	public EmployeePayrollResponseDTO(EmployeeData employeeData) {
		super();
		this.id = employeeData.getId();
		this.name = employeeData.getName();
		this.profilePic = employeeData.getProfilePic();
		this.gender = employeeData.getGender();
		String deptString = employeeData.getDepartment();
		this.department = deptString.substring(1, deptString.length() - 1).split(", ");
		this.salary = employeeData.getSalary();
		this.startDate = employeeData.getStartDate();
		this.note=employeeData.getNote();
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

	public String[] getDepartment() {
		return department;
	}

	public void setDepartment(String[] department) {
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
