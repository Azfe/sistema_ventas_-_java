<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html" charset="UTF-8">
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" 
		integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
	<title>Azup - Sistema de Ventas</title>
	</head>
	<body>
		<h1>Hola Mundo!</h1>
		
		<div class="container mt-4 col-lg-4">
			<div class="card col-sm-10">
				<div class="card-body">
					<form class="form-sign" action="Validate" method="POST">
						<div class="form-group text-center">
							<h3>Login</h3>
							<img src="https://image-placeholder.com/images/actual-size/120x150.png" alt="" width="150" height="100">
							<label>Bienvenidos al sistema</label>
						</div>
						<div class="form-group">
							<label>Usuario:</label>
							<input type="text" name="txtuser" class="form-control">
						</div>
						<div class="form-group">
							<label>Password:</label>
							<input type="password" name="txtpass" class="form-control">
						</div>
						
						<input type="submit" name="accion" value="Acceder" class="btn btn-primary btn-block"> 
					</form>
				</div>
			</div>
		</div>
		
		<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" 
			integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>	
	
	</body>
</html>