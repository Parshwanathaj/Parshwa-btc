<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Product Name: ${product.getName()}</h4>
	<h4>Product Category: ${product.getCategory()}</h4>
	<h4>Product Description ${product.getDescription()}</h4>
	<h4>Product Price: ${product.getPrice()}</h4>
	<h4>Quantity: ${quantity}</h4>
	<h4>Line Total: ${quantity * product.getPrice()}</h4>
	<form action="/purchase" method="post">
		<input type="hidden" name="productCode" value="${product.getProductCode()}">
		<input type="hidden" name="quantity" value="${quantity}">
		<label for="option">Proceed with the sale[Y/N]</label>
		<select name="option">
			<option value="Y">Y</option>
			<option value="N">N</option>
		</select>
		<button type="submit">Submit</button>
	</form>
</body>
</html>