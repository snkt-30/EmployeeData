package com.TillBreak.EmployeeData.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.servlet.ModelAndView;

import com.TillBreak.EmployeeData.Models.EmployeeModel;
import com.TillBreak.EmployeeData.Services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("addEmployee")
	public boolean addEmployee(@RequestBody EmployeeModel newemployee) {
		
		System.out.println(newemployee);
		boolean res = employeeService.addEmployee(newemployee);
		return res;
	}
	
	@GetMapping("getEmployee")
	public List<EmployeeModel> getAllEmployee(){
		
		List<EmployeeModel> empList = employeeService.getAllEmployee();
		return empList;
	}
	
	@GetMapping("getEmployee/{eId}")
	public EmployeeModel getEmployeeById(@PathVariable("eId") int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
	@PutMapping("updateEmployee")
	public int updateEmployee(@RequestBody EmployeeModel employee) {	
           return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("deleteEmployee/{eId}")
	public int deleteEmployee(@PathVariable("eId") int employeeId) {
		
		return employeeService.deleteEmployee(employeeId);
	}
	
	@PostMapping("test")
	public void test(@RequestBody EmployeeModel model) {
		System.out.println(model);
		employeeService.addEmployee(model);
	}
}
