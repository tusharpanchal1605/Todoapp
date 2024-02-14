<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="adminResources/css/all.min.css" rel="stylesheet">
<link href="adminResources/css/bootstrap.min.css" rel="stylesheet">
 <script src="adminResource/js/bootstrap.min.js"></script>
<style>
@media only screen and (min-width: 600px) {
   .navbar {
    height: 100px; 
   }
}
@media only screen and (min-width: 768px) {
   .navbar {
    height: 100px; 
  } 
}
}
</style>
</head>
<body class="ms-body ms-aside-left-open ms-primary-theme ms-has-quickbar">
<jsp:include page="home.jsp"></jsp:include>
	<div class="ms-panel">
						<div class="ms-panel-header">
						<center>
							<h3>Todo Details</h3>
						</div>
						<div class="ms-panel-body">
							<div class="table-responsive">
								<table id="data-table-3" class="table table-hover w-100">
									<thead>
										<tr>
											<th>Title</th>
											<th>Date</th>
											<th>Status</th>
											<th>Action</th>
										</tr>
									</thead>
									<tbody>
										<c:forEach items="${todoList}" var="d">
										<tr>
											<td>${d.title}</td>
											<td>${d.date}</td>
											<td>${d.status}</td>
											<td><a href="editTodo?id=${d.id}">
											<i class="fa fa-edit text-info lead mr-2"></i>
											</a>
											 <a href="deleteTodo?id=${d.id}">
											 <i class="fa fa-trash"></i>
											 </a></td>
										</tr>
									</c:forEach>
	
																
	
									</tbody>
								</table>
							</div>
						</div>
					</center>
					</div>
</body>
</html>