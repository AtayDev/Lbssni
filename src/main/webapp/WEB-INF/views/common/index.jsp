<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
        <style>
        .container{
			margin-top:30px;
			margin-bottom:100px;
            display:flex;
            flex-direction:row;
            flex-wrap:wrap;
             gap:30px;
        }
        .cat{
            border-radius:20px;
            margin:auto;
            height:200px;
            width:200px;
            text-align:center;


        }

        </style>
    </head>
    <body>
        <%@ include file="header.jsp" %>
		<h2 style="text-align: center; margin-top: 50px;">Recommended Styles Just for you</h2>
		<h6 style="text-align: center; margin-top: 50px;"> Here are our different clothing categories</h6>
		<div class="container" style="width:800px;">
			<div class="cat" style="background:red;"></div>
			<div class="cat" style="background:green;"></div>
			<div class="cat" style="background:blue;"></div>
			<div class="cat" style="background:yellow;"></div>
			<div class="cat" style="background:pink;"></div>
			<div class="cat" style="background:grey;"></div>
		</div>
    </body>
</html>
