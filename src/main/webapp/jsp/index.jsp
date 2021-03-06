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
  <input type="hidden" name="id" value="" />
  First name:<br>
  <input type="text" name="firstname" />
  <br>
  Last name:<br>
  <input type="text" name="lastname" />
  <br>
  Phone:<br>
  <input type="text" name="phone" />
  <br>
  <br>
  <input type="submit" value="Submit">
</form> 
<hr/>
<table>
  <tr>
    <th>ID</th>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Phone</th>
    <th>Action</th>
  </tr>
  <c:forEach var = "list" items = "${lists}">      
  <tr>
    <td>${list.id}</td>
    <td>${list.firstname}</td>
    <td>${list.lastname}</td>
    <td>${list.phone}</td>
    <td>
    	<a href="/view/${list.id}"> View</a>
    	<a href="/delete/${list.id}">Delete</a>
    	<a href="/edit/${list.id}">Edit</a>
    </td>
  </tr>  
  </c:forEach>
</table>

</body>
</html>
