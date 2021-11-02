<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>login</title>
		<style>
            body{
                margin:0;
            }
			.container{
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
				margin-top:15px;
	        }
	         .form{
                width:500px;
            }


        </style>
<head>
<%@include file="header.jsp"%>
<body>
<div class="container" style="width:650px;">
		<form:form class="form" method="POST" action="/process" modelAttribute="client">
					<h1 style="text-align:center; margin-top:10px">Logo</h1>
					<form:label class="form-label mt-4" path="username">Email</form:label>
					<form:input class="form-control" placeholder="Enter email" kl_ab.original_type="email" path="username"/>

					<form:label class="form-label mt-4" path="password">Password</form:label>
					<form:input type="password" class="form-control" placeholder="Password" path="password"/>
					<div id="submit">
						<input type="submit" class="btn btn-dark"  value="Submit"/>
					</div>
		</form:form>
	</div>
</body>
</html>