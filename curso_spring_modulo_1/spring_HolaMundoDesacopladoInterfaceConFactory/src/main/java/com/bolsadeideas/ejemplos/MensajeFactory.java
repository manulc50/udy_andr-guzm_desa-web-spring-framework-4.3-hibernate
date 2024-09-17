package com.bolsadeideas.ejemplos;

import java.io.FileInputStream;
import java.util.Properties;

public class MensajeFactory {

	private static MensajeFactory instance = null;
	private Properties props = null;
	private ImprimeMensaje renderer = null;
	private ProveedorMensaje proveedor = null;

	private MensajeFactory() {
		props = new Properties();

		try {
			props.load(new FileInputStream("msf.properties"));

			// Obtenemos las clases CONCRETAS de implementacion.
			String rendererClass = props.getProperty("renderer.class");
			String proveedorClass = props.getProperty("proveedor.class");

			// Crea instancias de las clases obtenidas en el paso anterior
			renderer = (ImprimeMensaje) Class.forName(rendererClass)
					.getDeclaredConstructor()
					.newInstance();
			proveedor = (ProveedorMensaje) Class.forName(proveedorClass)
					.getDeclaredConstructor()
					.newInstance();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	static {
		instance = new MensajeFactory();
	}

	public static MensajeFactory getInstance() {
		return instance;
	}

	public ImprimeMensaje getRendererMensaje() {
		return renderer;
	}

	public ProveedorMensaje getProveedorMensaje() {
		return proveedor;
	}

}