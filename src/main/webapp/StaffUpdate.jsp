<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="Form.css" rel="stylesheet" type="text/css">
<title>Staff Update Form</title>
</head>
<body>
<%@page import="Staff.staffDAO,Staff.staff"%>  
  
<%  
String staffID=request.getParameter("staffID");  
staff s=staffDAO.getRecordById(Integer.parseInt(staffID));  
%>   
  
	<div class="container" style=text-align:center>
  	<form action="StaffUpdateFunction.jsp" method="post">
  	<h2>UPDATE STAFF ACCOUNT</h2>
  	<input type="hidden" name="staffID" value="<%=s.getStaffID() %>"/>
			
	<br><br>    
	<label for="staffName">NAME: </label><br>
    <input type="text"  name="staffName" value="<%=s.getStaffName() %>" ><br>
    
    <label for="staffEmail">EMAIL:</label><br>
    <input type="email"  name="staffEmail" value="<%=s.getStaffEmail() %>" ><br>

    
    <label for="staffHomeNo">HOME NUMBER:</label><br>
    <input type="text"  name="staffHomeNo" value="<%=s.getStaffHomeNo() %>" ><br>

    
    <label for="staffAddress">ADDRESS: </label><br>
    <input type="text" name="staffAddress" value="<%=s.getStaffAddress() %>" ><br>

    
    <label for="staffCity">CITY:</label><br>
    <input type="text"  name="staffCity" value="<%=s.getStaffCity() %>" ><br>

    
    <label for="staffPostcode">POSTCODE:</label><br>
    <input type="text"  name="staffPostcode" value="<%=s.getStaffPostcode() %>" ><br>
 
    
    <label for="staffState">STATE: </label><br>
    <select id="staffState" name = "staffState"  class = "custom-select" >
		<option value="" ></option>	
		<option value="JOHOR">JOHOR</option>
		<option value="MELAKA">MELAKA</option>
		<option value="KEDAH">KEDAH</option>
		<option value="KELANTAN">KELANTAN</option>
		<option value="NEGERI SEMBILAN">NEGERI SEMBILAN</option>
		<option value="PAHANG">PAHANG</option>
		<option value="PERAK">PERAK</option>
		<option value="PERLIS">PERLIS</option>
		<option value="SELANGOR">SELANGOR</option>
		<option value="TERENGGANU">TERENGGANU</option>
		<option value="PULAU PINANG">PULAU PINANG</option>
		<option value="SABAH">SABAH</option>
		<option value="SARAWAK">SARAWAK</option>
		<option value="KUALA LUMPUR">KUALA LUMPUR</option>
		<option value="PUTRAJAYA">PUTRAJAYA</option>
	</select><br>
    
    <label for="staffTelNum">TELEPHONE NO: </label><br>
    <input type="text" name="staffTelNum" value="<%=s.getStaffTelNum() %>" ><br>

    
    <label for="staffPass">PASSWORD:</label><br>
    <input type="password" name="staffPass" value="<%=s.getStaffPass() %>" ><br>

    
    <label for="adminID">ADMIN ID:</label><br>
    <input type="text" name="adminID" value="<%=s.getAdminID() %>" ><br>

    <br>
	
    <button class="button" value="Submit" name="submit">SUBMIT</button>
    <br>
  </form>
</div>

</body>
</html>