package com.cursopatrones.flyweight.factoria;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.cursopatrones.flyweight.implementacion.UsoIVAConcreto;
import com.cursopatrones.flyweight.interfaz.UsoIVA;

public class UsoIVAFactory {
    public final static Map<String, UsoIVA> cache = new ConcurrentHashMap<>();
    public static UsoIVA obtenerUso(String tipo) {
        return cache.computeIfAbsent(tipo, k -> {
            // Simular carga de config externa
            double porcentaje = switch (k) {
                case "superreducido" -> 0.04;
                case "reducido" -> 0.1;
                case "estandar" -> 0.21;
                default -> 0.5;
            };
            return new UsoIVAConcreto(porcentaje);
        });
    }
}
