package com.TillBreak.EmployeeData;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.TillBreak.EmployeeData.Controllers.EmployeeController;
import com.TillBreak.EmployeeData.Models.EmployeeModel;

@SpringBootApplication
public class EmployeeDataApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(EmployeeDataApplication.class, args);
		
		 EmployeeController employeeController = context.getBean(EmployeeController.class);
	}
}
