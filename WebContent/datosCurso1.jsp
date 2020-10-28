<%@page import="datatypes.DtInfoProgCurso"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Informacion de Curso</title>
<%@include file="/header.jsp" %>
</head>
<body>


	<%
		
		String dato = (String) request.getAttribute("Dato");
		String nomCurso = (String) request.getAttribute("NomCurso");
		DtInfoProgCurso dt = (DtInfoProgCurso) request.getAttribute("Curso");
	%>
	
	<h1>Datos del curso <%=nomCurso%></h1>
	<table class="table table-striped">
		<thead>
			<tr>
				<th scope="col">Informacion</th>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<td><%=dt.toString()%></td>
			</tr>
		</tbody>
	</table>
	
	<form action="ConsultaPoE1" method="post">
	<!--<form>  -->
	
	<input type="hidden" name="NomCategoria" value="<%=dato%>">
	<input type="hidden" name="NomCurso" value="<%=nomCurso%>">
	<input type="hidden" name="boton" id="boton" value="">
	
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputDatoF">Ingrese nombre del Programa de Formacion </label>
      <input type="text" name="DatoF" class="form-control" id="inputDatoF">
    </div>
   </div>
   	<!-- 
   	<button type="button" class="btn btn-primary" onclick="procesar('edicion')">Consultar Edicion</button>
	 -->
	<button type="button" class="btn btn-primary" onclick="procesar('progFormacion')">Consultar Programa de Formacion</button>
	
	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[0].submit();
		}
	</script>   
   
	<%@include file="/footer.jsp" %>
	</form>


</body>
</html>