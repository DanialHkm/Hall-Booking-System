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
  	<form action="StaffAddFunction.jsp" method="post" id="wizard">
  	<h2>REGISTER NEW STAFF ACCOUNT</h2>
  	
	<br><br>    
	<label for="staffName">NAME: </label><br>
    <input type="text"  name="staffName" id="staffName" required><br>
    
    <label for="staffEmail">EMAIL:</label><br>
    <input type="email"  name="staffEmail" id="staffEmail" required><br>
    
    <label for="staffHomeNo">HOME NUMBER:</label><br>
    <input type="text"  name="staffHomeNo" id="staffHomeNo" required><br>
    
    <label for="staffAddress">ADDRESS: </label><br>
    <input type="text" name="staffAddress" id="staffAddress" required><br>
    
    <label for="staffCity">CITY:</label><br>
    <input type="text"  name="staffCity" id="staffCity" required><br>
    
    <label for="staffPostcode">POSTCODE:</label><br>
    <input type="text"  name="staffPostcode" id="staffPostcode" required><br>
    
    <label for="staffState">STATE: </label><br>
    <select id="staffState" name = "staffState" class = "custom-select" required>
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
    
    <label for="staffTelNum">TELEPHONE NO: </label><br>
    <input type="text" name="staffTelNum" id="staffTelNum" required><br>
    
    <label for="staffPass">PASSWORD:</label><br>
    <input type="password" name="staffPass" id="staffPass" required><br>
    
    <br>
    <input type="hidden" name="adminID" id="adminID" value="1"><br>
    <br>
	
    <input type="submit" value="CREATE ACCOUNT">
    <br>
  </form>
</div>

</body>
</html>