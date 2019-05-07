<%@ page import="java.util.*,com.project.model.Shop"%>
<html>

<body>
	<%
		List<Shop> shops= (List<Shop>) request.getAttribute("shop");
	%>
	<h1>Here is a list</h1>
	<table border="1">
		<thead>
			<th>FirstName</th>
			<th>Age</th>
			<th colspan="2">Action</th>
		</thead>
		<%
			for (Shop temp : shops) {
		%>
		<tr>
			<td><%=temp.Name() %></td>
			<td><%=temp.Age() %></td>
			<td><%=temp.Address()%></td>
			<td><%=temp.phonenumber%></td>
			<td><a href="http://localhost:8080/Demo/editStudent?id=<%=temp.getId() %>"><button>Edit</button></a></td>
			<td><a href="http://localhost:8080/Demo/deleteStudent?id=<%=temp.getId() %>"><button>Delete</button></a></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>