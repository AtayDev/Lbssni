<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
	<title> Client Space</title>
	<style>
	.container{
			margin-top:30px;
			margin-bottom:100px;
            display:flex;
            flex-direction:row;
            flex-wrap:wrap;
            gap:70px;
            justify-content:center;
    }
	.dropbtn {
      background-color: #04AA6D;
      color: white;
      padding: 16px;
      font-size: 16px;
      border: none;
    }

    .dropdown {
      position: relative;
      display: inline-block;
    }

    .dropdown-content {
      display: none;
      position: absolute;
      background-color: #f1f1f1;
      min-width: 160px;
      box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
      z-index: 1;
    }

    .dropdown-content a {
      color: black;
      padding: 12px 16px;
      text-decoration: none;
      display: block;
    }

    .dropdown-content a:hover {background-color: #ddd;}

    .dropdown:hover .dropdown-content {display: block;}

    .dropdown:hover .dropbtn {background-color: #3e8e41;}


    .container{

    			margin-top:30px;
    			margin-bottom:100px;
                display:flex;
                flex-direction:row;
                flex-wrap:wrap;
                 gap:30px;
            }
            .cat{
                margin:auto;
                height:200px;
                width:200px;
                text-align:center;


            }

.card {
  box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
  transition: 0.3s;
  width: 40%;
}

.card:hover {
  box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
}

.details {
  padding: 2px 16px;
}
	</style>
</head>
<%@include file="header-client.jsp" %>
<body>
<h3 style="text-align:center; margin-top:30px;"> Filter the products by: </h3>
<div class="container" style="width:auto; margin-right:0px;">
	<div class="dropdown" >
	  <button class="dropbtn">By Price</button>
	  <div class="dropdown-content">
	    <a href="#"><100dh</a>
	    <a href="#">100dh-250dh</a>
	    <a href="#">+250dh</a>
	  </div>
	</div>
	<div class="dropdown">
	  <button class="dropbtn">By Category</button>
	  <div class="dropdown-content">
	    <a href="#">Shirts</a>
	    <a href="#">T-shirts</a>
	    <a href="#">Hoodies</a>
	    <a href="#">Jeans</a>
	    <a href="#">Sweat Pants</a>
        <a href="#">Shorts</a>
        <a href="#">Jackets</a>
        <a href="#">Coats</a>
        <a href="#">Shoes</a>
	  </div>
	</div>
	<div class="dropdown">
	  <button class="dropbtn">By Brands </button>
	  <div class="dropdown-content">
	    <a href="#">ZARA</a>
	    <a href="#">H&M</a>
	    <a href="#">LC WAIKIKI</a>
	  </div>
	</div>
	<div class="dropdown">
    	  <button class="dropbtn">By Style</button>
    	  <div class="dropdown-content">
    	    <a href="#">Vintage</a>
    	    <a href="#">Trendy</a>
    	    <a href="#">Street</a>
    	  </div>
    	</div>
</div>
<div class="container" style="width:700px;">
	<c:forEach items="${products}" var="element">
	<div class="card" style="text-align:center;">
		<img class="cat" style="width:100%;" src="${element.imgUrl}">
		<div class="details">
            <h4><b>${element.title}</b></h4>
            <p>${element.unitPrice} DH</p>
            <p>Qty: ${element.qtyInStock}</p>
            <button type="button"  class="btn btn-primary" id="${element.id}"><a href="/products/${element.id}" style="text-decoration:none;color:white;">Add to cart</a></button>

        </div>
	</div>
	</c:forEach>
</div>

</body>
</html>