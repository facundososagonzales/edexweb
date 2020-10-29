<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Aceptados Edición de curso</title>
		<%@include file="/header.jsp" %>
</head>

<%
List <String> listaEdicion = new ArrayList<>();
List <String> listaAceptados = new ArrayList<>();
listaEdicion = (List<String>)request.getAttribute("listaEdicion");
listaAceptados = (List<String>)request.getAttribute("listaAceptados");

%>
<body>

<h1>Datos de las ediciones del curso ></h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Informacion</th>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<% for (String p: listaEdicion){%>
				<td><%=p %></td>
				<%}%>
			</tr>
		</tbody>
	</table>


<h1>Datos de los inscriptos aceptados ></h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Informacion</th>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<% for (String p: listaAceptados){%>
				<td><%=p %></td>
				<%}%>
			</tr>
		</tbody>
	</table>


	    
	  
	
		 <%@include file="/footer.jsp" %>
</body>
</html>