<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>


	<div class="container mt-3">
		<!-- screen size -->

		<h1>Add Book Form</h1>
		<a href="add-book" class="btn btn-primary"> Add Book </a> <br>
		<p></p>
		<p></p>
		<div class="row">

			<table class="table table-hover">
				<!-- table lines -->
				<thead>
					<tr>
						<th>Id</th>
						<th>Book Name</th>
						<th>Book Author</th>
						<th>Book Price</th>
						<th>Edit</th>
						<th>Delete</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="book" items="${book}">
						<tr>
							<td>${book.id}</td>
							<td>${book.bookName}</td>
							<td>${book.bookauthor}</td>
							<td>${book.bookprice}</td>
							<td><a href="edit-book/${book.id}">Edit </a></td>

							<td><a href="delete-book/${book.id}"> Delete </a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</body>
</html>