<%@page import="java.util.ArrayList"%>
<%@ page import="java.sql.Time"%>

<%@page import="java.util.List"%>


<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Formulario Crear programa de formacion</title>
	<%@include file="/header.jsp" %>
	
	
</head>


<body>


<form action="CrearProgramaDeFormacion" method="post">

  <div class="form-row">
 
   
    <div class="form-group col-md-6">
      <label for="inputCorreo">Nombre del programa de formacion</label>
      <input type="text" name="Programa" class="form-control" id="inputCurso" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputNombre">Descripcion</label>
      <input type="text" name="Descripcion" class="form-control" id="inputDescripcion" required>
    </div>    
   	

 <div class="form-group col-md-6">   
  <label for="start">Fecha de inicio</label>
	<input type="date" id="start" name="FechaFin" class="form-control" id="inputFechaAlta" required
      value=""
      min="1900-01-01" max="2020-07-31">
   </div>
   
    <div class="form-group col-md-6">   
  <label for="start">Fecha de fin</label>
	<input type="date" id="start" name="FechaInicio" class="form-control" id="inputFechaAlta" required
      value=""
      min="1900-01-01" max="2020-07-31">
   </div>

 </div>

     <button type="submit" class="btn btn-primary btn-lg btn-block">REGISTRAR</button> 
  
  </form>
  
  
  
	<%@include file="/footer.jsp" %>
	

	
</body>


</html>