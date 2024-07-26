<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
         <h1>Fill the Employee Details</h1>
         
       <form action="addEmployee" method="post">
       
        Enter the EmployeeNumber
        <input type="text" id="name" name="EmployeeNumber"><br><br>
        
         Enter the EmployeeName
        <input type="text" id="name" name="EmployeeName"><br><br>
        
         Enter the EmployeeSalary
        <input type="text" id="name" name="EmployeeSalary"><br><br>
        
         Enter the DeptNumber
        <input type="text" id="name" name="DeptNumber"><br><br>
        
         Enter the Job Position
        <input type="text" id="name" name="JobPosition"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>