<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp"%>
</head>
<body>
	<div class="container mt-2">
		<h1>Add Book Form</h1>
		<form action="insert-book" method="post">
			<div class="row">
				<div class="col">
					<div>
						<label>Id</label> <input type="number" class="form-control"
							name="id">
					</div>
					<!-- form -control height and width of label  -->
				</div>
				<div class="col">
					<div class="form-group">
						<label for="designation">BookName</label> <input type="text"
							class="form-control" id="designation" name="BookName">
					</div>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="department">BookAuthor</label> <input type="text"
							class="form-control" id="department" name="Bookauthor">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="hero">BookPrice</label> <input type="text"
							class="form-control" id="salary" name="Bookprice">
					</div>
				</div>
			</div>
			<%-- 
			<a href="${pageContext.request.contextPath }/"
				class="btn btn-warning"> Back </a>  --%>
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>
	</div>
</body>
</html>