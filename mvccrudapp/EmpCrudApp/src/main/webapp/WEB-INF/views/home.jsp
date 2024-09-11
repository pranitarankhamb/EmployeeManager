<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <link href="<c:url value="/resources/style.css" />" rel="stylesheet">
      
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" /> 
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
       <div class="container-fluid">
           <nav class="navbar navbar-expand-lg bg-dark text-light mb-4 px-3 ">
    			<a class="nav-link active" aria-current="page" href="newdept">Add Department</a>
    			<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      				<span class="navbar-toggler-icon"></span>
    			</button>
    			<div class="collapse navbar-collapse" id="navbarNav">
      				<ul class="navbar-nav">
        				<li class="nav-item ">
         			 	<a class="nav-link active text-light " aria-current="page" href="viewd">View Department</a>
       				    </li>
       				    <li class="nav-item">
         				<a class="nav-link active text-light" href="newemp">Add Employee</a>
                        </li>
                        <li class="nav-item">
         				<a class="nav-link active text-light" href="viewemp">View Employee</a>
        				</li>
        				 <li class="nav-item">
         				<a class="nav-link active text-light" href="viewdeptwiseemp">ViewDeptWiseEmployee</a>
        				</li>
                   </ul>
               </div>
            </nav>
           </div>
	  <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
      <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"></script>
    </body>
    </body>
</html>
        
    </body>
</html>
