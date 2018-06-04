<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="viewe/css/style.css">

<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg fixed-top ">
   <a class="navbar-brand" href="#">Home</a>
   <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
     <span class="navbar-toggler-icon"></span>
   </button>
 
<div class="collapse navbar-collapse " id="navbarSupportedContent">
     <ul class="navbar-nav mr-4">
       
       <li class="nav-item">
         <a class="nav-link" href="#">About</a>
       </li>
       <li class="nav-item">
         <a class="nav-link " href="#">Portfolio</a>
       </li>
       <li class="nav-item">
         <a class="nav-link " href="#">Team</a>
       </li>
       <li class="nav-item">
         <a class="nav-link " href="#">Post</a>
       </li>
       <li class="nav-item">
         <a class="nav-link " href="#">Contact</a>
       </li>
     </ul>
     
   </div>
   
</nav>
  
<header class="header">
<h1> <b>Отдел главного  технолога</b></h1>
</header>
<div class = "conteiner-fluid" style="width: 100%" >
			<div class = "btn-group " style="background-color: Aqua; padding-left: 10px;padding-right: 10px;width: 100%; ">
				<h3><b>Разделы технологии</b></h3>
				<c:forEach items="${category}" var="list">
						<div class="btn-group dropdown "style="padding-left: 10px;padding-right: 10px;">
					<button  type="button" class="btn btn-secondary dropdown-toggle"style="padding-left: 10px;padding-right: 10px;" 
					  data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">${list.key.name}</button>
					 	<div class="dropdown-menu dropdown-menu-right">
					<c:forEach items="${list.value}" var="listItem">
						   	 	<a class="dropdown-item" style="margin-left: 10px;margin-right: 10px;" href="ArticleServlet?idSub=${listItem.id}&idC=${list.key.id}&nameC=${list.key.name}&nameSc=${listItem.name}">${listItem.name}</a>
					</c:forEach>
					 </div> 	
				</div>
				</c:forEach>
			</div>  
		</div>
<div class="midlle" >	
	<blockquote class = "quoteText2" >
	  <p><strong>Кто хочет работать — ищет средства, кто не хочет — причины.</strong></p>
	  <footer class="kor">- Сергей Павлович Королев</footer>
	</blockquote>		
	<div class ="image" >
	<img alt="" src="viewe/img/IMAG2095.jpg" >
	</div>		
</div>				
			
       
        
        
   
   
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" ></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
<script type="text/javascript" src='main.js'></script>
</body>
</html>