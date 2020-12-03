<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@page import="publicadores.DtCursoBase"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Cursos encontrados en el Sistema</title>
	<%@include file="/header.jsp" %>
</head>
<body>
	
	<%
		String mostrar = (String) request.getAttribute("mostrar");
		String dato = (String) request.getAttribute("Dato");
		if (mostrar.equals("instituto")) {
			ArrayList<publicadores.DtCursoBase> cursos = (ArrayList<publicadores.DtCursoBase>) request.getAttribute("cursos");
	%>
	<h1>Cursos asociados al instituto <%=dato%></h1>


	<table class="table table-bordered">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Nombre</th>
	      <th scope="col">Descripcion</th>
	    </tr>
	  </thead>
	  <tbody>
	  <%
				int i = 1;
					for (publicadores.DtCursoBase dt : cursos) {
			%>
	    <tr>
	      <th scope="row"><%=i%></th>
	      <td><%=dt.getNombre()%></td>
	      <td><%=dt.getDescripcion()%></td>
	    </tr>
	    <% i++;
	    } %>
	  </tbody>
	</table>
	
		<form action="InformacionCurso" method="post">
	<!--<form>  -->
	
	<input type="hidden" name="NomInstituto" value="<%=dato%>">
	
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputNomCur">Ingrese nombre del Curso a consultar </label>
      <input type="text" name="NomCur" class="form-control" id="inputNomCur">
    </div>
   </div>
   
   <button type="submit" class="btn btn-primary">Consultar</button>

	<%@include file="/footer.jsp" %>
	</form>

	<% } else if (mostrar.equals("categoria")) {
		ArrayList<publicadores.DtCursoBase> cursos = (ArrayList<publicadores.DtCursoBase>) request.getAttribute("cursos");
	%>
	<h1>Cursos asociados a la Categoria <%=dato%></h1>


	<table class="table table-bordered">
	  <thead>
	    <tr>
	      <th scope="col">#</th>
	      <th scope="col">Nombre</th>
	      <th scope="col">Descripcion</th>
	    </tr>
	  </thead>
	  <tbody>
	  <%
				int i = 1;
					for (publicadores.DtCursoBase dt : cursos) {
			%>
	    <tr>
	      <th scope="row"><%=i%></th>
	      <td><%=dt.getNombre()%></td>
	      <td><%=dt.getDescripcion()%></td>
	    </tr>
	    <%} %>
	  </tbody>
	</table>

	<form action="InformacionCurso1" method="post">
	<!--<form>  -->
	<input type="hidden" name="NomCategoria" value="<%=dato%>">
	
  	<div class="form-row">
    	<div class="form-group col-md-6">
      	<label for="inputNomCur">Ingrese nombre del Curso a consultar </label>
      	<input type="text" name="NomCur" class="form-control" id="inputNomCur">
    	</div>
   	</div>
   
   	<button type="submit" class="btn btn-primary">Consultar</button>

	<%@include file="/footer.jsp" %>
	</form>

	<%
		}
	%>

	
</body>
</html>