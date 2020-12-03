<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
		<%@include file="/header.jsp" %>
		<%@ page import="java.util.ArrayList" %>
		<%@ page import="java.util.List" %>
		<%@page import="publicadores.ControladorAltaEdicionCurso"%>
		<%@page import="publicadores.ControladorAltaEdicionCursoService"%>
		<%@page import="publicadores.ControladorAltaEdicionCursoServiceLocator"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Alta edicion de curso</title>
</head>

<%

String instituto = (String)request.getAttribute("Instituto");
String name = (String)request.getAttribute("name");
String cupos = (String)request.getAttribute("cupos");
String fechaInicio = (String)request.getAttribute("fechaInicio");
String fechaFin = (String)request.getAttribute("fechaFin");
String curso = (String)request.getAttribute("curso");


//Fabrica fabrica = Fabrica.getInstancia();
//IControladorAltaEdicionCurso icaec = fabrica.getIControladorAltaEdicionCurso();
ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
String[] docentes = port.listarDocentes();

%>




<style>

* {
  box-sizing: border-box;
}

hr {
  border: 1px solid #ddd;
  margin-bottom: 25px;
}

.container {
  padding: 24px;
  background-color: #white;
  margin: 5% auto 15% auto;
  border: 3px solid #ddd;
  width: 450px;
}

</style>

<title>Insert title here</title>
</head>
<body>
<form action="AltaEdicionDeCurso2" method = "post">
  <div class="container">
	  <h1>Agregar Docente</h1>
      <hr>
	    
      <div class="form-group">
 	  <label for="usuario">Nick de docentes</label>
      <select multiple class="form-control" id="exampleFormControlSelect2" name="docentes">
	  	  	  <%for (String p: docentes){ %>
	  	  	  	<option><%=p%></option>
	  	  	  <%}%>
	  	  </select>
     </div>
	    
	    <div >
		<button type="submit" class="btn btn-primary btn-lg btn-block">Confirmar alta edicion</button>	
		
		</div>
		
	  	<input type="hidden" name="Instituto" value="<%=instituto%>">
		<input type="hidden" name="name" value="<%=name%>">
		<input type="hidden" name="cupos" value="<%=cupos%>">
		<input type="hidden" name="fechaInicio" value="<%=fechaInicio%>">
		<input type="hidden" name="fechaFin" value="<%=fechaFin%>">
		<input type="hidden" name="curso" value="<%=curso%>">
		
  </div>
  
</form>

<%@include file="/footer.jsp" %>
</body>

</html>