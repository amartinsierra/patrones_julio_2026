package com.cursopatrones.decorador.decorador;

import com.cursopatrones.decorador.interfaz.Ordenador;

public class DecoradorDisco extends DecoradorBase {
    
    public DecoradorDisco(Ordenador componente) {
        super(componente);
        
    }
    @Override
    public String getDescripcion() {
        return getComponente().getDescripcion()+" más disco SSD";
    }
    @Override
    public double getPrecio() {
        return getComponente().getPrecio()+200;
    }
}
