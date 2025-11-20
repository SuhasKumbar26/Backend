<!Doctype html>
<html lang="en">
<head>
	<meta charset="UTP-8"/>
	<title>Servlet Tutorial</title>
	<link rel="stylesheet" href="<%= application.getContextPath()%>/css/style.css"/>
</head>
<body>
		
	<div class="container">
		<%@ include file="menu.jsp" %>
		
		<h1> Welcome to This course EveryOne</h1>
		<p>This my Servlet and jsp course is here</p>
		
		<form action="<%= application.getContextPath()%>/third" method="post">
				<input type="text" name="message" placeholder="Enter text here: "/>
				<button type="submit">Submit Here</button>
		</form>
	</div>
	<script type="text/javascript" src="<%= application.getContextPath()%>/javascript/script.js"></script>
</body>
</html>