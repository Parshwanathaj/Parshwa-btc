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

		<h1>Edit Book</h1>
		<form action="update-book" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Id</label> <input type="text" value="${book.id}"
							class="form-control" id="number" name="id" readonly="readonly">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="id">Title</label> <input type="text"
							value="${book.bookName}" class="form-control" id="text"
							name="BookName">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Book Author</label> <input type="text"
							value="${book.bookauthor}" class="form-control" id="name"
							name="description" placeholder="Bookauthor">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="designation">Book Price</label> <input type="number"
							value="${book.bookprice}" class="form-control" id="designation"
							name="price" placeholder="Bookprice">
					</div>
				</div>
			</div>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>