<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp"></jsp:include>

<table border="5" align="center">
<tr>
<th>DEPTID</th>
<th>DEPTNAME</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>
<c:forEach var="d" items="${deptList}">
<tr align="center">
<td>${d.getId()}</td>
<td>${d.getName()}</td>
<td><a href=''>DELETE</a></td>
<td><a href=''>UPDATE</a></td>
</tr>
</c:forEach>
</table>

</body>
</html>