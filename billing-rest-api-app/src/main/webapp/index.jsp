<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Billing Application</title>
</head>
<body bgcolor="cyan">
<h1></h1>
<h2>Product Form : </h2>
<form action="product-code" method="get">
<p>Enter product Id : <input type="text" name="prodCode" required="required"></p>
<button type="submit">Search</button>
<p></p>
<p></p>
<p></p>

</form>

<h2>Make A Sale </h2>
<form action="product-price" method="get">
<p>Enter product Id : <input type="text" name="prodCode"  required></p>
<p>Enter Quantity : <input type="numeric" name="quantity" required="required"></p>
<button type="submit">Bill</button>
<p></p>
<p></p>
<p></p>

</form>

<h2>Get All Sales Information </h2>
<form action="get-all-products" method="get">
<button type="submit">Get</button>
</form>
<p></p>
<p></p>
<p></p>

<form action="exit-page" method="get">
<button type="submit">Exit</button>
</form>

</body>
</html>