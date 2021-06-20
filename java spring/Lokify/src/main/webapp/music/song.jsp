<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/dashboard">Dashbaord</a>
<h1>Title  : <c:out value="${x.title}"/> </h1>
<h1>Artist<c:out value="${x.artist}"/> </h1>
<h1>Rating  : <c:out value="${x.rating}"/> </h1>
<a href="/delete/${x.id }">Delete</a>
</body>
</html>