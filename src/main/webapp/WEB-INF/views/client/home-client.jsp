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
	    <a href="/client/shirts">Shirts</a>
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





<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</body>
</html>