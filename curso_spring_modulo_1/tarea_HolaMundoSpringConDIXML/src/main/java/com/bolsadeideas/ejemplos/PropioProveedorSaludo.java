package com.bolsadeideas.ejemplos;

public class PropioProveedorSaludo implements ProveedorSaludo {
	
	private String saludo;

	@Override
	public String getSaludo() {
		return this.saludo;
	}

	@Override
	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}

}
