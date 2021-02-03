<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<p>Tu has visitado <a href="http://localhost:8087/">http://localhost:8087/</a>
<c:out value="${conteo}" default="0"/> veces.</p>
</body>
</html>