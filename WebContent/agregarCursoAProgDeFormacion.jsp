
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@page import="publicadores.ControladorAgregarCursoAProgFormacion"%>
<%@page import="publicadores.ControladorAgregarCursoAProgFormacionServiceLocator"%>
<%@page import="publicadores.ControladorAgregarCursoAProgFormacionService"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="/header.jsp" %>

</head>
<% 
ControladorAgregarCursoAProgFormacionService icon = new ControladorAgregarCursoAProgFormacionServiceLocator();
ControladorAgregarCursoAProgFormacion port = icon.getControladorAgregarCursoAProgFormacionPort();
String[] lista = port.listarProgsFormacion2();
%>
<body>
	<form action="AgregarCursoAProgDeFormacion" method="post">
		
			<div class="form-group col-md-6">
			<label for="inputRol">Seleccionar programa de formacion:</label>
			<select id="ListProg" name="ListProg" class="form-control" >
				<option disabled selected>-- Seleccione una opción --</option>
		
		<%for (String p: lista){%>
				<option><%=p %></option>
		<%}%>
			
		    </select>
		    </div>
	    
	  
	<button type="submit" class="btn btn-primary" >Confirmar</button>
	
	</form>
	
		 <%@include file="/footer.jsp" %>
</body>
</html>