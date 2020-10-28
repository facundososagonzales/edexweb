	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
		
	<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Formulario alta Usuario</title>
		<%@include file="/header.jsp" %>
	<style>
	

h3 {
  text-align: center;
}
	
.container {
  padding: 24px;
  background-color: #white;
  margin: 5% auto 15% auto;
  border: 3px solid #ddd;
  
}

	</style>
	</head>
	<body>

	<form action="AltaUsuario" method="post">
	 <div class="container">
	 
	  <div class="form-row">
		<div class="form-group col-md-6">
		  <label for="inputNick">Nick</label>
		  <input type="text" name="Nick" class="form-control" id="inputNick">
		</div>
		<div class="form-group col-md-6">
		  <label for="inputCorreo">Correo</label>
		  <input type="email" name="Correo" class="form-control" id="inputCorreo">
		</div>
		<div class="form-group col-md-6">
		  <label for="inputNombre">Nombre</label>
		  <input type="text" name="Nombre" class="form-control" id="inputNombre">
		</div>    
		<div class="form-group col-md-6">
		  <label for="inputApellido">Apellido</label>
		  <input type="text" name="Apellido" class="form-control" id="inputApellido">
		</div>    
		<div class="form-group col-md-6">
		  <label for="inputContrasena">Contrasena</label>
		  <input type="password" name="Contrasena" class="form-control" id="inputContrasena">
		</div>
		<div class="form-group col-md-6">
		  <label for="inputRepContrasena">Repetir Contrasena</label>
		  <input type="password" name="ContrasenaR" class="form-control" id="inputRepContrasena">
		</div>
		  <div class="form-group col-md-6">
			<label for="inputRol">Rol</label>
			<select id="selectBox" name="Rol" class="form-control" onchange="changeFunc(event);">
			<option selected>Estudiante</option>
			<option>Docente</option>
		  </select>
	     </div>
	     <div class="form-group col-md-6">
			<label for="inputInstituto">Instituto</label>
			<input type="text" name="Instituto" class="form-control" id="inputInstituto" disabled>
		</div>
	   </div>

	   <label for="start">Fecha de Nacimiento</label>
		<input type="date" id="start" name="FechaNacimiento" style="margin: 10px" value="" min="1900-01-01" max="2020-07-31">
		  <button type="submit" class="btn btn-primary" >Registrar</button>
		  
	  </div>
	  
	  
	</form>
	
	
		
	<script type="text/javascript">

	function changeFunc(evt) {
		if(evt.target.value == "Estudiante"){
			document.getElementById("inputInstituto").disabled = true;
			document.getElementById("inputInstituto").value = "";
		}else{
			document.getElementById("inputInstituto").disabled = false;
		}
		
	}
	
	</script>
	
	<%@include file="/footer.jsp" %>
	
	
	</body>
	</html>