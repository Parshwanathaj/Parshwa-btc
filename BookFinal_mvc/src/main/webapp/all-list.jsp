<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book App</title>
</head>
<body>

	<div>
		<p>
			<b>Book App:</b>
		<p>
		<ul>
			<c:forEach var="book" items="${book}">

				<li>Book ID : ${book.bookId}</li>
				<li>Book Name :${book.bookName}</li>
				<li>Book Author :${book.bookAuthor}</li>
				<li>Price : ${book.bookPrice}</li>
				<br>
				<br>
			</c:forEach>
		</ul>
	</div>
</body>
</html>