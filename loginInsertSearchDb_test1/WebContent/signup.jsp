<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Signup Page</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
<style>
.w3-button {width:150px}
</style>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"></script>

<style type="text/css">
.tcenter {
	display: block;
	margin-left: auto;
	margin-right: auto;
}
</style>
</head>
<body>
<header style="height :30px; background-color:#c4dadc">
<b></b>
</header>
<div class="container">
  
  <img alt="student" src="student.png" style="300px">
  <form class="form-horizontal" action="Insertdb" method="post">
  
    <div class="form-group">
      <label class="control-label col-sm-2" for="username">Username:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="username" placeholder="Enter username" name="username">
      </div>
    </div>
    
    <div class="form-group">
      <label class="control-label col-sm-2" for="password">Password:</label>
      <div class="col-sm-10">          
        <input type="password" class="form-control" id="password" placeholder="Enter password" name="password">
      </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="name">Name:</label>
      <div class="col-sm-10">
        <input type="text" class="form-control" id="name" placeholder="Enter name" name="name">
      </div>
    </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="email">Email:</label>
      <div class="col-sm-10">
        <input type="email" class="form-control" id="email" placeholder="Enter email" name="email">
      </div>
    </div>
    
   
     <div class="form-group">
      <label class="control-label col-sm-2" for="mobile">Mobile:</label>
      <div class="col-sm-10">
        <input type="number" class="form-control" id="mobile" placeholder="Enter mobile" name="mobile">
      </div>
    </div>
      
      <div class="form-group">
      <label class="control-label col-sm-2" for="image">Image:</label>
      <div class="col-sm-10">
        <input type="file" class="form-control" id="image" placeholder="Enter image" name="image">
      </div>
    </div>
    
    
     <div class="form-group">
      <label class="control-label col-sm-2" for="salutation">Education</label>
      <div class="col-sm-10">          
        <select name="salutation" class="form-control" style="width:50%">
        <option>Others</option>
        <option>High-School</option>
        <option>Bachelors</option>
        <option>Under-Graduate</option>
        <option>Graduate</option>
        <option>Post-Graduate</option>
        
        </select>
      </div>
    
      
       <p><a href="signin.jsp"><button type="button" class="w3-button w3-border w3-hover-blue">Sign-in</button></a>
       <button type="submit" class="w3-button w3-border w3-hover-green" name="signup" value="Signup">Sign-up</button>
       </p>
      
      
    </div>
    </form>
    </div>


</body>
</html>