<%@page import="publicadores.DtExtra"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Orden Alfabetico</title>
<%@include file="/header.jsp" %>
</head>
<body>

	<%		String mostrar = (String) request.getAttribute("Mostrar");
			ArrayList<publicadores.DtExtra> ordenados = (ArrayList<publicadores.DtExtra>) request.getAttribute("Lista");
			if (mostrar.equals("alfb")) {
		%>
		<h1>Cursos, Programas ordenados alfabeticamente</h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtExtra dt : ordenados) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	
	    	</tbody>
	    	<%
					}
			}else if(mostrar.equals("fecha")){
			%>
			<h1>Cursos, Programas ordenados por fecha</h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtExtra dt : ordenados) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	<%
					}
			%>
	  	</tbody>
			
			<%}else if(mostrar.equals("cursos")){ 
			System.out.print("\n\n Llegue al JSP");
			%>
	  			<h1>Filtrado por Cursos</h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtExtra dt : ordenados) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	<%
					}
			%>
	  	</tbody>
	
	  	
	  	
			<%}else if(mostrar.equals("programas")){ %>
	  			<h1>Filtrado por Programas</h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtExtra dt : ordenados) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	<%
					}
			%>
	  	</tbody>
	
	  	
	  	
			<%} %>	
	

<%@include file="/footer.jsp" %>
</body>
</html>