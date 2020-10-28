	<%@ page language="java" contentType="text/html; charset=UTF-8"
		pageEncoding="UTF-8"%>
	<!DOCTYPE html>
	<html>
	<head>
		<meta charset="UTF-8">
		<title>Dejar de seguir usuario</title>
		<%@include file="/header.jsp" %>
		<%@ page import="java.util.ArrayList" %>
		<%@ page import="java.util.List" %>
		<%@ page import="interfaces.Fabrica" %>
		<%@ page import="interfaces.IControladorDejarDeSeguir" %>
		
<%
Fabrica fabrica = Fabrica.getInstancia();
IControladorDejarDeSeguir icdds = fabrica.getIControladorDejarDeSeguir();
List<String> seguidos = new ArrayList<>();
String logNick = (String)session.getAttribute("usuarioLogueado");
seguidos =icdds.listarSeguidos(logNick);

%>
		
		
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
  width: 650px;
}

</style>
</head>
<body>
	  
	  <form action="DejarDeSeguirUsuario" method="post">
	    <div class="container">
		    <h1>Dejar de seguir a un usuario</h1>
	        <p>Completar el formulario para dejar de seguir a un usuario.</p>
	       	<hr>
	       	
	        <label for="uname"><b>Nickname</b></label>
			<div class="form-group">
		    <select id="selectBoxSeguidos" name="seguidos" class="form-control">
		    <option disabled selected style="display:none">-- select an option --</option>
    		<%for (String p: seguidos){%>
				<option><%=p %></option>
			<%}%>
			</select>
		    </div>
				<button type="submit" class="btn btn-primary btn-lg btn-block">Dejar de seguir</button>
	    </div>
	  </form>
	  <%@include file="/footer.jsp" %>
</body>
</html>