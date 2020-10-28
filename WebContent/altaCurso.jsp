<%@page import="java.util.ArrayList"%>
<%@ page import="java.sql.Time"%>

<%@page import="java.util.List"%>
<%@ page import="interfaces.Fabrica" %>
<%@ page import="interfaces.IControladorAltaCurso" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Formulario alta de Curso</title>
	<%@include file="/header.jsp" %>
	
	<% 
	
	Fabrica fabrica = Fabrica.getInstancia();
	IControladorAltaCurso icac = fabrica.getIControladorAltaCurso();
	List <String> categorias = new ArrayList <>();
	List <String> previas = new ArrayList <>();
	categorias = icac.listarCategorias();
	previas = icac.listarCursos();
	
	%>
</head>


<body>


<form action="AltaCurso" method="post">

  <div class="form-row">
 
    <div class="form-group col-md-6">
      <label for="inputNick">Nombre del instituto</label>
      <input type="text" name="Instituto" class="form-control" id="inputInstituto" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputCorreo">Nombre del Curso</label>
      <input type="text" name="Curso" class="form-control" id="inputCurso" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputNombre">Descripcion</label>
      <input type="text" name="Descripcion" class="form-control" id="inputDescripcion" required>
    </div>    
   	<div class="form-group col-md-6">
      <label for="inputApellido">Duracion</label>
      <input type="number" name="Duracion" class="form-control" id="inputDuracion" required>
    </div>    
    <div class="form-group col-md-6">
      <label for="inputContrasena">Cantidad de horas</label>
      <input type="time" name="CantHoras" class="form-control" id="inputCantHoras" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputCantCreditos">Cantidad de créditos</label>
      <input type="number" name="CantCreditos" class="form-control" id="inputCantCreditos" required>
    </div>
    <div class="form-group col-md-6">
      <label for="inputURL">URL</label>
      <input type="text" name="URL" class="form-control" id="inputURL" required>
    </div>

 <div class="form-group col-md-6">   
  <label for="start">Fecha de alta</label>
	<input type="date" id="start" name="FechaAlta" class="form-control" id="inputFechaAlta" required
      value=""
      min="1900-01-01" max="2020-07-31">
   </div>
   
   
<div class="form-group col-md-6">
   	<label for="inputPrevias3" >Lista de previas</label>
	<select name="lista_previas[]" id="lista_previas" multiple>
	<option disabled selected style="display:none">-- Seleccione una opción --</option>
    		<%for (String p: previas){%>
				<option><%=p %></option>
			<%}%>	
		<option> Ninguna </option>
		
	</select>
  		
</div>

<div class="form-group col-md-6">
  	
	<label for="inputPrevias3" >Lista de categorías</label>
	<select name="lista_categorias[]" id="lista_categorias" multiple>	
	<option disabled selected style="display:none">-- Seleccione una opción --</option>
    		<%for (String p: categorias){%>
				<option><%=p %></option>
			<%}%>
			<option> Ninguna </option>
	</select>
</div>

 </div>

     <button type="submit" class="btn btn-primary btn-lg btn-block">REGISTRAR</button> 
  
  </form>
  
  
  
	<%@include file="/footer.jsp" %>
	

	
</body>


</html>