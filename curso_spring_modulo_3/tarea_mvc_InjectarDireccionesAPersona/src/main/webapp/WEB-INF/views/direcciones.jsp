<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Direcciones de ${nombre}!</title>
	<!-- Bootstrap -->
	<link rel="stylesheet"
	      href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Direcciones de ${nombre}!</div>
			<div class="panel-body">
			    <p>
					<a href="persona">volver</a>
				</p>
				<table class="table table-striped table-hover table-bordered">
					<thead>
						<tr>
							<th>Calle</th>
							<th>Ciudad</th>
							<th>País</th>
						</tr>
					</thead>
					<tbody >
						<c:forEach items="${direcciones}" var="direccion">
							<tr >
								<td>${direccion.calle}, ${direccion.numero}</td>
								<td>${direccion.ciudad}</td>
								<td>${direccion.pais}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>