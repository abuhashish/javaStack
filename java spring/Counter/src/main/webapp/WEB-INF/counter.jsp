<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<%   
  
Integer num=(Integer) session.getAttribute("count");   
out.print("you visted the homepage "+num+"times");  
  

  

  
%>  
</body>
</html>