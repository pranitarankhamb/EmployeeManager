<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:include page="home.jsp" />
<br><br>
<form name='frm' action='save' method='POST'>
 <ul id="formControl">
   <li><input type='text' name='name'/></li>
   <li><input type='submit' name='s' value='Add New Dept'/></li>
   <li>${msg}</li>
 </ul>
 </form>
</body>
</html>