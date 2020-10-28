<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    %>
    
    <%@ page import="interfaces.Fabrica" %>
		<%@ page import="interfaces.IControladorModificarDatosUsuario" %>
		<%@ page import="datatypes.DtUsuario" %>
		<%@ page import="java.util.Date" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
	<%@include file="/header.jsp" %>
	<%
	/*String nick1 = (String)request.getAttribute ("nick");
	String email = (String)request.getAttribute ("email");
	String nombre = (String)request.getAttribute ("nombre");
	String apellido = (String)request.getAttribute ("apellido");
	String fechanac = (String)request.getAttribute ("fecha de nacimiento");*/
	
	
	Fabrica fabrica = Fabrica.getInstancia();
	IControladorModificarDatosUsuario icmdu = fabrica.getIControladorM();
	
	HttpSession sesion = request.getSession();
	
	String login= (String)sesion.getAttribute("usuarioLogueado");
	
	System.out.println("nick");
	//DtUsuario usu = icmdu.elegirUsuario(nick);
	DtUsuario usu = icmdu.datosUsuario(nick);
	String nick1 = usu.getNick();
	String correo= usu.getCorreo();
	String nombre = usu.getNombre();
	String apellido = usu.getApellido();
	
	%>
	
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
	
</head>
<body>

<form action="ModificarDatosUsuario" method="post">
    <div class="container">
	  <h1>Modificar Usuario</h1>
      <hr>
  	<div class="form-row col">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nick</label>
      <input type="email" class="form-control" id="nick" name= "nick" placeholder="Email" value="<%=login%>" readonly>
    </div>
    
    <div class="form-group col-md-6">
      <label for="inputPassword4">Email</label>
      <input type="email" class="form-control" id="email" name= "email" value="<%=correo%>" readonly>
    </div>
    
  <div class="form-group col-md-6">
    <label for="inputAddress">Nombre</label>
    <input type="text" class="form-control" id="nombre" name="nombre" value="<%=nombre%>">
  </div>
  
  <div class="form-group col-md-6">
    <label for="inputAddress2">Apellido</label>
    <input type="text" class="form-control" id="apellido" name="apellido" value="<%=apellido%>">
  </div>
  
  	<button type="submit" class="btn btn-primary btn-lg btn-block">Confirmar Datos</button>

  
  </div>
  </div>
  
  
</form>

</body>
</html>