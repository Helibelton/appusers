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
<table>
  <tr>
    <th>ID</th>
    <td>${lists.id}</td>
  </tr>
  <tr>
    <th>First Name</th>
    <td>${lists.firstname}</td>
  </tr>
  <tr>
  	<th>Last Name</th>
  	<td>${lists.lastname}</td>
  </tr>
  <tr>
    <th>Phone</th>   
    <td>${lists.phone}</td>
  </tr>
  <a href="/">back</a>
</table>

</body>
</html>
