<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<title>Регистрация нового  участника</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"	>
	
</head>
<style>
body{
background-image: url('D:/Workspace/Stor/WebContent/viewe/img/Reg.jpg');
background-repeat: no-repeat;
}
form{
	border:3px solid #8acced;
	width: 50vw;
	hight: 75vh;
	padding : 40px;	
	margin-left: 25%;
	margin-top: 5%;
	}
</style>
<body>
<form action="Login" method = "post" class = "form">
<p><b>Добро пожаловать к нам</b></p>
<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">User name</span>
  </div>
  <input type="text" name ="name" class="form-control" placeholder="Введите имя.." aria-label="."
   aria-describedby="basic-addon1"> 
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">lastname</span>
  </div>
  <input type="text" value = "${user.name}"class="form-control" placeholder="Введите фамилию..." aria-label="Имя пользователя" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">E-mail @</span>
  </div>
  <input type="email" class="form-control" placeholder="Введите почту..." aria-label="Имя пользователя" aria-describedby="basic-addon1">
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">Password</span>
  </div>
  <input type="password" name ="password"class="form-control" placeholder="Введите пароль..." aria-label="Имя пользователя" aria-describedby="basic-addon1">${massages.getValue(password)}
</div>

<div class="input-group mb-3">
  <div class="input-group-prepend">
    <span class="input-group-text" id="basic-addon1">Confirm pass</span>
  </div>
  <input type="text" class="form-control" placeholder="Подтвердите пароль..." aria-label="Имя пользователя" aria-describedby="basic-addon1">
</div>
<p><input type="submit" value="Зарегистрироваться"></p>
</form>


</body>
</html>