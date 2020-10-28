<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="/header.jsp"%>


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

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
<form action="IniciarSesion" method = "post">


  <div class="container">
  
	  <h1>Inicio de sesión</h1>
      <p>Completar el formulario para iniciar sesión.</p>
      <hr>
	  <div class="form-row">
	    <div class="form-group col-md-6">
	  	  <label for="usuario">Nick</label>
	  	  <input type="text" name="nick" class="form-control" id="nick">
	    </div>
	  
	 	<div class="form-group col-md-6">
		  <label for="pwd">Contrasena</label>
		  <input type="password" name="pwd" class="form-control" id="pwd">
		</div>
	  </div>
	  		 <button type="submit" class="btn btn-primary btn-lg btn-block" style="margin: 0px">Ingresar</button> 
  </div>
 
</form>
<%@include file="/footer.jsp" %>
</body>

</html>