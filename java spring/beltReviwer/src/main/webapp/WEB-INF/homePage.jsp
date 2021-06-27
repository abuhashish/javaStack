<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
    
<!DOCTYPE html>
<html>
<head>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
	<meta charset="UTF-8">
	<title>Welcome</title>
</head>
<body>
	<h1>Welcome, <c:out value="${user.email}" /></h1>
	<a href="/logout">Logout</a>
	

<h3>here are some of the events in ur state</h3>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">date</th>
      <th scope="col">location</th>
      <th scope="col">host</th>
      <th scope="col">action/status</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${events }" var="x">
<c:if test="${x.getState() eq user.getState() }">
    <tr>
      <th scope="row"><a href="/events/${x.getId() }"><c:out value="${x.getName() }"></c:out></a></th>
      <td><c:out value="${x.getDate() }"></c:out></td>
      <td><c:out value="${x.getLocation() }"></c:out></td>
      <td><c:out value="${x.getHost().getFname() }"></c:out></td>
      <td>
      <c:choose>
		      <c:when test="${x.getHost().getId() eq user.getId() }">
		      <p><a href="/edit/${x.getId() }"> Edit</a> <a href="/delete/${x.getId() }">Delete</a></p>
		      </c:when>
      <c:otherwise>
	      <c:choose>
				<c:when test="${user.getEvents().contains(x) } ">
		      <p>Joining <a href="/cancel/${x.getId() }">Cancel</a></p>
		
		      </c:when>
		      <c:otherwise>
		      <p><a href="/join/${x.getId() }">Join</a></p>
		      </c:otherwise>
	      </c:choose>
      </c:otherwise>
      </c:choose>
      </td>
    </tr>
    </c:if>
</c:forEach>
  </tbody>
</table>


<h3>here are some of the events in other states</h3>
<table class="table">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">date</th>
      <th scope="col">location</th>
      <th scope="col">host</th>
      <th scope="col">action/status</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${events }" var="x">
<c:if test="${x.getState() != user.getState() }">
    <tr>
      <th scope="row"><a href="/events/${x.getId() }"><c:out value="${x.getName() }"></c:out></a></th>
      <td><c:out value="${x.getDate() }"></c:out></td>
      <td><c:out value="${x.getLocation() }"></c:out></td>
      <td><c:out value="${x.getHost().getFname() }"></c:out></td>
      <td>
      <c:choose>
		      <c:when test="${x.getHost().getId() eq user.getId() }">
		      <p><a href="/edit/${x.getId() }"> Edit</a> <a href="/delete/${x.getId() }">Delete</a></p>
		      </c:when>
      <c:otherwise>
	      <c:choose>
	      <c:when test="${x.getUsers().contains(user) }">
	      <p>Joining ||<a href="/cancel/${x.getId() }">Cancel</a></p>
	      </c:when>
	      <c:otherwise>
	      <p> <a href="/join/${x.getId() }">join</a></p>
	      </c:otherwise>
	      </c:choose>
      </c:otherwise>
      </c:choose>
      </td>
    </tr>
    </c:if>
</c:forEach>
  </tbody>
</table>

	<form:form action="/newevent" method="post" modelAttribute="newEvent">
	<input type="hidden" name="user_id" value="${user.getId() }"]>
    <p>
        <form:label path="eventname">eventname</form:label>
        <form:errors path="eventname"/>
        <form:input path="eventname"/>
    </p>
     <p>
        <form:label path="eventdate">eventdate</form:label>
        <form:errors path="eventdate"/>
        <form:input type="date" path="eventdate"/>
    </p>
    
     <p>
        <form:label path="eventlocation">eventlocation</form:label>
        <form:errors path="eventlocation"/>
        <form:input path="eventlocation"/>
    </p>
 

        <p>
            <form:label path="state">State</form:label>
		        <form:errors path="state"/>
		        <form:select  path="state">
		        <c:forEach items="${x }" var="g">
				  <option value="${g.getId() }"><c:out value="${g.name }"></c:out></option>
				  </c:forEach>
		        </form:select>
        </p>

  
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>