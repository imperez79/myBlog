<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>${article.name }</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" href="viewe/css/style.css">
<link rel="stylesheet" href="font-awesome.min.css">

</head>
<header>
<jsp:include page="NewFile1.jsp"></jsp:include>

</header>
<body>

		<div class="card w-75%  " style="margin-left: 10%; margin-right: 10%;">
		    <div class="card-body">
		      <h3 class="card-title" style="text-align: center;"><b> ${article.name }</b></h3>
		      <br>
		      <p class="card-text">ffffffffffffffffffffffffffffffffffffffff
		      ffffffffffffffffffffffffffffffffffffffffffffffffffffffffff
		      gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggg
		      gggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggffffffffffffff${article.description }</p>
		    </div>
		 </div>
	

<p align="left">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
</p>
</body>
</html>