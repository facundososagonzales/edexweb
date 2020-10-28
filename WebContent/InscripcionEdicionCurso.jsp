<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/header.jsp"%>
<meta charset="UTF-8">
<title>Inscripcion a una edicion de curso</title>
</head>
<body>
	<form action="InscripcionEdicionCurso" method="post">
		 <div class="form-group col-md-6">
			<label for="inputRol">Buscar por instituto o categoría:</label>
			<select id="catIns" name="catIns" class="form-control">
			<option selected>Instituto</option>
			<option>Categoría</option>
		  </select>
	     </div>
	     
		<button type="submit" class="btn btn-primary" >Confirmar</button>
		
	</form>
</body>
	<%@include file="/footer.jsp" %>
</html>