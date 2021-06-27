<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
<div class="main" style="display:flex;'width:1500px;height:800px;">
<div style="width:750px">
<h1>Host Name<c:out value="${x.getName() }"></c:out></h1>
<p >Host name:<c:out value="${x.getHost().getFname() }"></c:out></p>
<p >Date:<c:out value="${x.getDate() }"></c:out></p>
<p >Location:<c:out value="${x.getLocation() }"></c:out></p>
<p><c:out value="${x.getUsers().size() }"></c:out></p>
<table class="table" style="width:500px">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Location</th>

    </tr>
  </thead>
  <tbody>
 	 <c:forEach items="${x.getUsers() }" var="g">
    <tr>
      <th scope="row"><c:out value="${g.getFname() }"></c:out>   <c:out value="${g.getLname() }"></c:out></th>
      <td><c:out value="${g.getLocation() }"></c:out></td>
    </tr>
	</c:forEach>
  </tbody>
</table>
</div>
<div style="width:700px">
<h1>Message Wall</h1>
<div class="log">
            <label>Activities:</label>
           
            <div contenteditable="true" style="overflow-y:scroll; border:solid black 1px; height=150px;">
              	<c:forEach items="${x.getMessages() }" var="gg">
              	<p><c:out value="${gg.getUser().getFname() }"></c:out>:<c:out value="${gg.getText() }"></c:out> </p>
              	<p><c:out value="*********************************"></c:out></p>
              	</c:forEach>
            </div>
        </div>
        <br><br><br>
<form:form action="/newmessage" method="post" modelAttribute="Message">
	<input type="hidden" name="user" value="${user }">
	<input type="hidden" name="event" value="${x.id }">
    <p>
        <form:label path="text">Text</form:label>
        <form:errors path="text"/>
        <form:textarea path="text"/>
    </p>
    <input type="submit" value="Submit"/>
</form:form> 
</div>
</div>
</body>
</html>