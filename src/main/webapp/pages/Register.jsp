<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<Form action="/addStudent">

		Id: <input type="text" name="id">  <br>
		Name : <input type="text" name="name"> <br> 
		City : <input type="text" name="city"> <br>
			<input type="submit"> <br></br> ${msg }
	</Form>
</body>
</html>