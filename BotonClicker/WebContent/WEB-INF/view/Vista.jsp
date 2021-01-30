<?xml version="1.0" encoding ="ISO-8859-1" ?>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Click</title>
</head>
<body>
<br>
<hr>
<br>
<div style="text-align:center">
<form action="/BotonClicker/ShowSession" method="GET">
<button name="contador" type="submit" value="1"> Click Me! </button>
</form>
<p>Ha hecho click en este boton <c:out value="${contador}"/>  veces</p>
</div>
<br>
<hr>
</body>
</html>