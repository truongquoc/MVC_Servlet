<%@page import="Model.Bean.Student"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title> Welcome Screen </title>
</head>
<table>
  <tr>
    <th>User name</th>
    <th>Address</th>
    <th>Gender</th>
  </tr>
  <%
  ArrayList<Student> student =(ArrayList<Student>) request.getAttribute("studentArr");
  for(int i=0; i<student.size(); i++) { %>
	<tr>
	 	<td><%= student.get(i).getName() %></td>
		<td><%= student.get(i).getAddress() %></td>
		<td><%= student.get(i).isMale() %></td>
	</tr>  
 <% } %>
</table>

</body>
</html>