package com.cursopatrones.flyweight.implementacion;

import com.cursopatrones.flyweight.interfaz.UsoIVA;

public class UsoIVAConcreto implements UsoIVA {
    private final double porcentaje;
    public UsoIVAConcreto(double porcentaje) {
        this.porcentaje = porcentaje;
    }
    @Override
    public double aplicarIVA(double baseImponible) {
        return baseImponible*porcentaje;
    }
}
