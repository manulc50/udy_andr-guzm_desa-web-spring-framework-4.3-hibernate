package com.bolsadeideas.ejemplos;


public class HolaMundoProveedorMensaje implements ProveedorMensaje {
		
	private ProveedorSaludo proveedorSaludo;

	public String getMensaje() {
		return proveedorSaludo.getSaludo();
	}


	@Override
	public void setProveedorSaludo(ProveedorSaludo proveedor) {
		this.proveedorSaludo = proveedor;
		
	}

	@Override
	public ProveedorSaludo getProveedorSaludo() {
		return proveedorSaludo;
	}

}