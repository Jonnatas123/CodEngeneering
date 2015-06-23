<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<style type="text/css">
body{
	background-color: #191919;
	color: #FFFFFF;
}

.formLogin{
	width:400px;
	height: 200px;
	text-align: left;
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
.Erro{
	color: red;
}
</style>
<title>Login</title>
</head>
<body>
	<h3>CodEngeneering</h3>
	<div class="formLogin">
		<h3>Login</h3><p />
		<form:form name="user" modelAttribute="user">
			<label class="Erro">${Erros }</label><p/>
			<label>Username: </label><br />
			<form:input path="username" placeholder="UserName" class="input"/>

			<p />
			<label>Password:</label><br />
			<form:input path="password" placeholder="Password" class="input" type="password"/>

			<p />
			<form:button value="logar" class="button"><label>Login</label></form:button>
		</form:form>
	</div>

</body>
</html>