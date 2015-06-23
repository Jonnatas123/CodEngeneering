 <%@ taglib uri="http://www.springframework.org/tags"  prefix="spring"%>
 <%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@ taglib uri="http://java.sun.com/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body{
	color: #FFFFFF;
}
.form{
	font-family: Helvetica sans-serif;
	font-size: 18px;
	width: 100%;
	height: 100%;
	text-align: left;
	color: #FFFFFF;
}
.input{
	width: 250px;
	height: 40px;
}
.select{
	width: 250px;
	height: auto;
}
.button{
	background-color: #191970;
	width: 150px;
	height: 25px;
}
.button label{
	color: #FFFFFF;
}
</style>
</head>
<body>
	<h3>New Project</h3>
	<div class="form">
		<form:form name="project" modelAttribute="project">
			<label>Name: </label><br />
			<form:input class="input" path="name" placeholder="Name"/><p />
			<label>Descrição: </label><br />
			<form:input path="descricao" class="input" placeholder="Descricão"/><p />
			<label>Desenvolvedores</label><br />
			<form:select path="desenvolvedores" class="select"></form:select><p />
			<form:button value="salvar" class="button">
			<label>Save</label></form:button>
		</form:form>
	</div>
</body>
</html>