<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
		<%@include file="/header.jsp" %>
</head>
<body>


<form action="ConsultaEdicionCurso" method="post">

		  <div class="form-group col-md-6">
			<label for="inputRol">Buscar por instituto o categor�a:</label>
			<select id="catIns" name="catIns" class="form-control">
			<option selected>Instituto</option>
			<option>Categor�a</option>
		  </select>
	     </div>
	    
	     
	 
	<button type="submit" class="btn btn-primary" >Confirmar</button>
	
	</form>
	
		 <%@include file="/footer.jsp" %>
</body>
</html>