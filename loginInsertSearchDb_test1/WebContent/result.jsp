<!DOCTYPE html>
<html>
<head>
 <title>View Result Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b></b>
</header>
<body>
<div class="container">
<img src="student.png" style="300px">
<br>
<table border="1" style="width: 500px;">
<tr style="background-color: voilet;">
<td>username</td>
<td>Password </td>
<td>role</td>
<td>time</td>
</tr>


<tr style="background-color: voilet;">
<td>${magic.usernamedb}</td>
<td>${magic.passworddb} </td>
<td>${magic.emaildb}</td>
<td>${magic.fnamedb}</td>
</tr>
</table>
</div>
</body>
</html>