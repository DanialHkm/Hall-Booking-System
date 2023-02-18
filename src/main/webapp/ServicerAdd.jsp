<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="Form.css" rel="stylesheet" type="text/css">
<title>Staff Registration Form</title>
</head>
<body>
	<div class="container" style=text-align:center>
  	<form action="ServicerAddFunction.jsp" method="post" id="wizard">
  	<h2>REGISTER NEW SERVICER</h2>
  	
	<br><br>    
	<label for="servicerName">NAME: </label><br>
    <input type="text"  name="servicerName" id="servicerName" required><br>
    
    <label for="servicerTelNo">TELEHONE NUMBER:</label><br>
    <input type="text"  name="servicerTelNo" id="servicerTelNo" required><br>
    
    <label for="servicerHomeNo">HOME NUMBER:</label><br>
    <input type="text"  name="servicerHomeNo" id="servicerHomeNo" required><br>
    
    <label for="servicerAddress">ADDRESS: </label><br>
    <input type="text" name="servicerAddress" id="servicerAddress" required><br>
    
    <label for="servicerCity">CITY:</label><br>
    <input type="text"  name="servicerCity" id="servicerCity" required><br>
    
    <label for="servicerPostcode">POSTCODE:</label><br>
    <input type="text"  name="servicerPostcode" id="servicerPostcode" required><br>
    
    <label for="servicerState">STATE: </label><br>
    <select id="servicerState" name = "servicerState" class = "custom-select" required>
		<option value=""></option>	
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
	
    <input type="submit" value="CREATE ACCOUNT">
    <br>
  </form>
</div>

</body>
</html>