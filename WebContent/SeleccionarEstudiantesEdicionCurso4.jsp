<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<%@include file="/header.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="datatypes.DtEstudiante" %>
<% 

String edicion =(String)request.getAttribute("edicion");
String nomIns = (String)request.getAttribute("nomIns");
String curso = (String)request.getAttribute("curso");
ArrayList<DtEstudiante> estudiantes = (ArrayList<DtEstudiante>) request.getAttribute("DatosEstudiantes");
List<String> listaEst = (List<String>)request.getAttribute("estudiantes");
for (DtEstudiante dte : estudiantes) {
	System.out.println(dte.getNick() + " nick");
}

	
%>


<body>
<form action=SeleccionarEstudiantesEdicionCurso4 method="post">

	<input type="hidden" name="edicion" value="<%=edicion %>">
	<input type="hidden" name="nomIns" value="<%=nomIns %>">
	<input type="hidden" name="curso" value="<%=curso %>">
	
	<h1>Estudiantes inscriptos en la edicion <%=edicion%></h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">Nick</th>
				<th scope="col">Estado</th>
			</tr>
		</thead>
		<tbody>
			<%
				int i = 1;
					for (DtEstudiante dte : estudiantes) {
			%>
			<tr>
				<th scope="row"><%=i%></th>
				<td><%=dte.getNick()%></td>
				<td><%=dte.getEstado()%></td>
			</tr>
			<%
				}
			%>
		</tbody>
	</table>
	
	<label for="inputRol">Seleccionar estudiante:</label>
			<select id="ListEst" name="ListEst" class="form-control" >
				<option disabled selected>-- select an option --</option>
		
		<%for (String p: listaEst){%>
				<option><%=p %></option>
		<%}%>
			
		    </select>
		    
		    <label for="inputRol">Seleccionar estado:</label>
			<select id="ListEstado" name="ListEstado" class="form-control" >
				<option disabled selected>-- select an option --</option>
		
		
				<option>Aceptado</option>
				<option>Rechazado</option>
		
			
		    </select>
	    
	  
	<button type="submit" class="btn btn-primary" >Confirmar</button>
</form>
	
		 <%@include file="/footer.jsp" %>
</body>
</html>