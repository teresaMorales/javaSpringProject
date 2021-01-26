<?xml version="1.0" encoding ="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Formulario</title>
</head>
<body>

	<div>
	
	<h1>Created a Dog</h1>
	<form action="/PetIntelligence/Dogs" method="GET">
	<label for="nombre"> Nombre:</label><br>
    <input type="text" id="perro" name="perro"><br>
            
    <label for="raza"> Raza:</label> <br>
    <input type="text" id="razaPerro" name="razaPerro"><br>
    
    <label for="peso"> Peso:</label> <br>
    <input type="text" id="pesoPerro" name="pesoPerro"><br>
    
    <input type="submit" value="enviar">
	</form>
	</div>
		<div>
	<h1>Created a Cat</h1>
	<form action="/PetIntelligence/Cats"  method="GET">
	<label for="nombre"> Nombre:</label><br>
    <input type="text" id="gato" name="gato"><br>
            
    <label for="raza"> Raza:</label> <br>
    <input type="text" id="razaGato" name="razaGato"><br>
    
    <label for="peso"> Peso:</label> <br>
    <input type="text" id="pesoGato" name="pesoGato"><br>
    
    <input type="submit" value="enviar">
	</form>
	</div>
</body>
</html>