<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@page import="java.text.DateFormat"%>
<%DateFormat df = new java.text.SimpleDateFormat("yyyy-MM-dd"); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link href="adminResources/css/all.min.css" rel="stylesheet">
<link href="adminResources/css/bootstrap.min.css" rel="stylesheet">
 <script src="adminResource/js/bootstrap.min.js"></script>


<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.9.1/jquery.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.js"></script>

</head>
<body>
 <div>
      <div class="row align-items-center" style="height:85vh;">
     
        <div class="border border-1 mx-auto col-10 col-md-4 col-sm-6">
         <h2 style="text-align:center">Add Todo</h2>
		<f:form action="save" post="Post" modelAttribute="TodoAppVO" id="validForm">
		<div class="mb-3">
		Title:<f:input  type="text" path="title" class="form-control" id="title"
                placeholder="Title..."  />
		<br />
		<br />
		</div>
		<div class="mb-3">
		 Target Date<f:input type="date" path="date" class="form-control" id="fromBookingDate" placeholder="dd/MM/yyyy" min="<%= df.format(new java.util.Date())%>"/>

 
   				<br/>
				<br/>
		</div>
		<div class="mb-3">
			Todo Status:<f:select class="form-control" path="status" id="status" >
											
												<option selected>Yes</option>
												<option>No</option>
											
										</f:select>
				<br />
				<br />
		</div>	
				<f:hidden path="id" />
				<div class="mt-1">	
					<button type="submit" class="btn btn-primary btn-customized mt-4"> Save</button> 
				</div>
			</f:form>
		</div>
	</div>
 </div>
		<script src="js/bootstrap.bundle.min.js"></script>
		<script src="jquery/jquery-3.6.4.min.js"></script>
		<script src="jquery/jquery.validate.min.js"></script>
</body>
</html>