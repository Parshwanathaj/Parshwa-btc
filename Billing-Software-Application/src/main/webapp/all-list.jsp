<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course App</title>
</head>
<body>

	<div>
		<p>
			<b>Course App:</b>
		<p>
		<ul>
			<c:forEach var="course" items="${course}">

				<li>Course ID : ${courses.courseId}</li>
				<li>Course Name :${courses.courseName}</li>
				<li>Description :${courses.courseDescription}</li>
				<li>Price : ${courses.coursePrice}</li>
				<br>
				<br>
			</c:forEach>
		</ul>
	</div>
</body>
</html>