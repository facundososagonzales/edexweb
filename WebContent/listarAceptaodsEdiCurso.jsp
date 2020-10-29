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
<%@ page import="interfaces.Fabrica" %>
<%@ page import="interfaces.IControladorListarAceptadosEdiCurso" %>

</head>
<% 
Fabrica fabrica = Fabrica.getInstancia();
IControladorListarAceptadosEdiCurso icseec = fabrica.getIControladorListarAceptadosEdiCurso();

List<String> lista =icseec.listarInstitutos();
%>
<body>
	<form action="ListarAceptadosEdiCurso" method="post">
		
			<div class="form-group col-md-6">
			<label for="inputRol">Seleccionar Instituto :</label>
			<select id="ListIns" name="ListIns" class="form-control" >
				<option disabled selected>-- select an option --</option>
		
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