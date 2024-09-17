package com.bolsadeideas.ejemplos.controllers;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import com.bolsadeideas.ejemplos.domain.Estudiante;

@Controller
@RequestMapping("/estudiante")
public class EstudianteController {

	// Metodo handler formulario, para crear al estudiante
	@RequestMapping(method = RequestMethod.GET)
	public String getCreateForm(ModelMap model) {

		Estudiante estudiante = new Estudiante();

		estudiante.setDireccion("Av. Keneddy");
		estudiante.setTemas(new String[] { "Matematicas" });
		estudiante.setGenero("H");
		estudiante.setExperienciaSpring("Spring MVC");
		estudiante.setValorSecreto("Algun valor oculto");

		// Guardamos al objeto comando como "estudianteCommand" el cual
		// sera accesible en la vista estudianteForm.
		model.addAttribute("estudianteCommand", estudiante);

		// retornamos la vista form
		return "estudianteForm";
	}

	// Metodo handler que procesa el envio de datos del form
	// En este caso, la anotación "@ModelAttribute" crea de forma global el atributo de modelo "estudianteCommand"
	// De esta forma, dicho atributo se podrá usar en cualquiera de las vistas de la aplicación
	@RequestMapping(method = RequestMethod.POST)
	public String processSubmit(@Valid
			@ModelAttribute("estudianteCommand") Estudiante estudiante,
			BindingResult result, SessionStatus status) {

		if (result.hasErrors()) {
			// Si ocurre un error en la validacion retornamos al formulario
			// con los mensajes de error.
			return "estudianteForm";
		} else {
			status.setComplete();
			// Si pasa bien la validacion, retornamos "estudianteOk"
			return "estudianteOk";
		}
	}

	// La anotacion "@ModelAttribute" une o relaciona
	// un parametro de un metodo handler (@RequestMapping) o un valor
	// de retorno en un metodo hacia un "nombrado" atributo del model.
	// En este caso, la anotación "@ModelAttribute" crea de forma global el atributo de modelo "listaTemas" con aquello que devuelva este método
	// De esta forma, este atributo puede ser usado en cualquier vista de la aplicación
	@ModelAttribute("listaTemas")
	public List<String> llenarListaTemas() {

		// Data reference de temas para llenar checkboxes
		List<String> listaTemas = new ArrayList<String>();
		listaTemas.add("Matematicas");
		listaTemas.add("Ciencia");
		listaTemas.add("Arte");
		listaTemas.add("Musica");
		listaTemas.add("Deporte");

		return listaTemas;
	}

	// En este caso, la anotación "@ModelAttribute" crea de forma global el atributo de modelo "listaNumeros" con aquello que devuelva este método
	// De esta forma, este atributo puede ser usado en cualquier vista de la aplicación
	@ModelAttribute("listaNumeros")
	public List<String> llenarListaNumeros() {

		// Data reference de numeros para radiobuttons
		List<String> numeros = new ArrayList<String>();
		numeros.add("Numero 1");
		numeros.add("Numero 2");
		numeros.add("Numero 3");
		numeros.add("Numero 4");
		numeros.add("Numero 5");
		numeros.add("Numero 6");
		numeros.add("Numero 7");

		return numeros;
	}

	// En este caso, la anotación "@ModelAttribute" crea de forma global el atributo de modelo "experienciaSpring" con aquello que devuelva este método
	// De esta forma, este atributo puede ser usado en cualquier vista de la aplicación
	@ModelAttribute("experienciaSpring")
	public Map<String, String> llenarListaExperienciaSpring() {

		// Data reference de experiencias spring para list box
		Map<String, String> experienciaSpring = new LinkedHashMap<String, String>();
		experienciaSpring.put("Spring Core", "Spring Core");
		experienciaSpring.put("Spring MVC", "Spring MVC");
		experienciaSpring.put("Spring Roo", "Spring Roo");
		experienciaSpring.put("Hibernate", "Hibernate");

		return experienciaSpring;
	}

	// En este caso, la anotación "@ModelAttribute" crea de forma global el atributo de modelo "listaPaises" con aquello que devuelva este método
	// De esta forma, este atributo puede ser usado en cualquier vista de la aplicación
	@ModelAttribute("listaPaises")
	public Map<String, String> llenarPaises() {

		// Data reference de paises para list box
		Map<String, String> paises = new LinkedHashMap<String, String>();
		paises.put("CL", "Chile");
		paises.put("ES", "España");
		paises.put("MX", "México");
		paises.put("US", "United Stated");
		paises.put("AR", "Argentina");

		return paises;
	}

}