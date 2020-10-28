<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
	<%@include file="/header.jsp" %>

<style>

.carousel .carousel-item {
  height: 1920px;
}

.carousel-item img {
    top: 0;
    left: 0;
    min-height: 3200spx;
    max-height: 1080px;
    width: 1920px;
}

</style>

<body>
<div id="carouselExampleIndicators" class="carousel slide " data-ride="carousel">
  <ol class="carousel-indicators">
    <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
    <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
  </ol>
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="img/2.jpg" class="d-block  w-100" alt="First slide">
    </div>
    <div class="carousel-item">
      <img src="img/1.jpg" class="d-block  w-100" alt="Third slide">
    </div>
    <div class="carousel-item">
      <img src="img/3.jpg" class="d-block w-100" alt="Third slide">
    </div>
  </div>
  <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
	<%@include file="/footer.jsp" %>
</body>
</html>