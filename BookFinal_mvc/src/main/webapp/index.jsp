<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course App</title>
</head>
<body>
	<div style="display:"'flex', justifyContent:'space-between'}}>
		<div>
			<h2>Add Course</h2>
			<form action="add-book" method="post">
				<p>
					Book Id: <input type="number" name="bookId">
				</p>
				<p>
					Book Name : <input type="text" name="bookName">
				</p>
				<p>
					Book Author : <input type="text" name="bookauthor">
				</p>
				<p>
					Book Price: <input type="number" name="bookPrice">
				</p>
				<p>
					<button type="submit">Enter</button>
				</p>

			</form>

			<h2>Find Book By Name</h2>

			<form action="search-book" method="get">
				<p>
					Book Id : <input type="text" name="book-name">
				</p>
				<p>
					<button type="submit">Search</button>
				</p>
			</form>

			<h2>Delete Course</h2>
			<form action="delete-book" method="get">
				<p>
					Book Id: <input type="text" name="bookName">
				</p>
				<p>
					<button type="submit">Delete</button>
				</p>
			</form>
		</div>
		<div>
			<h2>Update Movie</h2>
			<form action="update-book" method="post">
				<p>
					Book Id : <input type="number" name="bookId">
				</p>
				<p>
					Book Name : <input type="text" name="bookName">
				</p>
				<p>
					Book Author: <input type="text" name="bookauthor">
				</p>
				<p>
					Book Price: <input type="number" name="bookPrice">
				</p>
				<p>
					<button type="submit">Update</button>
				</p>

			</form>

			<h2>Get AllBook List</h2>
			<form action="get-all-book" method="get">
				<button type="submit">Get</button>
			</form>

		</div>
	</div>
</body>
</html>