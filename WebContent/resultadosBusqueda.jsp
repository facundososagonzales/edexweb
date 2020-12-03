<%@page import="java.util.Date"%>
<%@page import="publicadores.DtWebCurso"%>
<%@page import="publicadores.DtWebProgF"%>
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
			ArrayList<publicadores.DtWebCurso> cursos = (ArrayList<publicadores.DtWebCurso>) request.getAttribute("cursos");
			ArrayList<publicadores.DtWebProgF> programas = (ArrayList<publicadores.DtWebProgF>) request.getAttribute("programas");
		%>
	
		
		<h1>Cursos, Programas del Sistema</h1>
		<form action="OrdenarAlfabeticamente" method="post">
	 	<input type="hidden" name="mostrar" value="<%=mostrar%>">	
		<input type="hidden" name="boton" id="boton" value="">
		<table class="table table-bordered">
		  <thead >
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtWebCurso dt : cursos) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	<% } %>
	    	<%
					for (publicadores.DtWebProgF dt1 : programas) {
			%>
	    	<tr>
	      		<td><%=dt1.getNombre()%></td>
	      		<td><%=dt1.getFechaPub().getTime()%></td>
	    	</tr>
	    	<% } %>
	  	</tbody>
	  	
	  	
	  	
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarAlfabeticamente')">Ordenar Alfabeticamente</button>
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarFecha')">Ordenar por Fecha</button>
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarCursos')">Ordenar por Curso</button>
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarProgramas')">Ordenar por Programas</button>
	  	
	  	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[1].submit();
		}
	</script>   
 
	 
	 </form> 	
		
		<%}
			// <!-- Resultados SIMILARES -->
			
			else if(mostrar.equals("resultadosSimilares")){
			ArrayList<publicadores.DtWebCurso> cursosAux = (ArrayList<publicadores.DtWebCurso>) request.getAttribute("cursosSimilares");
			ArrayList<publicadores.DtWebProgF> programasAux = (ArrayList<publicadores.DtWebProgF>) request.getAttribute("programasSimilares");
			String dato = (String) request.getAttribute("dato");
		%>
		
		<h1>Resultados similares de la busqueda ... <%=dato%></h1>
		<form action="OrdenarAlfabeticamente" method="post">
	 	<input type="hidden" name="datoIngresado" value="<%=dato%>">
		<input type="hidden" name="mostrar" value="<%=mostrar%>">
		<input type="hidden" name="boton" id="boton" value="">
		<table class="table table-bordered">
		  <thead>
		    <tr>
		      <th scope="col">Nombre</th>
		      <th scope="col">Fecha de Publicacion</th>
		    </tr>
		  </thead>
		  
		   <tbody>
	  		<%
					for (publicadores.DtWebCurso dt : cursosAux) {
			%>
	    	<tr>
	      		<td><%=dt.getNombre()%></td>
	      		<td><%=dt.getFechaPub().getTime()%></td>
	    	</tr>
	    	<% } %>
	    	<%
					for (publicadores.DtWebProgF dt1 : programasAux) {
			%>
	    	<tr>
	      		<td><%=dt1.getNombre()%></td>
	      		<td><%=dt1.getFechaPub().getTime()%></td>
	    	</tr>
	    	<% } %>
	  	</tbody>
	  	
	  	
	  	
	  		
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarAlfabeticamente')">Ordenar Alfabeticamente</button>
		<button type="button" class="btn btn-primary" onclick="procesar('ordenarFecha')">Ordenar por Fecha</button>
		<button type="button" class="btn btn-primary" onclick="procesar('ordenarCursos')">Ordenar por Curso</button>
	  	<button type="button" class="btn btn-primary" onclick="procesar('ordenarProgramas')">Ordenar por Programas</button>
	  	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[1].submit();
		}
	</script>   

	 	</form>	  
		<%} %>		
		
		
		

	<%@include file="/footer.jsp" %>
</body>
</html>