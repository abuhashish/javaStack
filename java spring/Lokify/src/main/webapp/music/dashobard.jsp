<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/dash.css">   
</head>
<body>
<div class="main">
<nav>
<a href="/music/new">Add new</a>
<a href="/search/topTen">Top Songs</a>
<form action="/search" method="GET">
<input name="name">
<button type="submit">search</button>
</form>
</nav>
<table class="table table-dark">
  <thead>
    <tr>
      <th scope="col">Name</th>
      <th scope="col">Rating</th>
      <th scope="col">Options</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${music}" var="x">
    <tr>
      <td><a href="/music/${x.id }">${x.artist }</a></td>
      <td>${x.title }</td>
      <td><a href="/delete/${x.id }">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>


</div>
</body>
</html>