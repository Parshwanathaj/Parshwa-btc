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
			<form action="add-course" method="post">
				<p>
					Course Id: <input type="number" name="courseId">
				</p>
				<p>
					Course Name : <input type="text" name="courseName">
				</p>
				<p>
					Course Description : <input type="text" name="courseDescription">
				</p>
				<p>
					Course Price: <input type="number" name="coursePrice">
				</p>
				<p>
					<button type="submit">Enter</button>
				</p>

			</form>

			<h2>Find Course By Name</h2>

			<form action="search-course" method="get">
				<p>
					Course Id : <input type="text" name="course-name">
				</p>
				<p>
					<button type="submit">Search</button>
				</p>
			</form>

			<h2>Delete Course</h2>
			<form action="delete-course" method="get">
				<p>
					Course Id: <input type="text" name="courseName">
				</p>
				<p>
					<button type="submit">Delete</button>
				</p>
			</form>
		</div>
		<div>
			<h2>Update Movie</h2>
			<form action="update-course" method="post">
				<p>
					Course Id : <input type="number" name="courseId">
				</p>
				<p>
					Course Name : <input type="text" name="courseName">
				</p>
				<p>
					Course Description: <input type="text" name="courseDescription">
				</p>
				<p>
					Course Price: <input type="number" name="coursePrice">
				</p>
				<p>
					<button type="submit">Update</button>
				</p>

			</form>

			<h2>Get All Course List</h2>
			<form action="get-all-movies" method="get">
				<button type="submit">Get</button>
			</form>

		</div>
	</div>
</body>
</html>