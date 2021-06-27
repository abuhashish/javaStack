<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Registration Page</title>
</head>
<body>
    <h1>Register!</h1>
    
    <p><form:errors path="user.*"/></p>
    
    <form:form method="POST" action="/registration" modelAttribute="user">
        <p>
            <form:label path="email">Email:</form:label>
            <form:input type="email" path="email"/>
        </p>
        
        <p>
            <form:label path="password">Password:</form:label>
            <form:password path="password"/>
        </p>
        <p>
            <form:label path="passwordConfirmation">Password Confirmation:</form:label>
            <form:password path="passwordConfirmation"/>
        </p>
        <p>
            <form:label path="fname">fname:</form:label>
            <form:input  path="fname"/>
        </p>
        <p>
            <form:label path="lname">lname:</form:label>
            <form:input  path="lname"/>
        </p>
         <p>
            <form:label path="location">location:</form:label>
            <form:input  path="location"/>
        </p>
         <p>
            <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:select class="form-control" path="state">
		        <c:forEach items="${x }" var="g">
				  <option value="${g.getId() }"><c:out value="${g.name }"></c:out></option>
				  </c:forEach>
		        </form:select>
        </p>
        <input type="submit" value="Register!"/>
    </form:form>
    
</body>
</html>