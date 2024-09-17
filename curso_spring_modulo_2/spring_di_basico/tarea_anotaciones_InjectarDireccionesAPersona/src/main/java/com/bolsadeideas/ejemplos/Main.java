package com.bolsadeideas.ejemplos;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		BeanFactory factory = new ClassPathXmlApplicationContext("/beans.xml");
		Persona persona = (Persona) factory.getBean("persona");
		System.out.println(getInfoPersona(persona));
	}

	public static String getInfoPersona(Persona persona) {
		String info = "Nombre:" + persona.getNombre() + "\n" + "Edad:"
				+ persona.getEdad() + "\n" + "Peso: " + persona.getPeso()
				+ "\n" + "Es Programador?: " + persona.isProgramador() + "\n"
				+ "Direcciones:\n";
		
		for(Direccion direccion: persona.getMisDirecciones().getDirecciones()) {
			info += direccion.getNumero() + " "
			+ direccion.getCalle() + " "
			+ direccion.getCiudad() + " "
			+ direccion.getPais() + "\n";
		}
		
		return info;
	}
}