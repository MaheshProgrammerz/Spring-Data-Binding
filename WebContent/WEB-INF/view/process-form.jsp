<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
  <title>Employee Confirmation</title>
</head>
<body>
<h3>Employee Information DashBoard</h3>
<h5>Welcome : ${emp.fullName} </h5>

<h4>Employee Name : ${emp.fullName} </h4>
<h4>Employee Email: ${emp.email}  </h4>
<h4>Employee Dept: ${emp.fevDept }</h4>
<h5>Employee Good At</h5>
<ul>
	<c:forEach var = "temp" items = "${emp.programmingLng}">
	 <li>${temp}</li>
	</c:forEach>
	
</ul>

</body>
</html>