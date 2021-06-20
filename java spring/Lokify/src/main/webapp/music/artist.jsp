<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
</head>
<body>
<nav style="display : flex; justify-content:space-evenly;">
<h2>Song By artist ${x.artist } </h2>
<form action="/search" method="GET">
<input name="name">
<button type="submit">search</button>
</form>
<a href="/dashboard">Dashbaord</a>
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
  <c:forEach items="${g}" var="x">
    <tr>
      <td><a href="/music/${x.id }">${x.title }</a></td>
      <td>${x.rating }</td>
      <td><a href="/delete/${x.id }">Delete</a></td>
    </tr>
  </c:forEach>
  </tbody>
</table>
</body>
</html>
