<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
</head>
<body>
	<form:form method="POST" action="/SpringFrameworkBasis/adduser">
		<form:label path="id">ID : </form:label>
		<form:input path="id" />
		<form:label path="name">NAME : </form:label>
		<form:input path="name" />
		<form:label path="password">PASSWORD : </form:label>
		<form:input path="password" />
		<input type="submit" value="SUBMIT" />
	</form:form>
</body>
</html>