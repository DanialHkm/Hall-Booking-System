<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/ABooking.css" rel="stylesheet" type="text/css">
<link rel="stylesheet" href="css/customernavigation.css"> 
<link rel="stylesheet" href="css/bookingForm.css">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css"> 
	
	<title>Edit Booking</title>
	</head>

<body>
<%@page import="booking.bookingDao,booking.booking"%>  
  
<%  
String bookingID=request.getParameter("bookingID");  
booking b=bookingDao.getRecordById(Integer.parseInt(bookingID));  
%>  
<div class="navbar"> 
 <a href="#"><i class="fa fa-home" class="split"></i> Home</a> 
 <a href="#"><i class="" class="split"></i> Assets</a> 
 <a href="#"><i class="" class="split"></i> Maintenance</a> 
 <a href="#"><i class="" class="split"></i> Servicer</a> 
 <a class="active" href="#"><i class="" class="split"></i> Booking</a> 
 <a href="#"><i class="fa fa-users" class="split"></i> Customer</a> 
   <li style="float:right"><a href="#"><i class="fa fa-sign-out" class="split"></i> Logout</a> 
</div>
  
<div class="wrapper">
				<div class="form-container">
				<h2 style="text-align:center;"> EDIT BOOKING</h2> 
				<br></br> 
				<form action="editBookingProcess.jsp" method="post">  
				<input type="hidden" name="id" value="<%=b.getBookingID() %>"/>  
				     <div class="input-name">
				     	 Date: 
						<input type="date" name="name" value="<%= b.getBookingDate()%>"/>  
						</div><br>
						
				    <div class="input-time">
						Time: 
						<input type="time" name="time" value="<%= b.getBookingTime()%>"/>  				    
					</div><br>
					
					<div class="input-capacity">
						Capacity: 
						<input type="text" name="capacity" value="<%= b.getBookingEstimateCapacity()%>"/>  				    
					</div><br>
					
					<div class="input-description">
						Description:
						<input type="text" name="description" value="<%= b.getBookingDescription()%>"/>
					</div><br>
					
					<div class="input-description">
						Price:
						<input type="text" name="description" value="<%= b.getBookingPrice()%>"/>
					</div><br>
					
					<button class="button" name="submit">EDIT </button>
				</form>
				
            </div>
         </div>

		<a href="staffViewBooking.jsp"><button class=" button2">BACK</button></a> 
		 
	
</body>
</html>

