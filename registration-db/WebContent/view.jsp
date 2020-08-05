<!DOCTYPE html>
<html>
<head>
 <title>View Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js"></script>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b>View  here</b>
</header>
<div class="container">

<br>
<span><h1>${view}</h1></span>
<form action="SearchDatabase" method="post">

<label>Enter a Username to view:</label>
<input type="text" name="tobeviewed" class="form-control">
<br>

<button type="submit" class="btn btn-primary" value="VIEW">View</button>
</form>
</div>
</body>
</html>