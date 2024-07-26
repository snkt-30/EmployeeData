package com.TillBreak.EmployeeData.Models;

public class EmployeeModel {
	
	
	private int employeeNumber;
	private String employeeName;
	private String jobPosition;
	private int employeeSalary;
	private int deptNumber;
	public int getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getJobPosition() {
		return jobPosition;
	}
	public void setJobPosition(String jobPosition) {
		this.jobPosition = jobPosition;
	}
	public int getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(int employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public int getDeptNumber() {
		return deptNumber;
	}
	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}
	@Override
	public String toString() {
		return "EmployeeModel [employeeNumber=" + employeeNumber + ", employeeName=" + employeeName + ", jobPosition="
				+ jobPosition + ", employeeSalary=" + employeeSalary + ", deptNumber=" + deptNumber + "]";
	}
	public EmployeeModel(int employeeNumber, String employeeName, String jobPosition, int employeeSalary,
			int deptNumber) {
		super();
		this.employeeNumber = employeeNumber;
		this.employeeName = employeeName;
		this.jobPosition = jobPosition;
		this.employeeSalary = employeeSalary;
		this.deptNumber = deptNumber;
	}

	
	public EmployeeModel() {
		
	}
}
