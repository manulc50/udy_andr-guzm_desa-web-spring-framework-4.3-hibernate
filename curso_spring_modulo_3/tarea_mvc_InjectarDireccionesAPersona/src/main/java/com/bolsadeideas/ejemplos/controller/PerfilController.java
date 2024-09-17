package com.bolsadeideas.ejemplos.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.bolsadeideas.ejemplos.domain.Persona;


@Controller
public class PerfilController {
	
	private final Persona persona;
	
	@Autowired
	public PerfilController(Persona persona) {
		this.persona = persona;
	}
	
	// Como a este método no se le ha especificado el nombre de la vista a renderizar(no devuelve nada), se asume que el nombre de la vista es el nombre de la ruta
	// Es decir, en este caso, como la ruta es "/inicio", se asume que el nombre de la vista es "inicio"
	@RequestMapping(value = "/inicio", method = RequestMethod.GET)
	public void inicio(Locale locale, Model model) {
		Date fecha = new Date();
		DateFormat formatoFecha = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.MEDIUM, locale);	
		String fechaFormateada = formatoFecha.format(fecha);
		
		model.addAttribute("fecha", fechaFormateada );
		
	}
	
	@RequestMapping(value = "/persona", method = RequestMethod.GET)
	public String persona(Map<String, Object> map) {
		map.put("persona", persona);
		
		return "persona";
	}
	
	@RequestMapping(value = "/direcciones", method = RequestMethod.GET)
	public ModelAndView direcciones() {
		ModelAndView modelAndView = new ModelAndView("direcciones");
		modelAndView.addObject("nombre", persona.getNombre());
		modelAndView.addObject("direcciones", persona.getMisDirecciones().getDirecciones());
		
		return modelAndView;
	}
	
}
