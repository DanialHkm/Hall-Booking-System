<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/ABooking.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/customernavigation.css"> 
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Staff</title>
</head>

	<style>
	table {
	  font-family: arial, sans-serif;
	  border-collapse: collapse;
	  width: 95%;
	  margin:auto;
	}
	
	td, th {
	  border: 1px solid #dddddd;
	  text-align: center;
	  padding: 8px;
	}
	
	tr:nth-child(even) {
	  background-color: #dddddd;
	}
	.button {
	  border: none;
	  color: #3A9BDC;
	  padding: 10px 22px;
	  text-align: center;
	  text-decoration: none;
	  display: inline-block;
	  font-size: 16px;
	  margin: 2px 2px;
	  transition-duration: 0.4s;
	  cursor: pointer;
	}
	.button2 {
	  background-color: #52BE80; 
	  color: black; 
	  border: 2px solid #52BE80;
	}
	
	.button2:hover {
	  background-color: #52BE80;
	  color: black;
	}
	</style>
<body>
<%@page import="Servicer.servicerDAO,Servicer.servicer,java.util.*"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>  
   
<%  
List<servicer> list=servicerDAO.getAllRecords();  
request.setAttribute("list",list);  
%> 

	<div class="navbar"> 
	 <a href="#"><i class="fa fa-home" class="split"></i> Home</a> 
	 <a href="#"><i class="" class="split"></i> Assets</a> 
	 <a href="#"><i class="" class="split"></i> Maintenance</a> 
	 <a class="active" href="#"><i class="" class="split"></i> Servicer</a> 
	 <a href="#"><i class="" class="split"></i> Booking</a> 
	 <a href="#"><i class="fa fa-users" class="split"></i> Staff</a>
	 <a href="#"><i class="fa fa-users" class="split"></i> Customer</a> 
   <li style="float:right"><a href="#"><i class="fa fa-sign-out" class="split"></i> Logout</a> 
</div>
		<br></br>
		<table>
		<br>
		<br>
		<thead>
		  <tr>
		  	<th>ID</th>
		  	<th>NAME</th>
		    <th>TELEPHONE NUMBER</th>
		    <th>ADDRESS</th>
		    <th>ACTION</th>
		  </tr>
		 </thead>  
		<tbody>
		  <tr>
		   <c:forEach items="${list}" var="se">  
		   	<td>${se.getServicerID()}</td>
		   	<td>${se.getServicerName()}</td>
			<td>0${se.getServicerTelNo()}</td>
			<td>${se.getServicerHomeNo()}, ${se.getServicerAddress()}, ${se.getServicerCity()}, ${se.getServicerPostcode()}, ${se.getServicerState()}.</td> 
			<td>
			<a href="ServicerUpdate.jsp?servicerID=${se.getServicerID()}"><button class='edit'>EDIT</button> </a> 
			</td>
			</tr>  
			</tbody>
			</c:forEach> 
		  
		</table>
		<br></br>
	
		<a style="float:left"href="ServicerAdd.jsp" ><button class="button button2">ADD STAFF</button></a>

</body>
</html>