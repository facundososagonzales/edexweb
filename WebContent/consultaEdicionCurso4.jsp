<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<%@ page import="datatypes.DtEdicionDetalle" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@include file="/header.jsp" %>
</head>
<%
List <String> listaDocentes = new ArrayList<>();
listaDocentes = (List<String>)request.getAttribute("DocentesEdicionSeleccionada");
DtEdicionDetalle dtEdicion = (DtEdicionDetalle)request.getAttribute("DatosEdicionSeleccionada");

%>
<body>

  <div class="input-group">
		  	 <div class="input-group-prepend">
		        <span class="input-group-text">Información de edición de curso</span>
		     </div>
		     <textarea class="form-control" aria-label="With textarea" style="height : 175px; width : 194px;" readonly><%=dtEdicion.toString()+"Docente:"+listaDocentes%></textarea>	
	     </div>

</body>
</html>