<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<%@ include file="../client/header-client.jsp" %>

<body>
	<h1>This is My Cart</h1>

	<table class="table table-hover">
		<thead>
		    <tr>
		      <th scope="col">Product</th>
		      <th scope="col">Added To Cart At</th>
		      <th scope="col">Quantity</th>
		      <th scope="col">Unit Price</th>
		      <th scope="col">Total Per Product</th>
		    </tr>
		</thead>
		<tbody>
			<c:forEach items="${items}" var="element">
		        <tr class="table-active">
			        <td><a href="/products/${element.idProduct}">${element.idProduct}</a></th>
			        <td>${element.date}</td>
			        <td>${element.quantity}</td>
			        <td>${element.unitPrice} MAD</td>
			        <td>${element.unitPrice*element.quantity} MAD</td>
		        </tr>
		</c:forEach>
	   </tbody>
	</table>
</body>