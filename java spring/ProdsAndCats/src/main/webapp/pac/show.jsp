<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.all{
display:flex;
justify-content:space-evenly;
}
</style>
</head>
<body>
<div class="main">
<h1><c:out value="${x.name}"/></h1>
<div class="all">
<div class="left">
<h2>Categories</h2>
<ul>
<c:forEach items="${x.categories }" var="i">
<li><c:out value="${i.getName() }"></c:out></li>
</c:forEach>
</ul>
</div>
<div class="right">
<h2>Add new category</h2>

<form:form action="/addCat" method="POST" modelAttribute="categories_products">
			<form:input type="hidden" path="product" value="${ x.getId() }"/>
			<div class="form-group">
		        <form:label path="category">Category</form:label>
		        <form:errors path="category"/>
		        <form:select class="form-control" path="category">
		        <c:forEach items="${y }" var="g">
					<c:if test="${!x.getCategories().contains(g) }">
				  <option value="${g.getId() }"><c:out value="${g.name }"></c:out></option>
				  </c:if>
				  </c:forEach>
		        </form:select>
		    </div>
		    <button class="btn btn-primary">Add</button>
		</form:form>
</div>
</div>
</div>
</body>
</html>