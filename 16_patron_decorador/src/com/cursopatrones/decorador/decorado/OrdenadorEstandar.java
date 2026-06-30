package com.cursopatrones.decorador.decorado;

import com.cursopatrones.decorador.interfaz.Ordenador;

public final class OrdenadorEstandar implements Ordenador{
    @Override
    public String getDescripcion() {    
        return "Ordenador con configuración estandar";
    }
    @Override
    public double getPrecio() {
        return 500;
    }
}

