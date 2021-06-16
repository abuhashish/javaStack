<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Submitted info</h1>
<ul>
<li>Name :   <c:out value="${username}"/></li>
<li>language :   <c:out value="${language}"/></li>
<li>location :    <c:out value="${location}"/></li>
<li>comment :   <c:out value="${comment}"/></li>


</ul>
</body>
</html>