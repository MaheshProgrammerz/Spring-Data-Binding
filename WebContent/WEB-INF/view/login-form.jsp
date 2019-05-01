<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm" modelAttribute="emp">
	
		Employee name: <form:input path="fullName" />
		
		<br><br>
	
		Employee Email: <form:input path="email" />
		
		<br><br>
	
		Employee Dept:
		
		<form:radiobuttons path="fevDept" items="${emp.fevDeptOptions}"  />

		<br><br>
		
		Emp Fev Programming Language:
		Java<form:checkbox path="programmingLng" value="Java"/>
		C++<form:checkbox path="programmingLng" value="C++"/>
		Python<form:checkbox path="programmingLng" value="Python"/>
		JavaScript<form:checkbox path="programmingLng" value="JavaScript"/>
		
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>