<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form action="/info" method='POST'>
        <label for="name">Your name:</label>
        <input type="text"  name="name">
        <br><br>
        <label for="location">location:</label>
        <select name="location">
          <option value="palestine">palestine</option>
          <option value="usa">usa</option>
          <option value="germany">germany</option>
          <option value="france">france</option>
        </select>
        <br><br>
        <label for="language">language:</label>
        <select name="language" >
          <option value="python">python</option>
          <option value="c++">c++</option>
          <option value="java">java</option>
          <option value="c#">c#</option>
        </select>
        <br><br>
        <label for="text">comment</label>
        <textarea name="text"></textarea>
        <br><br>
        <input type="submit" value="Submit" >
        <br><br>
      </form>
</body>
</html>