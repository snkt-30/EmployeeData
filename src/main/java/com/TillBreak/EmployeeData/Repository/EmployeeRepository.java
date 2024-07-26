package com.TillBreak.EmployeeData.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.TillBreak.EmployeeData.Helper.EmployeerRowMapper;
import com.TillBreak.EmployeeData.Models.EmployeeModel;
import java.util.*;


@Repository
public class EmployeeRepository {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	
	
	public JdbcTemplate getJdbc() {
		return jdbc;
	}


	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}


	// Add the Employee
	public boolean addEmployee(EmployeeModel employee) {
		String qry = "insert into employee values(?,?,?,?,?)";
		int res = jdbc.update(qry,employee.getEmployeeNumber(),employee.getEmployeeName(),employee.getEmployeeSalary(),
				        employee.getDeptNumber(), employee.getJobPosition());	
		return (res==1)?true:false;
	}
	
	
	//Get all the employee
	public List<EmployeeModel> getAllEmployee() {
	       String sql = "SELECT * FROM employee";
	       return jdbc.query(sql, new EmployeerRowMapper());
	}
	
	//Get the employee By Id
	public EmployeeModel getEmployeeById(int employeeId) {
		String sql = "Select * from employee where EmployeeNumber=?";
		return  jdbc.queryForObject(sql, new Object[] {employeeId}, new EmployeerRowMapper());
	}
	
	// Update Employee
	public int updateEmployee(EmployeeModel employee) {
		
		String sql = "update employee set EmployeeSalary=? DeptNumber=? JobPosition=?";
		return jdbc.update(sql,employee.getEmployeeSalary(),employee.getDeptNumber(),employee.getJobPosition());
	}
	
	// Delete the employee
	public int deleteEmployee(int employeeId) {
		String sql = "delete from employee where EmployeeNumber=?";
		return jdbc.update(sql,employeeId);
	}

}
