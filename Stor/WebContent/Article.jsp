<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> </title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="viewe/css/style.css">
<link rel="stylesheet" href="font-awesome.min.css">

</head>
<header>
<jsp:include page="NewFile1.jsp"></jsp:include>
</header>
<body>


		
		<h2 style="text-align: center;"> Добро пожаловать  в раздел ${idC} </h2>
		

<div class="row" >
	<div class="card-columns" >
	<c:forEach items="${arcticles}" var="art">
		<div class="card">
			<img class="card-img-top" src="viewe/img/ingener.jpg" alt="Card image cap">
				<div class="card-body">
					<h5 class="card-title">${art.name } </h5>
					<p class="card-text">${art.description}</p>
					<a href="ArticleServlet?idArt=${art.id}" class="btn btn-primary">Прочесть</a>
				</div>
			</div>
		</c:forEach>
		</div>
	</div>
	
<p align="left">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
</p>
</html>