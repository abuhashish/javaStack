<%@ page isErrorPage="true" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Edit Book</h1>
<form:form action="/editevents/${x.getId()}" method="post" modelAttribute="x">
    <input type="hidden" name="_method" value="put">
    <form:input type="hidden" path="host"/>
    <form:input type="hidden" path="users"/>
    <p>
    
        <form:label path="name">name</form:label>
        <form:errors path="name"/>
        <form:input path="name" />
    </p>
    
    <p>
        <form:label path="date">date</form:label>
        <form:errors path="date"/>
        <form:input type="date" path="date"/>
    </p>
    <p>
        <form:label path="location">location</form:label>
        <form:errors path="location"/>
        <form:input path="location"/>
    </p>
    <p>
            <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:select  path="state">
		        <c:forEach items="${y }" var="g">
				  <option value="${g.getId() }"><c:out value="${g.name }"></c:out></option>
				  </c:forEach>
		        </form:select>
        </p>   
    
    <input type="submit" value="Submit"/>
</form:form>
</body>
</html>