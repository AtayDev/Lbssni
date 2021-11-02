<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>Sign Up</title>
	<style>
    	        body{
    	            margin:0;
    	        }
    	       .container{
    	             margin-top:200px;
    	            background:#E2D5D5;
    	            display: flex;
    	            justify-content: center;
    	            align-items: center;
    	            position: absolute;
                    left: 50%;
                    top: 50%;
                    -webkit-transform: translate(-50%, -50%);
                    transform: translate(-50%, -50%);
                    border-radius:4px;
    	       }
    	       #submit{
    	            text-align:center;
    	            margin-top:50px;
    	       }
    	       .form{
    	            width:500px;
    	       }
    	       .input-bg{
    	            background:red;
    	       }
    	    </style>

<head>
<%@include file="header.jsp"%>

<body>
<div class="container" style="width:630px;">
	<form:form class="form" method="POST" action="success-register" modelAttribute="client">
		<h1 style="text-align:center; margin-top:10px">Logo</h1>
	    <form:label class="form-label mt-4" path="firstName">First Name</form:label>
	    <form:input style="background:#EDEDED;" class="form-control" placeholder="Enter First Name"  path="firstName"/>

		 <form:label class="form-label mt-4" path="lastName">Last Name</form:label>
         <form:input style="background:#EDEDED;"  class="form-control" placeholder="Enter Last Name"  path="lastName"/>

         <form:label class="form-label mt-4" path="phone">Phone</form:label>
         <form:input style="background:#EDEDED;" class="form-control" placeholder="Enter email"  path="phone"/>

         <form:label class="form-label mt-4" path="username">Email</form:label>
         <form:input style="background:#EDEDED;"  class="form-control" placeholder="Enter Email"  path="username"/>

         <form:label class="form-label mt-4" path="password">Password</form:label>
         <form:input style="background:#EDEDED;" type="password" class="form-control" placeholder="Enter Password"  path="password"/>
         <div id="submit">
         <input type="submit" class="btn btn-dark" value="Submit"/>
         </div>
         <h6 style="text-align:center; margin-top:10px;">Already have an account? <a href="login" style="text-decoration:none;">login<a></h6>

	</form:form>
<div>
<body>


</html>