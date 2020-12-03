<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="publicadores.ControladorListarAceptadosEdiCurso"%>
<%@page import="publicadores.ControladorListarAceptadosEdiCursoServiceLocator"%>
<%@page import="publicadores.ControladorListarAceptadosEdiCursoService"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listar Aceptados Edicion de curso</title>
</head>
<%@include file="/header.jsp" %>
<%

ControladorListarAceptadosEdiCursoService icon = new ControladorListarAceptadosEdiCursoServiceLocator();
ControladorListarAceptadosEdiCurso port = icon.getControladorListarAceptadosEdiCursoPort();

String[] listaCurso;
listaCurso = (String[])request.getAttribute("listaCursos");
String nomIns =(String)request.getAttribute("instituto");

%>
<body>
<form action="ListarAceptadosEdiCurso1" method="post">
			<input type="hidden" name="nomIns" value="<%=nomIns%>">
			<div class="form-group col-md-6">
			<label for="inputRol">Seleccionar curso:</label>
			<select id="ListCurso" name="ListCurso" class="form-control" >
				<option disabled selected>-- Seleccione una opcion --</option>
		
		<%for (String p: listaCurso){%>
				<option><%=p %></option>
		<%}%>
			
		    </select>
		    </div>
	    
	  
	<button type="submit" class="btn btn-primary" >Confirmar</button>
	
	</form>
	
		
		 <%@include file="/footer.jsp" %>
</body>
</html>