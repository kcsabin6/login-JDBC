<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Info Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b>Info page</b>
</header>
<body>
<div class="container">
<img src="details.jpg" style="height:300px; width:500px">
<br>
 <table class="table table-dark table-hover">
 
<tr>
<td>username</td>
<td>${mocha.username}</td>
</tr>

<tr>
<td>name</td>
<td>${mocha.name}</td>
</tr>

<tr>
<td>email</td>
<td>${mocha.email}</td>
</tr>

<tr>
<td>gender</td>
<td>${mocha.gender}</td>
</tr>

<tr>
<td>mobile</td>
<td>${mocha.mobile}</td>
</tr>

<tr>
<td>password</td>
<td>${mocha.password}</td>
</tr>

</table>
</div>
</body>
</html>