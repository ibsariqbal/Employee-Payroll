package com.bridgelabz.employeepayrollapp.dto;

public class EmployeePayrollDTO {

	private String name;
	private String profilePic;
	private String gender;
	private String[] department;
	private int salary;
	private String startDate;
	private String note;
	
	public EmployeePayrollDTO() {
	}
	
	public EmployeePayrollDTO(String name, String profilePic, String gender, String[] department, int salary,
			String startDate, String note) {
		super();
		this.name = name;
		this.profilePic = profilePic;
		this.gender = gender;
		this.department = department;
		this.salary = salary;
		this.startDate = startDate;
		this.note=note;
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
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}

	
	
}
