<%@page import="org.apache.axis.utils.ArrayUtil"%>
<%@page import="java.util.ArrayList"%>
<%@page import="publicadores.Time"%>
<%@page import="publicadores.DtInfoProgCurso"%>
<%@page import="publicadores.DtCursoDetalle1"%>
<%@page import="publicadores.DtEdicionBasico"%>
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
		publicadores.DtInfoProgCurso dt = (publicadores.DtInfoProgCurso) request.getAttribute("Curso");
		
		publicadores.DtCursoDetalle1 dtE = dt.getDt();
		String nomCur = dtE.getNombre();
		String desc = dtE.getDescripcion();
		String dur = dtE.getDuracion();
		Time cantH = dtE.getCantHoras();
		String horas = cantH.toString();
		int creditos = dtE.getCreditos();
		String url = dtE.getUrl();
		String[] previas = dtE.getPrevias();
		DtEdicionBasico[] ediciones = dtE.getEdiciones();
		String[] categorias = dtE.getCategorias();
		
		
		String text = dt.getTexto();
	%>
	
	<h1>Datos del curso <%=nomCurso%></h1>
	<table class="table table-striped">
		<caption>Informacion del Curso</caption>
		<thead>
			<tr>
				<th scope="col">Nombre Curso </th>
				<th scope="col">Descripcion </th>
				<th scope="col">Duracion </th>
				<th scope="col">Cantidad de Horas </th>
				<th scope="col">Creditos </th>
				<th scope="col">url </th>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<td><%=nomCur%></td>
				<td><%=desc%></td>
				<td><%=dur%></td>
				<td><%=horas%></td>
				<td><%=creditos%></td>
				<td><%=url%></td>
			</tr>
		</tbody>
	</table>
	
	<% if(!(previas==null)){ %>	
	<table class="table table-striped">
		<caption>Previa/s asociada/s al curso</caption>
		<thead>
			<tr>
				<th scope="col"> # </th>
				<th scope="col">Nombre Previa </th>
			</tr>
		</thead>
		<tbody>
		 <%
					for (int x =0; x < previas.length;  ++x) {
			%>
	    <tr>
	      <td><%=x+1%></td>
	      <td><%=previas[x]%></td>
	    </tr>
	    <% ;
	    } %>
		</tbody>
	</table>
	<%}
	if(!(ediciones==null)){
	%>
	<table class="table table-striped">
		<caption>Edicion/es asociada/s al curso</caption>
		<thead>
			<tr>
				<th scope="col"> # </th>
				<th scope="col">Nombre Edicion </th>
			</tr>
		</thead>
		<tbody>
		 <%
			
					for (int x =0; x < ediciones.length;  ++x) {
			%>
	    <tr>
	      <td><%=x+1%></td>
	      <td><%=ediciones[x].getNombre()%></td>
	    </tr>
	    <% ;
	    } %>
		</tbody>
	</table>
	<%}
	if(!(categorias==null)){ %>
	<table class="table table-striped">
		<caption>Categoria/s a la/s que pertenece el Curso</caption>
		<thead>
			<tr>
				<th scope="col"> # </th>
				<th scope="col">Nombre Categoria </th>
			</tr>
		</thead>
		<tbody>
		 <%
			
					for (int x =0; x < categorias.length;  ++x) {
			%>
	    <tr>
	      <td><%=x+1%></td>
	      <td><%=categorias[x]%></td>
	    </tr>
	    <% ;
	    } %>
		</tbody>
	</table>
	<%} %>
	<table class="table table-striped">
		<thead>
			<caption>Programa/s de Formacion asociados al curso</caption>
			<tr>
				<th scope="col">Programas de Formacion </th>
			</tr>
		</thead>
		<tbody>
		
			<tr>
				<td><%=text%></td>
			</tr>
		</tbody>
	</table>
	
	
	
	
	<form action="ConsultaPoE" method="post">
	<!--<form>  -->
	
	<input type="hidden" name="NomInstituto" value="<%=dato%>">
	<input type="hidden" name="NomCurso" value="<%=nomCurso%>">
	<input type="hidden" name="boton" id="boton" value="">
	
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputDatoF">Ingrese nombre de la Edicion o Programa de Formacion </label>
      <input type="text" name="DatoF" class="form-control" id="inputDatoF">
    </div>
   </div>
   	
   	<button type="button" class="btn btn-primary" onclick="procesar('edicion')">Consultar Edicion</button>
	<button type="button" class="btn btn-primary" onclick="procesar('progFormacion')">Consultar Programa de Formacion</button>
	
	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[1].submit();
		}
	</script>   
   
	<%@include file="/footer.jsp" %>
	</form>

</body>
</html>