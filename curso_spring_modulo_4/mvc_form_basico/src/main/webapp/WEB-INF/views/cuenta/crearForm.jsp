<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>mvc_form_basico</title>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>

	<div class="container">
		<div class="page-header">
			<h1>
				Formulario Básico <small>mvc_form_basico</small>
			</h1>
		</div>
		<div class="panel panel-primary">
			<div class="panel-heading">Crear Cuenta</div>
			<div class="panel-body">
				<div class="container">
					<div class="row">
						<!-- El objeto del model "cuenta" se crea dentro del metodo "crearCuentaForm(Model model)"
			                 de la clase controladora "CuentaController". -->
			            <!-- Asocia el objeto "cuenta", que es pasado desde controlador, a este formaulario -->
						<form:form modelAttribute="cuenta" action="cuenta" method="post"
							cssClass="form-horizontal" role="form">
							<div class="form-group">
								<form:label for="nombre" path="nombre"
									cssClass="col-sm-2 control-label">Nombre</form:label>
								<div class="col-sm-10">
								    <!-- Este input está ascoiado a la propiedad "nombre" del objeto "cuenta" debido al atributo "path" -->
									<form:input path="nombre" style="width: 300px;"
										cssClass="form-control"
										cssErrorClass="form-control alert-danger" />
								    <!-- Para validar el campo a través de la propiedad "nombre" del objeto "cuenta"-->
									<form:errors path="nombre" />
								</div>
							</div>
							<div class="form-group">
								<form:label for="saldo" path="saldo"
									cssClass="col-sm-2 control-label">Saldo</form:label>
								<div class="col-sm-10">
									<!-- Este input está ascoiado a la propiedad "saldo" del objeto "cuenta" debido al atributo "path" -->
									<form:input path="saldo" style="width: 300px;"
										cssClass="form-control"
										cssErrorClass="form-control alert-danger" />
								    <!-- Para validar el campo a través de la propiedad "saldo" del objeto "cuenta"-->
									<form:errors path="saldo" />
								</div>
							</div>
							<div class="form-group">
								<form:label for="nivelEndeudamiento" path="nivelEndeudamiento"
									cssClass="col-sm-2 control-label">Nivel Endeudamiento</form:label>
								<div class="col-sm-10">
								    <!-- Este input está ascoiado a la propiedad "nivelEndeudamiento" del objeto "cuenta" debido al atributo "path" -->
									<form:input path="nivelEndeudamiento" style="width: 300px;"
										cssClass="form-control"
										cssErrorClass="form-control alert-danger" />
								    <!-- Para validar el campo a través de la propiedad "nivelEndeudamiento" del objeto "cuenta"-->
									<form:errors path="nivelEndeudamiento" />
								</div>
							</div>
							<div class="form-group">
								<form:label for="fechaRenovacion" path="fechaRenovacion"
									cssClass="col-sm-2 control-label">Fecha Renovación</form:label>
								<div class="col-sm-10">
								    <!-- Este input está ascoiado a la propiedad "fechaRenovacion" del objeto "cuenta" debido al atributo "path" -->
									<form:input path="fechaRenovacion" style="width: 300px;"
										cssClass="form-control"
										cssErrorClass="form-control alert-danger" />
									<!-- Para validar el campo a través de la propiedad "fechaRenovacion" del objeto "cuenta" -->
									<form:errors path="fechaRenovacion" />
								</div>
							</div>

							<div class="form-group">
								<div class="col-sm-offset-2 col-sm-10">
									<input type="submit" value="Crear Cuenta"
										class="btn btn-primary" role="button" />
								</div>
							</div>
						</form:form>
					</div>
				</div>
			</div>
		</div>

	</div>

</body>
</html>