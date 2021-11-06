<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<p>${product.id}</p>
<p>${product.title}</p>
<p>Quantity: ${product.qtyInStock}</p>
<form:form class="form" method="POST" action="/checkout" modelAttribute="cart">
	<form:input  placeholder="Enter Quantity" path="quantity"/>
	<form:input  placeholder="Enter Quantity" path="idProduct" value="${product.id}"/>
	<input type="submit" value="submit"/>
</form:form>