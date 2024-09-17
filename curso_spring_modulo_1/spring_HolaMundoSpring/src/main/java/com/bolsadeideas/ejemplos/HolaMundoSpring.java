package com.bolsadeideas.ejemplos;

import java.io.FileInputStream;
import java.util.Properties;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.PropertiesBeanDefinitionReader;

public class HolaMundoSpring {

	public static void main(String[] args) throws Exception {

		// obtenemos el bean factory
		BeanFactory factory = getBeanFactory();

		ImprimeMensaje mr = (ImprimeMensaje) factory.getBean("renderer");
		ProveedorMensaje mp = (ProveedorMensaje) factory.getBean("proveedor");

		mr.setProveedorMensaje(mp);
		mr.imprimir();
	}

	// Fábrica de Spring que crea y almacena los beans definidos en el archivo de propiedades "beans.properties"
	private static BeanFactory getBeanFactory() throws Exception {
		// obtenemos bean factory - la comprensión de DefaultListableBeanFactory
		// no es realmente importante. Es sólo una clase de fábrica de Spring
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory();

		// creamos la clase para leer el properties
		PropertiesBeanDefinitionReader rdr = new PropertiesBeanDefinitionReader(factory);

		Properties props = new Properties();
		props.load(new FileInputStream("beans.properties"));

		rdr.registerBeanDefinitions(props);

		return factory;
	}
}