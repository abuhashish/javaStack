<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Welcome User</h1>
<table class="table table-dark" style="width:1500px;">
  <thead>
    <tr>
      <th scope="col">Question</th>
      <th scope="col">Tags</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${x }" var="i">
    <tr>
      <td><a href="/question/${i.getId() }"><c:out value="${i.getText() }"></c:out></a></td>
      <td>
      <c:forEach items="${i.getTags() }" var="k">
      <button class="btn btn-light"><c:out value="${k.getSubject() }"></c:out></button>
	</c:forEach>
	</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
	
</body>
</html>