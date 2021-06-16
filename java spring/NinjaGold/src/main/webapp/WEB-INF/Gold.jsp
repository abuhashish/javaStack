<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ page session="true" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/style.css">    
    <title>Document</title>
</head>
<body>
    <main>
        <div class="top">
            <label for="gold">Your Gold</label>
           
			<h1><c:out value="${sessionScope.gold}"/></h1>
        </div>
        <div class="forms">
            <form method="post" action="/process_money">
                <h1>Farm</h1>
                <h4>earns 10-20 gold</h4>
                <input type="hidden" name="gold" value="farm">
                <button type="submit">Find Gold</button>
            </form>
            <form method="post" action="/process_money">
                <h1>Cave</h1>
                <h4>earns 5-10 gold</h4>
                <input type="hidden" name="gold" value="cave">
                <button type="submit">Find Gold</button>
            </form>
            <form method="post" action="/process_money">
                <h1>House</h1>
                <h4>earns 2-5 gold</h4>
                <input type="hidden" name="gold" value="house">
                <button type="submit">Find Gold</button>
            </form>
            <form method="post" action="/process_money">
                <h1>Casino</h1>
                <h4>earns/takes 50 golds</h4>
                <input type="hidden" name="gold" value="casino">
                <button type="submit">Find Gold</button>
            </form>
        </div>
        <div class="log">
            <label>Activities:</label>
           
            <div contenteditable="true" style="width: 850px;max-height:150px;
            overflow-y:scroll; border:solid black 1px;">
         	<c:forEach items="${sessionScope.log}" var="food">
        		<c:choose>
				   <c:when test="${food.charAt(0) eq 'C'.charAt(0) }">
				   	<p style="color: green;"><c:out value="${food }" /></p>
				  </c:when>
				   <c:otherwise>
				   	<p style="color: red;"><c:out value="${food }" /></p>
				   </c:otherwise>    
				</c:choose>
   			 </c:forEach>
            </div>
        </div>
        <br><br><br><br><br><br>
        <a href="/reset" style="padding:20px;background-color:green;width:200px; height:100px ; color:white;margin:100px;" >Reset</a>
    </main>
</body>
</html>