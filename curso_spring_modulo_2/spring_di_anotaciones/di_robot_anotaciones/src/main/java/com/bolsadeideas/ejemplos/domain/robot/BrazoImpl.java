package com.bolsadeideas.ejemplos.domain.robot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component("brazo")
public class BrazoImpl implements Brazo {

    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void mover() {
        System.out.println("Moviendo el brazo : " + tipo);
    }
}
