package com.TillBreak.EmployeeData.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TillBreak.EmployeeData.Models.EmployeeModel;
import com.TillBreak.EmployeeData.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	
	// Add the Employee
	public boolean addEmployee(EmployeeModel employee) {
		
		boolean res = employeeRepository.addEmployee(employee);
		return res;
	}

	
	// Get the Employee
	public List<EmployeeModel> getAllEmployee() {	
		 return employeeRepository.getAllEmployee();
	}
	
	//Get the employeeById
	public EmployeeModel getEmployeeById(int employeeId) {
		return employeeRepository.getEmployeeById(employeeId);
	}

	// Update the employee
	public int updateEmployee(EmployeeModel employee) {
		    int updatedEmployee = employeeRepository.updateEmployee(employee);
		    return updatedEmployee;
	}
	
	// Delete the employee
	public int deleteEmployee(int employeeId) {
		return employeeRepository.deleteEmployee(employeeId);
	}

}
