<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/staffview.css">
<link rel="stylesheet" href="css/customernavigation.css">
<title>View Staff</title>
</head>
<body>
<div class="navbar">
 <a class="active" href="#"><i class="fa fa-fw fa-home" class="split"></i> Home</a>
  <a href="#"><i class="fa fa-fw fa-book" class="split"></i> Booking</a>
  <a href="#"><i class="fa fa-fw fa-user" class="split"></i> Edit Profile</a>
   <li style="float:right"><a href="#"><i class="fa fa-sign-out" class="split"></i> Logout</a>
</div>
<div class="w3-container">
  <h2>CUSTOMER LIST</h2>
 
  <p>Search for a name customer in the input field.</p>
 <button class="btn"><i></i> Add New Customer</button><br><br>
  <input class="w3-input w3-border w3-padding" type="text" placeholder="Search for names.." id="myInput" onkeyup="myFunction()">
  
<table class="w3-table-all w3-margin-top" id="myTable">
    <tr>
      <th style="width:50%;">Name</th>
      <th style="width:20%;">Identity Card</th>
      <th style="width:30%;"></th>
    </tr>
    <tr>
      <td>Alfreds Futterkiste</td>
      <td>Germany</td>
      <td><button class="btn" href="staffviewcust.jsp" ><i></i> View</button><br><br></td>
    </tr>
     <tr>
      <td>Alfreds Futterkiste</td>
      <td>Germany</td>
      <td> <button class="btn"><i></i>View</button><br><br></td>
    </tr>
  </table>
</div>
<br><br>


<script>
function myFunction() {
  var input, filter, table, tr, td, i;
  input = document.getElementById("myInput");
  filter = input.value.toUpperCase();
  table = document.getElementById("myTable");
  tr = table.getElementsByTagName("tr");
  for (i = 0; i < tr.length; i++) {
    td = tr[i].getElementsByTagName("td")[0];
    if (td) {
      txtValue = td.textContent || td.innerText;
      if (txtValue.toUpperCase().indexOf(filter) > -1) {
        tr[i].style.display = "";
      } else {
        tr[i].style.display = "none";
      }
    }
  }
}
</script>

</body>
</html>
