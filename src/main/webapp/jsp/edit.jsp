<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
	<title>
		SpringBoot CRUD
	</title>
<style>
table {
    font-family: arial, sans-serif;
    border-collapse: collapse;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: left;
    padding: 8px;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
</head>
<body>

<h2>Mantenimiento Usuarios</h2>
<hr/>
<form method="post" action="/save">
  <input type="hidden" name="id" value="${lists.id}" />
  <br>
  First name:<br>
  <input type="text" name="firstname" value="${lists.firstname}" />
  <br>
  Last name:<br>
  <input type="text" name="lastname" value="${lists.lastname}" />
  <br>
  Phone:<br>
  <input type="text" name="phone" value="${lists.phone}" />
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 
<hr/>

</body>
</html>
