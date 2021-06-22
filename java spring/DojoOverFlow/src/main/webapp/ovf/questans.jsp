<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><c:out value="${quest.getText() }"></c:out></h1>
<h2>Tags</h2>
<ul>
<c:forEach items="${quest.getTags() }" var="tag">
<li><c:out value="${tag.getSubject() }"></c:out></li>
</c:forEach>
</ul>
<h1>***********************************************************************</h1>
<div class="main" style="display:flex;justify-content:space-evenly;">
<div>
<h2>Answers</h2>
<ul>
<c:forEach items="${quest.getAnswers() }" var="answer">
<li><c:out value="${answer.getAnswer() }"></c:out></li>
</c:forEach>
</ul>
</div>
<div>
<form:form action="/nanswers" method="post" modelAttribute="Answer">
	<input type="hidden" name="question" value="${ quest.getId()}">
    <p>
        <form:label path="answer">question</form:label>
        <form:errors path="answer"/>
        <form:textarea path="answer"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form> 
</div>
</div>
</body>
</html>