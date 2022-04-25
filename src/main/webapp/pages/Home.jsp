<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome ${obj.eName } ${obj.id }  ${obj.city }

<form action="/getCity">
FindByCity : <Input type="text" name="city" id="city">
<input type="submit">

</form>
</body>
</html>