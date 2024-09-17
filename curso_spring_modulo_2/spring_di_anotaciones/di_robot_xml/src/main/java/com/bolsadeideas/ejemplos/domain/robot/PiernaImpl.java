package com.bolsadeideas.ejemplos.domain.robot;


public class PiernaImpl implements Pierna {

    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void arrodillarse() {
        System.out.println("Arrodillando la pierna : " + tipo);
    }

    public void saltar() {
        System.out.println("Saltando con la pierna : " + tipo);
    }

    public void correr() {
        System.out.println("Corriendo con la pierna : " + tipo);
    }
}
