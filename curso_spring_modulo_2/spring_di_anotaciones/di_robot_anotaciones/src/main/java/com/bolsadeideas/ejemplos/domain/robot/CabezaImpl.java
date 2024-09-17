package com.bolsadeideas.ejemplos.domain.robot;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Scope("prototype")
@Component("cabeza")
public class CabezaImpl implements Cabeza {

    public void mover() {
        System.out.println("Moviendo la cabeza");
    }

    public void pensar() {
        System.out.println("Pensando.....");
    }
}
