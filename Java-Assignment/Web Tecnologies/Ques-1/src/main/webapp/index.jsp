<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="StudentController" method="post">
		<table>
			<tr>
				<td>First Name :</td>
				<td><input type="text" name="fname"></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><input type="text" name="lname"></td>
			</tr>
			<tr>
				<td>Email :</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Mobile :</td>
				<td><input type="number" name="contact"></td>
			</tr>
			<tr>
				<td>Gender :</td>
				<td><input type="text" name="gender"></td>
			</tr>
			<tr>
				<td>Password :</td>
				<td><input type="text" name="password"></td>
			</tr>
			
			<tr>
				<td><input type="submit" name="action" value="submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>