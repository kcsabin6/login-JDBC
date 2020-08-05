<!DOCTYPE html>
<html>
<head>
 <title>Signin Page</title>
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
<div class="container">
<img src="student.png" style="300px">
<br>
<form action="Searchdb" method="post">
<label>Username</label>
<input type="text" name="username" class="form-control">
<br>
<label>Password</label>
<input type="password" name="password" class="form-control">
<br><br>
<button type="submit" class="btn btn-primary" name="buttonName" value="Signin">Signin</button>
<a href="signup.jsp"><button type="button" class="btn btn-secondary">SignUp</button></a>
</form>
</div>
</body>
</html>