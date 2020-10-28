<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<%@include file="/header.jsp" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta edicion de curso</title>
</head>

<%

List <String> cursos = new ArrayList<>();
cursos = (List<String>)request.getAttribute("cursos");


String instituto = (String)request.getAttribute("Instituto");
String name = (String)request.getAttribute("name");
String cupos = (String)request.getAttribute("cupos");
String fechaInicio = (String)request.getAttribute("fechaInicio");
String fechaFin =(String)request.getAttribute("fechaFin");
%>




<style>
	
body {
  font-family: Arial, Helvetica, sans-serif;
  background-color: white;
}

* {
  box-sizing: border-box;
}

h3 {
  text-align: center;
}
	
.container {
  padding: 24px;
  background-color: #white;
  margin: 5% auto 15% auto;
  border: 3px solid #ddd;
  width: 650px;
}



	</style>
	</head>
	<body>
	
	
	<form action="AltaEdicionDeCurso1" method="post">
	 <div class="container">
 	     <div class="form-group col-md-6">
        	<label for="InputInstituto">Cursos</label>
	    	<select id="selectBoxIns" name="Cursos" class="form-control">
	    	<option disabled selected style="display:none">-- select an option --</option>
   			<%for (String c: cursos){%>
				<option><%=c %></option>
			<%}%>
	    	</select>
	 	
	 	</div>
	 	<input type="hidden" name="Instituto" value="<%=instituto%>">
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="cupos" value="<%=cupos%>">
		<input type="hidden" name="fechaInicio" value="<%=fechaInicio%>">
		<input type="hidden" name="fechaFin" value="<%=fechaFin%>">
		
		<div class="form-group">
			<button type="submit" class="btn btn-primary btn-lg btn-block">Continuar</button>
		</div>
		
		
		
		
		
		
	 
	 </div>
	</form>
	
	
	
		 <%@include file="/footer.jsp" %>
	
	
	
	
</body>
</html>