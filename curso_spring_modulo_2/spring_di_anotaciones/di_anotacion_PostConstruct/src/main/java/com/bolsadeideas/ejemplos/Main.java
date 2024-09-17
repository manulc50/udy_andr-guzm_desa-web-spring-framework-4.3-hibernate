package com.bolsadeideas.ejemplos;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("/beans.xml");
		Persona persona = (Persona) ctx.getBean("persona");
		System.out.println(getInfoPersona(persona));
		((ClassPathXmlApplicationContext) ctx).close(); // Aquí se invoca al método anotado con @PreDestroy del bean de Spring correspondiente a la clase "Direccion"
	}

	public static String getInfoPersona(Persona persona) {
		return "Nombre:" + persona.getNombre() + "\n" + "Edad:"
				+ persona.getEdad() + "\n" + "Peso: " + persona.getPeso()
				+ "\n" + "Es Programador?: " + persona.isProgramador() + "\n"
				+ "Direccion: " + persona.getDireccion().getNumero() + " "
				+ persona.getDireccion().getCalle() + " "
				+ persona.getDireccion().getCiudad() + " "
				+ persona.getDireccion().getPais();
	}
}