<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>what is the code</h1>
<p><c:out value="${error}"/></p>
<form method="POST" action="/testcode">
   <input type="text" name="code">
   
    <button>Try Code</button>
</form>
</body>
</html>