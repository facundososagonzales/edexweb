	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario alta edicion de curso</title>
		<%@include file="/header.jsp" %>
		<%@ page import="java.util.ArrayList" %>
		<%@ page import="java.util.List" %>
		<%@page import="publicadores.ControladorAltaEdicionCurso"%>
		<%@page import="publicadores.ControladorAltaEdicionCursoService"%>
		<%@page import="publicadores.ControladorAltaEdicionCursoServiceLocator"%>
		
<%

//Fabrica fabrica = Fabrica.getInstancia();
//IControladorAltaEdicionCurso icaec = fabrica.getIControladorAltaEdicionCurso();
ControladorAltaEdicionCursoService sus = new ControladorAltaEdicionCursoServiceLocator();
ControladorAltaEdicionCurso port = sus.getControladorAltaEdicionCursoPort();
String[] institutos = port.listarInstitutos();

%>
		
<style>

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
	
	<form action="AltaEdicionDeCurso" method="post">
	 <div class="container">
	 
	   
	  <h1 class="text-center">Alta de edicion de curso</h1>
      <hr>
	 

		 <div class="form-group col">
		 	<label for="inputEdicion">Edicion</label>
		 	<input type="text" name="inputName" class="form-control" id="inputName" placeholder="Ingresar nombre de edicion">
		</div>
		<div class="form-row col">
	    <div class="form-group col-md-6">
	        <label for="InputInstituto">Instituto</label>
		    <select id="selectBoxIns" name="Instituto" class="form-control">
		    <option disabled selected style="display:none">-- select an option --</option>
    		<%for (String p: institutos){%>
				<option><%=p %></option>
			<%}%>
		    </select>
		 </div>
		
		 <div class="form-group col-md-6">
		 	<label for="inputEdicion">Cupos</label>
		 	<div class="form-check form-check-inline">
  				<input class="form-check-input" type="radio" name="exampleRadios1" id="exampleRadios1" value="Si" 
  				checked onclick="clickFuncSi()">
  				<label class="form-check-label" for="exampleRadios1">Si</label>
			</div>
			<div class="form-check form-check-inline">
  				<input class="form-check-input" type="radio" name="exampleRadios2" id="exampleRadios2" value="No"
  				onclick="clickFuncNo()">
 				<label class="form-check-label" for="exampleRadios2">No</label>
			</div>
			<input type="text" name="Cupos" class="form-control" id="inputCupos" placeholder="Ingresar numero de cupos">
		</div>

		 <div class="form-group col-md-6">
		 	<label for="start">Fecha de inicio</label>
			<input type="date" id="start" name="FechaInicio" min="1900-01-01" max="2020-07-31">
		</div>
		<div class="form-group col-md-6">
			 <label for="start">Fecha de fin</label>
			 <input type="date" id="start" name="FechaFin" style="" value="" min="1900-01-01" max="2020-07-31">
		</div>
	
		<div class="form-group">
			<button type="submit" class="btn btn-primary btn-lg btn-block">Continuar</button>
		</div>
		
	 </div>
	 </div>
	 </form>
	 <%@include file="/footer.jsp" %>
	 
	<script type="text/javascript">

	function clickFuncSi() {
			document.getElementById("exampleRadios2").checked = false;
			document.getElementById("inputCupos").disabled = false;
			document.getElementById("inputCupos").value = "";
		
	}
	
	</script>
	
	<script type="text/javascript">

	function clickFuncNo() {
		document.getElementById("exampleRadios1").checked = false;
		document.getElementById("inputCupos").disabled = true;
		document.getElementById("inputCupos").value = "0";
	}

	</script>
	 
	
	</body>
	</html>
	
	
	