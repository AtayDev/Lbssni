<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<title>Cart</title>
		<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css">

	</head>
	<style>
		.img-container{
			margin-top:50px;
			margin-left:100px;
			}
		.container{
			display: flex;
			width: 100%;
			flex-direction: row;
			flex-wrap: nowrap;
			justify-content: space-between;
			}
		.cart-details{
			margin-top:40px;

			}
	</style>
<%@ include file="../client/header-client.jsp" %>
<body>
<div class="container">
	<div class="img-container">
		<img src="${product.imgUrl}" style="width:650px; height:700px;">
	</div>
	<div class="cart-details">
		<h1>${product.title}</h1>
		<br>
		<h6>Unit Price: ${product.unitPrice} MAD</h6>
		<h6>Quantity: ${product.qtyInStock}</h6>
		<br>
		<form:form class="form" method="POST" action="/client/checkout" modelAttribute="cart">
			<form:input class="form-control me-sm-2" placeholder="Enter Quantity" name="qty" path="quantity"/>
			<form:input  style="visibility:hidden;" placeholder="Enter Quantity" name="id" path="idProduct" value="${product.id}"/>
			<form:input  style="visibility:hidden;" path="unitPrice" value="${product.unitPrice}"/>
			<br>
			<input class="btn btn-primary" type="submit" value="submit"/>
		</form:form>
	</div>
</div>
</body>

</html>