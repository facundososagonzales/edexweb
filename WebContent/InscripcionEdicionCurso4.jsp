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
String dtEdicion = (String)request.getAttribute("DatosEdicionSeleccionada");
String edicion =(String)request.getAttribute("edicionSeleccionada");
%>
<body>
	<form action=InscripcionEdicionCurso4 method="post">
		<input type="hidden" name="boton" id="boton" value="">
		<input type="hidden" name="edi" value="<%=edicion %>">
	 	<div class="input-group">
			  	 <div class="input-group-prepend">
			        <span class="input-group-text">Información de edición de curso</span>
			     </div>
			     <textarea class="form-control" aria-label="With textarea" style="height : 175px; width : 194px;" readonly><%=dtEdicion%></textarea>	
		</div>
		<button type="button" class="btn btn-primary"
			onclick="procesar('inscribir')">Inscribir</button>
		<button type="button" class="btn btn-primary"
			onclick="procesar('cancelar')">Cancelar</button>
	</form>
	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[1].submit();
		}
	</script>
</body>
</html>