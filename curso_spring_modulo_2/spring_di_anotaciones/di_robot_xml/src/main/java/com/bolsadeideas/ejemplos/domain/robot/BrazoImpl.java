package com.bolsadeideas.ejemplos.domain.robot;


public class BrazoImpl implements Brazo {

    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mover() {
        System.out.println("Moviendo el brazo : " + tipo);
    }
}
