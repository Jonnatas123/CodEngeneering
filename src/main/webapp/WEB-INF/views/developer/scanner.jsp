<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body {
	color: #FFFFFF;
}

.form {
	font-family: Helvetica sans-serif;
	font-size: 18px;
	width: 100%;
	height: 100%;
	text-align: left;
	color: #FFFFFF;
}
.select {
	width: 250px;
	height: 30px;
}

.button {
	background-color: #191970;
	width: 150px;
	height: 25px;
	color: #FFFFFF;
}
.textarea{
	width: 100%;
	height: 500px;
}
</style>
</head>
<body>
	<div class="codFonte">
		<h3>Analyze</h3>
		<form class="form">
			<label>Language: </label>
			<select class="select">
				<option value="0">Java<option>
				<option value="1">Python<option>
				<option value="2">PHP<option>
			</select><p />
			<label>Código Fonte:</label><br />
			<textarea class="textarea"></textarea><p />
			<button value="submit" class="button">Analyze
			</button>
		</form>
	</div>
</body>
</html>