package com.cursopatrones.decorador.decorador;

import com.cursopatrones.decorador.interfaz.Ordenador;

public abstract class DecoradorBase implements Ordenador {
    private Ordenador componente;
    public DecoradorBase(Ordenador componente) {
        super();
        this.componente = componente;
    }
    protected Ordenador getComponente(){return componente;}
    @Override
    public String getDescripcion() {
        return componente.getDescripcion();
    }
    @Override
    public double getPrecio() {
        return componente.getPrecio();
    }
}
