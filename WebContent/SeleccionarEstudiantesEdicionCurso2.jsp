<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<%@include file="/header.jsp" %>
</head>

<%
String[] listaEdicion;
listaEdicion = (String[])request.getAttribute("listaEdicion");
String nomIns =(String)request.getAttribute("instituto");
String curso =(String)request.getAttribute("Curso");


%>
<body>
<form action="SeleccionarEstudiantesEdicionCurso2" method="post">
<div class="form-group col-md-6">
			<input type="hidden" name="nomIns" value="<%=nomIns%>">
			<input type="hidden" name="curso" value="<%=curso%>">
			<label for="inputRol">Seleccionar edición:</label>
			<select id="ListEdicion" name="ListEdicion" class="form-control" >
				<option disabled selected>-- select an option --</option>
		
		<%for (String p: listaEdicion){%>
				<option><%=p %></option>
		<%}%>
			
		    </select>
		    </div>
	    
	  
	<button type="submit" class="btn btn-primary" >Confirmar</button>
	
	</form>
	
		 <%@include file="/footer.jsp" %>
</body>
</html>