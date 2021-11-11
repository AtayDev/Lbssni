<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<title>Checkout</title>
</head>
<%@ include file="../client/header-client.jsp" %>
<body>
	<h1>Item Successfully added to your cart</h1>
	<h6>Check your cart: <a href="/client/cart-client"> Cart</a></h6>
	<p><p>${cart.id}</p></p>
	<p><p>client: ${cart.idClient}</p></p>
	${cart.idProduct}
</body>
</html>