<%@page import="Store.DAO.Impl.UserDAOImpl"%>
<%@page import="Store.Domain.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<link rel="stylesheet" type="text/css" href="viewe/css/dataTables.bootstrap4.min.css">
<jsp:include page="NewFile1.jsp"></jsp:include>
</head>
<body>
<h2 style="text-align: center;"> Добро пожаловать  в раздел Администрирования </h2>
<%;
request.setAttribute("users", new UserDAOImpl().getAll());
%>
<div class = "container" style="margin-top: 5%;">
	<div class="row ">
		<div class = "col-6">
			<table id="bootstrap-table" class="table  table-striped  table-bordered table-hover" >
			<thead>
			
			<tr>
			<th>Имя</th>
			<th>Пароль</th>
			<th>Мыло</th>
			<th colspan="2">Действия над данными</th>
			</tr>
			<tr>
			<th>1</th>
			<th>2</th>
			<th>3</th>
			<th>4</th>
			<th>5</th>
			</tr>
			</thead>
			<tbody>
			<c:forEach items="${users }" var="user">
			<tr>
			<td ><c:out  value=" ${user.name}"></c:out></td>
			<td ><c:out value=" ${user.password}"></c:out></td>
			<td>Ivan@</td>
			<td><a style = "width: 100%;"class="btn btn-primary" href="UserData?id=${user.id}&action=Edit">Edit</a></td>
			<td><a style = "width: 100%;" class="btn btn-danger" href="UserData?id=${user.id}&action=Delete">Delete</a></td>
			</tr>
			</c:forEach>
			</tbody>
			<tfoot>
			<tr>
			<td><a style = "width: 100%;" class="btn btn-danger" href="Registration.jsp">ADD</a></td>
			</tr>
			</tfoot>
			</table>
		</div>
		<div class = "col-4 offset-2 ">
			<div class="list-group list-group-hover " style="text-align: center;">
				  <a href="#" class="list-group-item list-group-item-action active"><b>Категории</b></a>
				  <a href="#" class="list-group-item list-group-item-action"><b>Подкатегории</b></a>
				  <a href="#" class="list-group-item list-group-item-action"><b>Статьи</b></a>
				  <a href="#" class="list-group-item list-group-item-action "><b>Пользователи</b></a>
			</div>
		
		</div>
	</div>
</div>	
<script type="text/javascript" src="viewe/js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="viewe/js/dataTables.bootstrap4.min.js"></script>
<script>
 $(document).ready( function () {
 $('#bootstrap-table').DataTable();
 });
</script>
</body>
</html>