<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Consulta de Curso</title>
<%@include file="/header.jsp" %>
</head>

<body>
<form action="ConsultaInstCat" method="post">
<h1>..:Consultar Informacion De Cursos:..</h1>
	<input type="hidden"
			name="boton"
			id="boton"
			value="">
<!--<form>  -->
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputDato">Ingrese nombre de Instituto o de Categoria</label>
      <input type="text" name="Dato" class="form-control" id="inputDato">
    </div>
   </div>
  	<button type="button" class="btn btn-primary" onclick="procesar('instituto')">Consultar Instituto</button>
	<button type="button" class="btn btn-primary" onclick="procesar('categoria')">Consultar Categoria</button>
</form>

	<script type="text/javascript">
		function procesar(tipo) {
			document.getElementById("boton").value = tipo;
			document.forms[0].submit();
		}
	</script>

	<%@include file="/footer.jsp" %>
</body>
</html>