<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CodEngeneering</title>
</head>
<style type="text/css">
body {
	text-align: center;
	background-color: #191919;
}

.menu {
	position: relative;
	margin-left: 450px;
	height: 50px;
	width: 500px;
	z-index: auto;
}

.menu ul {
	background-color: #CDC9A5;
	list-style-type: none;
	border-style: solid;
	height: 100%;
	text-align: center;
}

.menu ul li {
	float: left;
	padding: 15px;
}

.menu ul li a {
	font-size: 20px;
	color: #FFFFFF;
	text-decoration: none;
}
#container{
	margin-left: 450px;
	height: 500px;
	width: 500px;
	z-index: auto;
}
</style>
<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
<script type="text/javascript">
	function loadContent(div, content) {
		$('#' + div).load(content);
	}
</script>
<body>
<div class="logo">
		
	</div>
	<div class="menu">
		<ul>
			<li onclick="loadContent('container', '${ pageContext.request.contextPath}/developer/analyze');">Scanner</li>
			<li onclick="loadContent('container', '${ pageContext.request.contextPath}/reports/');">Report</li>
			<li onclick="loadContent('container', '${ pageContext.request.contextPath}/gerente/iniciar');">Exit</li>
		</ul>
	</div>
	<div id="container"></div>
</body>
</html>