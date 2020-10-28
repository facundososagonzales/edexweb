	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Seguir Usuario</title>
		<%@include file="/header.jsp" %>
		
<meta name="viewport" content="width=device-width, initial-scale=1">

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
  width: 550px;
}

</style>
</head>
<body>
	  
	  <form action="SeguirUsuario" method="post">
	    <div class="container">
		    <h1>Seguir a un Usuario</h1>
	        <p>Completar el formulario para comenzar a seguir a un usuario.</p>
	       	<hr>
	       	
	        <label for="uname"><b>Nickname</b></label>
			<div class="form-group">
		      <input type="text" class="form-control" name="nickUsuario" id="inputNick" placeholder="Ingresar Nick">
		    </div>
				<button type="submit" class="btn btn-primary btn-lg btn-block">Seguir</button>
	    </div>
	  </form>
	  <%@include file="/footer.jsp" %>
</body>
</html>