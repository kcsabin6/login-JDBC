<!DOCTYPE html>
<html>
<head>
 <title>Login Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b>Login Page magic</b>
</header>
<body>
<div class="container">
<img src="details.jpg" style="height:300px; width:500px">
<br>
<form action="signup" method="post">
<label>Username</label>
<input type="text" name="username" class="form-control" style="width:50%">
<hr/>
<label>Name</label>
<input type="text" name="name" class="form-control" style="width:50%">
<hr/>
<label>Email</label>
<input type="email" name="email" class="form-control" style="width:50%">
<hr/>
<label>Gender</label>
<select name="gender" class="form-control" style="width:50%">
<option>Male</option>
<option>Female</option>
</select>
<hr/>
<label>Mobile</label>
<input type="number" name="mobile" class="form-control" style="width:50%">
<hr/>
<button type="submit" class="btn btn-primary">SignUp</button>
</form>
</div>
</body>
</html>