package com.bolsadeideas.ejemplos.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("direcciones")
public class MisDirecciones implements IDirecciones {
	
	@Autowired
	private List<Direccion> direcciones;

	@Override
	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	@Override
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones; 
	}

}
