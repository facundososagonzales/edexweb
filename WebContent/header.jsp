<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css" integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">

<%HttpSession s = request.getSession();
String nick = (String)s.getAttribute("usuarioLogueado");
String tipo = (String)s.getAttribute("tipoUsuarioLogueado");
if(nick==null){
	tipo="visitante";
}
%>

<%
if(tipo.equals("visitante")){%>


<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>



	<nav class="navbar navbar-expand navbar-light" style="background-color: #e3f2fd;">
	  <a class="navbar-brand" href="index.jsp">Edext</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse " id="navbarNavDropdown">
    	<ul class="navbar-nav mr-auto mt-2 mt-lg-0">
	      <li class="nav-item active">
	        <a class="nav-link" href="index.jsp">Menú Principal <span class="sr-only">(current)</span></a>
	      </li>

	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="" id="navbarDropdownMenuLink1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Altas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="altaUsuario.jsp">Alta Usuario</a>
	        </div>
	      </li>
	           <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         Consultas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="consultaCursoInstCat.jsp">Consulta de Curso</a>
	          <a class="dropdown-item" href="consultaEdicionCurso.jsp">Consulta de Edición de Curso</a>
	          <a class="dropdown-item" href="#">Consulta de Usuario</a>
	          <a class="dropdown-item" href="#">Consulta programa formacion</a>
	        </div>
	      </li>   
	      </ul>	      
	      
	      	      
	    <!-- <form action="BusquedaCursoProg" method="post" class="form-inline my-2 my-lg-0">
      		<input class="form-control mr-sm-2" Name="CuadroBusqueda" type="search" placeholder="Curso, Programa" aria-label="Search">
      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Buscar</button>
    	</form>  -->
    	
	   </div>
	   <div class="collapse navbar-collapse flex-grow-0" id="navbarSupportedContent">  
	      <ul class="navbar-nav">
	      
		      <li class="nav-item active">
		        <a id=tipotipo class="nav-link" >Bienvenido <%=tipo %> |<span class="sr-only">(current)</span></a>
		      </li>
		      
	   		  <li class="nav-item active ml-auto">
		          <a class="nav-link" href="iniciarSesion.jsp">Login <span class="sr-only">(current)</span></a>
		      </li>
		      
	     </ul>
	  </div>
	</nav>
<% }%>

<%
if(tipo.equals("estudiante")){%>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>


	<nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
	  <a class="navbar-brand" href="index.jsp">Edext</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavDropdown">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" href="index.jsp">Menú Principal <span class="sr-only">(current)</span></a>
	      </li>

	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Altas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	       		<a class="dropdown-item" href="InscripcionEdicionCurso.jsp">Inscripcion a edicion de curso</a>
	       		<a class="dropdown-item" href="altaUsuario.jsp">Inscripcion a programa formacion</a>
	       		
	        </div>
	      </li>
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         Consultas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="consultaCursoInstCat.jsp">Consulta de Curso</a>
	          <a class="dropdown-item" href="consultaEdicionCurso.jsp">Consulta de Edición de Curso</a>
	          <a class="dropdown-item" href="#">Consulta de Usuario</a>
	          <a class="dropdown-item" href="#">Consulta programa formacion</a>
	        </div>
	      </li>
	      
	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         Varios
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="seguirUsuario.jsp">Seguir a un usuario</a>
	          <a class="dropdown-item" href="dejarDeSeguirUsuario.jsp">Dejar de seguir a un usuario</a>
	          <a class="dropdown-item" href="modificarDatosUsuario.jsp">Modificar datos de usuario</a>
	        </div>
	        
	      </li>
	      
	      </ul>
	      
	    </div>
	      
	    <div class="collapse navbar-collapse flex-grow-0" id="navbarSupportedContent"> 
	   
	   	<ul class="navbar-nav">
	   	
   		  <li class="nav-item active ml-auto">
	        <a id=tipotipo class="nav-link" >Bienvenido <%=tipo %> <%=nick %>  |<span class="sr-only">(current)</span></a>
	      </li>
	   
	    
   		  <li class="nav-item active ml-auto">
   		    <a class="nav-link" href="cerrarSesion.jsp" >Cerrar Sesion <span class="sr-only">(current)</span></a>
	      </li>
	      
	    </ul>
	  </div>
	  
	  
	  
	  
	  
	</nav>
<% }%>

<%
if(tipo.equals("docente")){%>

<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js" integrity="sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s" crossorigin="anonymous"></script>	
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ho+j7jyWK8fNQe+A12Hb8AhRq26LrZ/JpcUGGOn+Y7RsweNrtN/tE3MoK7ZeZDyx" crossorigin="anonymous"></script>



	<nav class="navbar navbar-expand-lg navbar navbar-light" style="background-color: #e3f2fd;">
	  <a class="navbar-brand" href="index.jsp">Edext</a>
	  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNavDropdown" aria-controls="navbarNavDropdown" aria-expanded="false" aria-label="Toggle navigation">
	    <span class="navbar-toggler-icon"></span>
	  </button>
	  <div class="collapse navbar-collapse" id="navbarNavDropdown">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" href="index.jsp">Menú Principal <span class="sr-only">(current)</span></a>
	      </li>

	      <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink1" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	          Altas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="altaCurso.jsp">Alta Curso</a>
	          <a class="dropdown-item" href="altaEdicionDeCurso.jsp">Alta de Edición de Curso</a>
	          <a class="dropdown-item" href="#">Crear Programa formacion</a>
	        </div>
	      </li>
	           <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         Consultas
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="consultaCursoInstCat.jsp">Consulta de Curso</a>
	          <a class="dropdown-item" href="consultaEdicionCurso.jsp">Consulta de Edición de Curso</a>
	          <a class="dropdown-item" href="#">Consulta de Usuario</a>
	          <a class="dropdown-item" href="#">Consulta programa formacion</a>
	          <a class="dropdown-item" href="#">Listar aceptados a una edicion de curso</a>
	          <a class="dropdown-item" href="#">Listar resultados de inscripciones a ediciones de cursos</a>
	        </div>
	      </li>
	      	      
     	  <li class="nav-item dropdown">
	        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdownMenuLink2" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
	         Varios
	        </a>
	        <div class="dropdown-menu" aria-labelledby="navbarDropdownMenuLink">
	          <a class="dropdown-item" href="seguirUsuario.jsp">Seguir a un usuario</a>
			  <a class="dropdown-item" href="dejarDeSeguirUsuario.jsp">Dejar de seguir a un usuario</a>
			  <a class="dropdown-item" href="#">Agregar Curso a programa formacion</a>
		      <a class="dropdown-item" href="SeleccionarEstudiantesEdicionCurso.jsp">Seleccionar estudiante para una edicion de curso</a>
	          <a class="dropdown-item" href="modificarDatosUsuario.jsp">Modificar datos de usuario</a>
	        </div>
	      </li>
	      </ul>
	      
	    </div>
	      
	    <div class="collapse navbar-collapse flex-grow-0" id="navbarSupportedContent"> 
	   
	   	<ul class="navbar-nav">
	   	
   		  <li class="nav-item active ml-auto">
	        <a id=tipotipo class="nav-link" >Bienvenido <%=tipo %> <%=nick %> |<span class="sr-only">(current)</span></a>
	      </li>
	      	    
   		  <li class="nav-item active ml-auto">
   		    <a class="nav-link" href="cerrarSesion.jsp" >Cerrar Sesion <span class="sr-only">(current)</span></a>
	      </li>
	      
	    </ul>
	  </div>
	     
	</nav>
<% }%>

	<%@include file="/footer.jsp" %>
