<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Category</h1>
<form:form action="/categories" method="post" modelAttribute="Category">
    <p>
        <form:label path="text">name</form:label>
        <form:errors path="text"/>
        <form:input path="text"/>
    </p>
   
  
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>