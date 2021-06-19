<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<h1><c:out value="${language.name}"/></h1>
<p>Description: <c:out value="${language.creator}"/></p>
<p>Language: <c:out value="${language.version}"/></p>
<a href="/languages/${language.id}/edit">Edit language</a>
<form action="/languages/${language.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form>