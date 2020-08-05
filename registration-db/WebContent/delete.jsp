<!DOCTYPE html>
<html>
<head>
 <title>delete page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b>Delete here</b>
</header>
<div class="container">

<br>

<form action="DeleteDatabase" method="post">

<label>Enter a Username to delete:</label>
<input type="text" name="tobedeleted" class="form-control">
<br>

<button type="submit" class="btn btn-primary" value="DELETE">Delete</button>
</form>
</div>
</body>
</html>