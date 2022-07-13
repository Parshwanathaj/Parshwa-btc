<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Billing Software Application</h1>
<form action="/product-app" method="post">
	<label for="productCode">Product code</label>
	<input type="text" name="productCode">
	<label for="quantity">Quantity</label>
	<input type="number" name="quantity">
	<button type="submit">Submit</button>
</form>
</body>
</html>