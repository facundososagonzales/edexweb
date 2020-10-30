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
	DtEdicionDetalle dtEdicion = (DtEdicionDetalle)request.getAttribute("DatosEdicionSeleccionada");
	String edicion =(String)request.getAttribute("edicion");
	String nomIns =(String)request.getAttribute("instituto");
	String curso =(String)request.getAttribute("curso");
%>
<body>
	<form action=SeleccionarEstudiantesEdicionCurso3 method="post">
		<input type="hidden" name="boton" id="boton" value="">
		<input type="hidden" name="edicion" value="<%=edicion %>">
		<input type="hidden" name="nomIns" value="<%=nomIns %>">
		<input type="hidden" name="curso" value="<%=curso %>">
	 	<div class="input-group">
			  	 <div class="input-group-prepend">
			        <span class="input-group-text">Información de edición de curso</span>
			     </div>
			     <textarea class="form-control" aria-label="With textarea" style="height : 175px; width : 194px;" readonly><%=dtEdicion.toString()%></textarea>	
		</div>
		
		<button type="submit" class="btn btn-primary" >Mostrar estudiantes</button>
	</form>
	
		 <%@include file="/footer.jsp" %>
</body>
</html>