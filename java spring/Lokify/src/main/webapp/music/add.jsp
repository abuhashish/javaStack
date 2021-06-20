<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<a href="/dashboard">Dashbaord</a>
<h1>New music</h1>
<form:form action="/music" method="post" modelAttribute="Music">
    <p>
        <form:label path="artist">Artist</form:label>
        <form:errors path="artist"/>
        <form:input path="artist"/>
    </p>
    <p>
        <form:label path="title">Title</form:label>
        <form:errors path="title"/>
        <form:textarea path="title"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:select path="rating">
            <form:option value="1"> One</form:option>
             <form:option value="2"> two</form:option>
              <form:option value="3"> three</form:option>
               <form:option value="4"> four</form:option>
                <form:option value="5"> five</form:option>
                 <form:option value="6"> six</form:option>
                  <form:option value="7"> seven</form:option>
                   <form:option value="8"> eight</form:option>
                    <form:option value="9"> nine</form:option>
                     <form:option value="10"> ten</form:option>

    		
        </form:select>
    </p>
  
    <input type="submit" value="Submit"/>
</form:form> 
</body>
</html>