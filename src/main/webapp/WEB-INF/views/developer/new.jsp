<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
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

.input {
	width: 250px;
	height: 40px;
}

.select {
	width: 250px;
	height: 30px;
}

.button {
	background-color: #191970;
	width: 150px;
	height: 25px;
}

.button label {
	color: #FFFFFF;
}
</style>
</head>
<body>
	<h3>New Developer</h3>
	<div class="form">
		<form:form name="desenvolvedor" modelAttribute="desenvolvedor">
			<label>Name: </label>
			<br />
			<form:input path="name" class="input" placeholder="Name"/>
			<p />
			<label>RG: </label><br />
			<form:input path="rg" placeholder="RG" class="input"/><p />
			<label>CPF: </label><br />
			<form:input path="cpf" placeholder="CPF" class="input"/><p />
			<label>Nível: </label>
			<br />
			<form:select path="nivel" class="select">
				<form:option value="Junior">Junior</form:option>
				<form:option value="Pleno">Pleno</form:option>
				<form:option value="Sênior">Sênior</form:option>
			</form:select>
			<p />
			<label>Função: </label><br />
			<form:input path="funcao" placeholder="Função" class="input"/><p />
			<label>Username: </label><br />
			<form:input path="username" placeholder="Username" class="input"/><p />
			<label>Password: </label><br />
			<form:input type="password" path="password" placeholder="Password" class="input"/><p />
			<form:button value="new" class="button">
				<label>Save</label>
			</form:button>
		</form:form>
	</div>
</body>
</html>