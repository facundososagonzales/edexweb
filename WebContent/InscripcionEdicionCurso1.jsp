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
String[] lista;
lista = (String[])request.getAttribute("lista");
String catIns= (String)request.getAttribute ("categoria o instituto");
%>
<body>
<form action="InscripcionEdicionCurso1" method="post">
			
			<input type="hidden" name="CatInsLabel" value="<%=catIns%>">
			<div class="form-group col-md-6">
			<label for="inputRol">Seleccionar <%=catIns%>:</label>
			<select id="ListCatIns" name="ListCatIns" class="form-control" >
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