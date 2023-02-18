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
<%@page import="Servicer.servicerDAO,Servicer.servicer"%>  
  
<%  
String servicerID=request.getParameter("servicerID");  
servicer s=servicerDAO.getRecordById(Integer.parseInt(servicerID));  
%>   
  
	<div class="container" style=text-align:center>
  	<form action="ServicerUpdateFunction.jsp" method="post">
  	<h2>UPDATE SERVICER</h2>
  	<input type="hidden" name="servicerID" value="<%=s.getServicerID() %>"/>
			
	<br><br>    
	<label for="servicerName">NAME: </label><br>
    <input type="text"  name="servicerName" value="<%=s.getServicerName() %>" ><br>
    
    <label for="servicerTelNo">EMAIL:</label><br>
    <input type="text"  name="servicerTelNo" value="<%=s.getServicerTelNo() %>" ><br>

    
    <label for="servicerHomeNo">HOME NUMBER:</label><br>
    <input type="text"  name="servicerHomeNo" value="<%=s.getServicerHomeNo() %>" ><br>

    
    <label for="servicerAddress">ADDRESS: </label><br>
    <input type="text" name="servicerAddress" value="<%=s.getServicerAddress() %>" ><br>

    
    <label for="servicerCity">CITY:</label><br>
    <input type="text"  name="servicerCity" value="<%=s.getServicerCity() %>" ><br>

    
    <label for="servicerPostcode">POSTCODE:</label><br>
    <input type="text"  name="staffPostcode" value="<%=s.getServicerPostcode() %>" ><br>
 
    
    <label for="servicerState">STATE: </label><br>
    <select id="servicerState" name = "servicerState"  class = "custom-select" >
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
    
    <br>
	
    <button class="button" value="Submit" name="submit">SUBMIT</button>
    <br>
  </form>
</div>

</body>
</html>