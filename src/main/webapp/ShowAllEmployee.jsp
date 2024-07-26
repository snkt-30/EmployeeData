<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>   
        <h1>Employee List</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>Position</th>
        </tr>
        <c:forEach var="employee" items="${employeeList}">
            <tr>
                <td>${employee.EmployeeName}</td>
                <td>${employee.EmployeeNumber}</td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>