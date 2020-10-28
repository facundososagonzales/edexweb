<%@page import="java.util.Date"%>
<%@page import="datatypes.DtWebCurso"%>
<%@page import="datatypes.DtWebProgF"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Resultados Busqueda</title>
<%@include file="/header.jsp" %>
</head>
<body>
		<%
		String mostrar = (String) request.getAttribute("mostrar");
		if (mostrar.equals("curso")) {
			String nombreC = (String) request.getAttribute("curso");
			Date fechaPubC = (Date) request.getAttribute("fechaPubC");
			String dato = (String) request.getAttribute("dato");
			%>
	<h1>Resultados de la busqueda ... <%=dato%></h1>

	<table class="table table-bordered">
	  <thead>
	    <tr>
	      <th scope="col">Nombre</th>
	      <th scope="col">Fecha de Publicacion</th>
	    </tr>
	  </thead>
	  <tbody>
	    <tr>
	      <td><%=nombreC%></td>
	      <td><%=fechaPubC%></td>
	    </tr>
	  </tbody>
			
		<%}else if(mostrar.equals("programa")){
			String nombreP = (String) request.getAttribute("programa");
			Date fechaPubP = (Date) request.getAttribute("fechaPubP");
			String dato = (String) request.getAttribute("dato");
		%>
		<h1>Resultados de la busqueda ... <%=dato%></h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  <tbody>
		    <tr>
		      <td><%=nombreP%></td>
		      <td><%=fechaPubP%></td>
		    </tr>
		  </tbody>
		
	
		<%}
			else if(mostrar.equals("cursoprograma")){
				
				String nombreP = (String) request.getAttribute("programa");
				Date fechaPubP = (Date) request.getAttribute("fechaPubP");
				String nombreC = (String) request.getAttribute("curso");
				Date fechaPubC = (Date) request.getAttribute("fechaPubC");
				String dato = (String) request.getAttribute("dato");
		%>
		<h1>Resultados de la busqueda ... <%=dato%></h1>	
		
			<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<tr>
	      		<td><%=nombreC%></td>
	      		<td><%=fechaPubC%></td>
	    	</tr>
		    <tr>
		      <td><%=nombreP%></td>
		      <td><%=fechaPubP%></td>
		    </tr>
		  </tbody>	
		
		<%}
			else if(mostrar.equals("todos")){
			ArrayList<DtWebCurso> cursos = (ArrayList<DtWebCurso>) request.getAttribute("cursos");
			ArrayList<DtWebProgF> programas = (ArrayList<DtWebProgF>) request.getAttribute("programas");
	
		%>
	
		<h1>Cursos, Programas del Sistema</h1>
		
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (DtWebCurso dt : cursos) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub()%></td>
	    	</tr>
	    	<% } %>
	    	<%
					for (DtWebProgF dt1 : programas) {
			%>
	    	<tr>
	      		<td><%=dt1.getNombre()%></td>
	      		<td><%=dt1.getFechaPub()%></td>
	    	</tr>
	    	<% } %>
	  	</tbody>
	

		<!-- Resultados SIMILARES -->
		
		<%}
			else if(mostrar.equals("resultadosSimilares")){
			ArrayList<DtWebCurso> cursosAux = (ArrayList<DtWebCurso>) request.getAttribute("cursosSimilares");
			ArrayList<DtWebProgF> programasAux = (ArrayList<DtWebProgF>) request.getAttribute("programasSimilares");
			String dato = (String) request.getAttribute("dato");
		%>
		
		<h1>Resultados similares de la busqueda ... <%=dato%></h1>
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (DtWebCurso dt : cursosAux) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub()%></td>
	    	</tr>
	    	<% } %>
	    	<%
					for (DtWebProgF dt1 : programasAux) {
			%>
	    	<tr>
	      		<td><%=dt1.getNombre()%></td>
	      		<td><%=dt1.getFechaPub()%></td>
	    	</tr>
	    	<% } %>
	  	</tbody>
	  		  
		<%} %>		
		
		
		

	<%@include file="/footer.jsp" %>
</body>
</html>