<!DOCTYPE html>
<html lang="es">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>mvc_basico_resources</title>
<!-- Bootstrap -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
</head>
<body>

	<div class="container">

		<div class="jumbotron">
			<h1>Peticiones HTTP GET para recursos est�ticos</h1>
			<p>
				<a href="/mvc_basico_resources/recursos/ver-foto.html">/mvc_basico_resources/recursos/ver-foto.html</a>
				Aparecer� p�gina est�tica html que carga una imagen de Duke. Est� configurado como mapping de recursos (resources mapping)
				en el xml /WEB-INF/spring/appServlet/servlet-context.xml. Si
				deshabilitamos el resource mapping (coment�ndolo o borrando la
				etiqueta resources), aparecer� un error HTTP 404 .
			<p>
				<a class="btn btn-primary btn-lg" href="/mvc_basico_resources/recursos/ver-foto.html" role="button">Ver
					foto</a>
			</p>
		</div>

	</div>

</body>
</html>