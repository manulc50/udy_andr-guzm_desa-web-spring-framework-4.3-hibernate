<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Perfil de ${persona.nombre}!</title>
	<!-- Bootstrap -->
	<link rel="stylesheet"
	  	  href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>
    <div class="container">
		<div class="panel panel-primary">
			<div class="panel-heading">Perfil de ${persona.nombre}!</div>
			<div class="panel-body">
				<p>
					<a href="inicio">volver</a>
				</p>
				<p>Nombre: ${persona.nombre}</p>
				<p>Edad: ${persona.edad}</p>
				<p>Peso: ${persona.peso}</p>
				<p>Es programador?: ${persona.programador}</p>
				<p>
					Para ver las direcciones, <a href="direcciones">clic aquí</a>.
				</p>
			</div>
		</div>
	</div>
</body>
</html>