<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<div>
<p><b>Product List:</b><p>

	<ul>
		<c:forEach var="allProducts" items="${allProducts}">
		
			<li>Product id : ${allProducts.prodCode}</li>
			<li>Product name :${allProducts.prodName}</li>
			<li>Product cateogery :${allProducts.cateogery}</li>
			<li>Product Description : ${allProducts.prodDesc}</li>
			<li>Product price :${allProducts.prodPrice}</li>
			<li>Product Quantity :${allProducts.quantity}</li>
			<li>Product Total :${allProducts.quantity * allProducts.prodPrice}</li>
			<br>
			<br>
		</c:forEach>
	</ul>

</div>


	
</body>
</html>