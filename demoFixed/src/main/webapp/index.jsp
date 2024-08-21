<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<form action="add" METHOD="POST">

    Enter 1st number :<input type="text" name="num1"><br>
    Enter 2nd number :<input type="text" name="num2"><br>
    <input type="submit">

</form>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>