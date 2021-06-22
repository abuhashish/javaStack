<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<%@taglib  uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>New Question</h1>
<form:form action="/nquestions" method="post" modelAttribute="newQuestion">
	
    <p>
        <form:label path="question">question</form:label>
        <form:errors path="question"/>
        <form:input path="question"/>
    </p>
 

    <p>
        <form:label path="tags">tags</form:label>
        <form:errors path="tags"/>
        <form:input path="tags"/>
    </p>

  
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>