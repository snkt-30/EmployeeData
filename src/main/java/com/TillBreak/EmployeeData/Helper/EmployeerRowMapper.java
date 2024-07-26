package com.TillBreak.EmployeeData.Helper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.TillBreak.EmployeeData.Models.EmployeeModel;

public class EmployeerRowMapper implements RowMapper<EmployeeModel> {

	@Override
	public EmployeeModel mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		EmployeeModel employee= new EmployeeModel();
		
		employee.setEmployeeNumber(rs.getInt("EmployeeNumber"));
		employee.setEmployeeName(rs.getString("EmployeeName"));
		employee.setEmployeeSalary(rs.getInt("EmployeeSalary"));
		employee.setDeptNumber(rs.getInt("DeptNumber"));
		employee.setJobPosition(rs.getString("JobPosition"));
		
		return employee;
		
		
	}
	
}
